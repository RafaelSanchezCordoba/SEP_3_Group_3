package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.Socks;

import com.example.t3_spring_dbserver.entity.Trouser;
import com.example.t3_spring_dbserver.entity.TrouserCard;
import com.example.t3_spring_dbserver.service.TrouserCardService;
import com.example.t3_spring_dbserver.service.TrouserService;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserComunicator.trouser;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserComunicator.trouserIntReq;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserComunicator.trouserEmpty;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserGrpcGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class TrouserComunicatorImpl extends TrouserGrpcGrpc.TrouserGrpcImplBase {
    @Autowired
    private TrouserService trouserService;

    @Autowired
    private TrouserCardService cardService;



    @Override
    public void create(trouser req, StreamObserver<trouser> streamObserver) {
        System.out.println("Received req to save trouser with id::"+ req.getId());

        TrouserCard trouserCard = cardService.getById(req.getScId());

        Trouser daoTrouser = new Trouser(req.getId(), req.getSize(), req.getColor(), trouserCard);
        Trouser trouser = trouserService.createTrouser(daoTrouser);

        trouser toSent = TrouserComunicator.trouser.newBuilder()
                .setId((int) trouser.getId())
                .setSize(trouser.getSize())
                .setColor(trouser.getColor())
                .setScId((int) trouser.getTrouserCard().getId()).build();


        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void getAll(trouserEmpty req, StreamObserver<trouser> streamObserver) {
        System.out.println("Received req for all trousers");

        List<Trouser> list = trouserService.getAll();

        for (Trouser trouser:list) {
            trouser toSent = TrouserComunicator.trouser.newBuilder()
                    .setId((int)trouser.getId())
                    .setColor(trouser.getColor())
                    .setSize(trouser.getSize())
                    .setScId((int)trouser.getTrouserCard().getId()).build();

            streamObserver.onNext(toSent);
            System.out.println("Inventory added to stream with id: " + toSent.getId());
        }
        streamObserver.onCompleted();
    }

    @Override
    public void getById(trouserIntReq req, StreamObserver<trouser> streamObserver) {
        System.out.println("Received get trouser by id request with id: " + req.getRequest());
        Trouser trouser = trouserService.getTrouserById(req.getRequest());
        trouser toSent = TrouserComunicator.trouser.newBuilder()
                .setId((int) trouser.getId())
                .setColor(trouser.getColor())
                .setSize(trouser.getSize())
                .setScId((int)trouser.getTrouserCard().getId()).build();

        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void deleteById(trouserIntReq req, StreamObserver<trouserEmpty> streamObserver) {
        System.out.println("Received req to delete trouser with id: " + req.getRequest());
        trouserService.deleteById(req.getRequest());

        streamObserver.onNext(TrouserComunicator.trouserEmpty.newBuilder().build());
        streamObserver.onCompleted();
    }
}
