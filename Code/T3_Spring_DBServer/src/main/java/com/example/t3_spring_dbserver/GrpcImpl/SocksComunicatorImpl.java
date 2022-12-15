package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.Socks;
import com.example.t3_spring_dbserver.service.SockCardService;
import com.example.t3_spring_dbserver.service.SocksService;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksCardComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksGrpcGrpc;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sock;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.IntReqSock;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.EmptySocksMessage;

import java.util.List;

@GRpcService
public class SocksComunicatorImpl extends SocksGrpcGrpc.SocksGrpcImplBase {

    @Autowired
    private SocksService service;

    @Autowired
    private SockCardService cardService;



    @Override
    public void create(sock req, StreamObserver<sock> streamObserver) {
        System.out.println("Received req to save socks with id::"+ req.getId());

        SockCard sockCard = cardService.getById(req.getScId());

        Socks daoSocks = new Socks(req.getId(), req.getSize(), req.getColor(), sockCard);
        Socks socks = service.createSocks(daoSocks);

        sock toSent = sock.newBuilder()
                .setId((int) socks.getId())
                .setSize(socks.getSize())
                .setColor(socks.getColor())
                .setScId((int) socks.getSockCard().getId()).build();


        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void getAll(EmptySocksMessage req, StreamObserver<sock> streamObserver) {
        System.out.println("Received req for all inventories");

        List<Socks> list = service.getAll();

        for (Socks socks:list) {
            sock protoInventory = sock.newBuilder()
                    .setId((int)socks.getId())
                    .setColor(socks.getColor())
                    .setSize(socks.getSize())
                    .setScId((int)socks.getSockCard().getId()).build();

            streamObserver.onNext(protoInventory);
            System.out.println("Inventory added to stream with id: " + protoInventory.getId());
        }
        streamObserver.onCompleted();
    }

    @Override
    public void getById(IntReqSock req, StreamObserver<sock> streamObserver) {
        System.out.println("Received get socks by id request with id: " + req.getRequest());
        Socks socks = service.getSocksById(req.getRequest());
        sock toSent = sock.newBuilder()
                .setId((int) socks.getId())
                .setColor(socks.getColor())
                .setSize(socks.getSize())
                .setScId((int)socks.getSockCard().getId()).build();

        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void deleteById(IntReqSock req, StreamObserver<EmptySocksMessage> streamObserver) {
        System.out.println("Received req to delete socks with id: " + req.getRequest());
        service.deleteById(req.getRequest());

        streamObserver.onNext(EmptySocksMessage.newBuilder().build());
        streamObserver.onCompleted();
    }
}
