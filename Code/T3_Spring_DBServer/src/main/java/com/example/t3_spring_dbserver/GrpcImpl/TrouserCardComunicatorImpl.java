package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.DTOs.TrouserCardDto;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.entity.TrouserCard;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardComunicator.trouserCardStringReq;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardComunicator.trouserCardIntReq;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardComunicator.trouserCard;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardComunicator.trouserCardEmpty;
import com.example.t3_spring_dbserver.service.TrouserCardService;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksCardComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.TrouserCardGrpcGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class TrouserCardComunicatorImpl extends TrouserCardGrpcGrpc.TrouserCardGrpcImplBase {
    @Autowired
    private TrouserCardService service;

    @Override
    public void getByTitle(trouserCardStringReq req, StreamObserver<trouserCard> responseStream){
        System.out.println("Received req to get trouser card by title:" + req.getRequest());
        TrouserCard trouserCard = service.getByTitle(req.getRequest());

        trouserCard toSend = TrouserCardComunicator.trouserCard.newBuilder()
                .setId((int) trouserCard.getId())
                .setPrice(trouserCard.getPrice())
                .setBrand(trouserCard.getBrand())
                .setType(trouserCard.getType())
                .setDescription(trouserCard.getDescription())
                .setImage(trouserCard.getImage())
                .setMaterial(trouserCard.getMaterial()).build();

        responseStream.onNext(toSend);
        responseStream.onCompleted();


    }
    @Override
    public void updateSockCard(trouserCard card, StreamObserver<trouserCard> responseStream){
        System.out.println("Received req to update trouser card::"+card.getId());

        TrouserCardDto dtoCard = new TrouserCardDto(card.getId(),card.getTitle()
                ,card.getDescription(),card.getPrice()
                , card.getMaterial()
                , card.getBrand()
                , card.getImage()
                , card.getType());


        TrouserCard trouserCard = service.updateTrouserCard(dtoCard);

        trouserCard toSent = TrouserCardComunicator.trouserCard.newBuilder()
                .setId((int) trouserCard.getId())
                .setPrice(trouserCard.getPrice())
                .setBrand(trouserCard.getBrand())
                .setType(trouserCard.getType())
                .setDescription(trouserCard.getDescription())
                .setImage(trouserCard.getImage())
                .setMaterial(trouserCard.getMaterial()).build();


        responseStream.onNext(toSent);
        responseStream.onCompleted();

    }

    @Override
    public void deleteSockCardById(trouserCardIntReq req, StreamObserver<trouserCard> responseStream){
        System.out.println("Received req to delete trouser card with id::"+req.getRequest());

        TrouserCard trouserCard = service.deleteTrouserCard(req.getRequest());

        trouserCard toSent = TrouserCardComunicator.trouserCard.newBuilder()
                .setId((int) trouserCard.getId())
                .setPrice(trouserCard.getPrice())
                .setBrand(trouserCard.getBrand())
                .setType(trouserCard.getType())
                .setDescription(trouserCard.getDescription())
                .setImage(trouserCard.getImage())
                .setMaterial(trouserCard.getMaterial()).build();


        responseStream.onNext(toSent);
        responseStream.onCompleted();


    }

    @Override
    public void getAllSockCards(trouserCardEmpty req, StreamObserver<trouserCard> responseStream) {

        System.out.println("Received req for get all cards");

        List<TrouserCard> list = service.getAllCards();

        for (TrouserCard trouserCard:list) {
            trouserCard protoCard = TrouserCardComunicator.trouserCard.newBuilder()
                    .setId((int) trouserCard.getId())
                    .setPrice(trouserCard.getPrice())
                    .setBrand(trouserCard.getBrand())
                    .setTitle(trouserCard.getTitle())
                    .setType(trouserCard.getType())
                    .setDescription(trouserCard.getDescription())
                    .setImage(trouserCard.getImage())
                    .setMaterial(trouserCard.getMaterial()).build();

            responseStream.onNext(protoCard);
            System.out.println("Trouser card added to stream with id::"+protoCard.getId());
        }
        responseStream.onCompleted();

    }
    @Override
    public void getById (trouserCardIntReq req, StreamObserver<trouserCard> responseStream){

        System.out.println("Received get trouser card by id in grpc impl :"+req.getRequest());

        TrouserCard trouserCard = service.getById(req.getRequest());
        trouserCard toSent = TrouserCardComunicator.trouserCard.newBuilder()
                .setId((int) trouserCard.getId())
                .setPrice(trouserCard.getPrice())
                .setBrand(trouserCard.getBrand())
                .setType(trouserCard.getType())
                .setTitle(trouserCard.getTitle())
                .setDescription(trouserCard.getDescription())
                .setImage(trouserCard.getImage())
                .setMaterial(trouserCard.getMaterial()).build();

        responseStream.onNext(toSent);
        responseStream.onCompleted();

    }

    @Override
    public void addTrouserCard(trouserCard card, StreamObserver<trouserCard> responseStream) {
        System.out.println("Received req to save trouser card with id::"+card.getId());

        TrouserCard daoCard = new TrouserCard(card.getTitle(),card.getDescription(),card.getPrice(), card.getMaterial(), card.getBrand(), card.getImage(), card.getType());
        TrouserCard trouserCard = service.saveCard(daoCard);


        trouserCard toSent = TrouserCardComunicator.trouserCard.newBuilder()
                .setId((int) trouserCard.getId())
                .setPrice(trouserCard.getPrice())
                .setBrand(trouserCard.getBrand())
                .setType(trouserCard.getType())
                .setTitle(trouserCard.getBrand())
                .setDescription(trouserCard.getType())
                .setImage(trouserCard.getBrand())
                .setMaterial(trouserCard.getType()).build();

        responseStream.onNext(toSent);
        responseStream.onCompleted();
    }
}
