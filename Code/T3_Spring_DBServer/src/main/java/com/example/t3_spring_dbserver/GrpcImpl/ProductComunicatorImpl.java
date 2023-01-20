/*
package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.entity.Product;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.service.ProductCardService;
import com.example.t3_spring_dbserver.service.SocksService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class ProductComunicatorImpl  {

    @Autowired
    private SocksService service;

    @Autowired
    private ProductCardService cardService;



    @Override
    public void create(sock req, StreamObserver<sock> streamObserver) {
        System.out.println("Received req to save socks with id::"+ req.getId());

        ProductCard sockCard = cardService.getById(req.getScId());

        Product daoSocks = new Product(req.getId(), req.getSize(), req.getColor(), sockCard);
        Product socks = service.createSocks(daoSocks);

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

        List<Product> list = service.getAll();

        for (Product product :list) {
            sock protoInventory = sock.newBuilder()
                    .setId((int) product.getId())
                    .setColor(product.getColor())
                    .setSize(product.getSize())
                    .setScId((int) product.getSockCard().getId()).build();

            streamObserver.onNext(protoInventory);
            System.out.println("Inventory added to stream with id: " + protoInventory.getId());
        }
        streamObserver.onCompleted();
    }

    @Override
    public void getById(IntReqSock req, StreamObserver<sock> streamObserver) {
        System.out.println("Received get socks by id request with id: " + req.getRequest());
        Product product = service.getSocksById(req.getRequest());
        sock toSent = sock.newBuilder()
                .setId((int) product.getId())
                .setColor(product.getColor())
                .setSize(product.getSize())
                .setScId((int) product.getSockCard().getId()).build();

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
*/
