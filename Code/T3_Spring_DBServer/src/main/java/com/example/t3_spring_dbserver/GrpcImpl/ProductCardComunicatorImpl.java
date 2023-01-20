package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.ProductCardService;

import com.protoBuff.ProductCardComunicator;
import com.protoBuff.ProductCardComunicator.StringReqCard;
import com.protoBuff.ProductCardComunicator.productCard;
import com.protoBuff.ProductCardComunicator.Empty;
import com.protoBuff.ProductCardComunicator.IntReqCard;
import com.protoBuff.ProductCardGrpcGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class ProductCardComunicatorImpl extends ProductCardGrpcGrpc.ProductCardGrpcImplBase {

    @Autowired
    private ProductCardService service;

    @Override
    public void addSocksCard(productCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to save sock card with id::"+ request.getId());

        ProductCard card = new ProductCard(request.getTitle(), request.getDescription(), request.getPrice(), request.getMaterial(), request.getBrand(), request.getImage(), request.getType(), "sock");
        service.saveCard(card);
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void addTrouserCard(productCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to save trouser card with id::"+ request.getId());

        ProductCard card = new ProductCard(request.getTitle(), request.getDescription(), request.getPrice(), request.getMaterial(), request.getBrand(), request.getImage(), request.getType(), "trouser");
        service.saveCard(card);
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getById(IntReqCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get product card with id::"+ request.getRequest());

        ProductCard card = service.getById(request.getRequest());
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .setId((int) card.getId())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getAllSockCards(Empty request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get all sock card");
        
    }
}

