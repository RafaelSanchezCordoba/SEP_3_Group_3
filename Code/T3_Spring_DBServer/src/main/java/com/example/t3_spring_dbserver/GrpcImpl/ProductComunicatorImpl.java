
package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.entity.Product;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.service.ProductCardService;
import com.example.t3_spring_dbserver.service.ProductService;
import com.protoBuff.ProductComunicator.*;
import com.protoBuff.ProductGrpcGrpc.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class ProductComunicatorImpl extends ProductGrpcImplBase {

    @Autowired
    private ProductService service;

    @Autowired
    private ProductCardService cardService;



    @Override
    public void createSock(product req, StreamObserver<product> streamObserver) {
        System.out.println("Received req to save socks with id::"+ req.getId());

        ProductCard sockCard = cardService.getById(req.getPcId());

        Product daoSocks = new Product(req.getId(), req.getSize(), req.getColor(), sockCard,"sock",null);
        Product socks = service.create(daoSocks);

        product toSent = product.newBuilder()
                .setId((int) socks.getId())
                .setSize(socks.getSize())
                .setColor(socks.getColor())
                .setPcId((int) socks.getSockCard().getId()).build();


        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void createTrouser(product req, StreamObserver<product> streamObserver) {
        System.out.println("Received req to save trouser with id::"+ req.getId());

        ProductCard trousercard = cardService.getById(req.getPcId());

        Product daoTrousers = new Product(req.getId(), req.getSize(), req.getColor(), trousercard,"trouser",null);
        Product socks = service.create(daoTrousers);

        product toSent = product.newBuilder()
                .setId((int) socks.getId())
                .setSize(socks.getSize())
                .setColor(socks.getColor())
                .setPcId((int) socks.getSockCard().getId()).build();


        streamObserver.onNext(toSent);
        streamObserver.onCompleted();
    }

    @Override
    public void getAllSocks(emptyMessageProduct req, StreamObserver<product> streamObserver) {
        System.out.println("Received req for all socks");

        // cahnge to get all socks
        List<Product> list = service.getAllSocks();

        for (Product x :list) {
            product protoInventory = product.newBuilder()
                    .setId((int) x.getId())
                    .setColor(x.getColor())
                    .setSize(x.getSize())
                    .setPcId((int) x.getSockCard().getId()).build();

            streamObserver.onNext(protoInventory);
            System.out.println("Product added to stream with id: " + protoInventory.getId());
        }
        streamObserver.onCompleted();
    }

    @Override
    public void getAllTrousers(emptyMessageProduct req, StreamObserver<product> streamObserver) {
        System.out.println("Received req for all trousers");

        // cahnge to get all socks
        List<Product> list = service.getAllTrousers();

        for (Product x :list) {
            product protoInventory = product.newBuilder()
                    .setId((int) x.getId())
                    .setColor(x.getColor())
                    .setSize(x.getSize())
                    .setPcId((int) x.getSockCard().getId()).build();

            streamObserver.onNext(protoInventory);
            System.out.println("Product added to stream with id: " + protoInventory.getId());
        }
        streamObserver.onCompleted();
    }

    // impl get all trousers

    @Override
    public void getById(intReqProduct req, StreamObserver<product> streamObserver) {
        System.out.println("Received get product by id request with id: " + req.getRequest());
        Product productToSend = service.getSocksById(req.getRequest());
        product messageToSend = product.newBuilder()
                .setId((int) productToSend.getId())
                .setColor(productToSend.getColor())
                .setSize(productToSend.getSize())
                .setPcId((int) productToSend.getSockCard().getId()).build();

        streamObserver.onNext(messageToSend);
        streamObserver.onCompleted();
    }

    @Override
    public void deleteById(intReqProduct req, StreamObserver<StringMessageProduct> streamObserver) {
        System.out.println("Received req to delete socks with id: " + req.getRequest());
        service.deleteById(req.getRequest());

        streamObserver.onNext(StringMessageProduct.newBuilder().setMessage("Ok").build());
        streamObserver.onCompleted();
    }
}

