package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.SockCardService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.SockCardGrpcGrpc.SockCardGrpcImplBase;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.*;

import java.util.List;
import java.util.stream.Stream;

@GRpcService
public class SockCardComunicatorImpl extends SockCardGrpcImplBase {


    @Autowired
    private SockCardService service;



    @Override
    public void getByTitle(StringReq req,StreamObserver<sockCard> responseStream){
        System.out.println("riecied req to get by title");
        SockCard sockCard = service.getByTitle(req.getRequest());

    }
    @Override
    public void updateSockCard(sockCard card,StreamObserver<sockCard> responseStream){
        System.out.println("reicieved req to update sock card::"+card.getId());

         SockCardDto dtoCard = new SockCardDto(card.getId(),card.getTitle()
                 ,card.getDescription(),card.getPrice()
                , card.getMaterial()
                , card.getBrand()
                , card.getImage()
                , card.getType());


        SockCard sockCard = service.updateSockCard(dtoCard);

        SocksComunicator.sockCard toSent = SocksComunicator.sockCard.newBuilder()
                .setId((int) sockCard.getId())
                .setPrice(sockCard.getPrice())
                .setBrand(sockCard.getBrand())
                .setType(sockCard.getType())
                .setDescription(sockCard.getDescription())
                .setImage(sockCard.getImage())
                .setMaterial(sockCard.getMaterial()).build();


        responseStream.onNext(toSent);
        responseStream.onCompleted();

    }

    @Override
    public void deleteSockCardById(IntReq req, StreamObserver<sockCard> responseStream){
        System.out.println("riecieved req to delete sock card with id::"+req.getRequest());

        SockCard sockCard = service.deleteSockCard(req.getRequest());

        SocksComunicator.sockCard toSent = SocksComunicator.sockCard.newBuilder()
                .setId((int) sockCard.getId())
                .setPrice(sockCard.getPrice())
                .setBrand(sockCard.getBrand())
                .setType(sockCard.getType())
                .setDescription(sockCard.getDescription())
                .setImage(sockCard.getImage())
                .setMaterial(sockCard.getMaterial()).build();


        responseStream.onNext(toSent);
        responseStream.onCompleted();


    }

    @Override
    public void getAllSockCards(Empty req, StreamObserver<sockCard> responseStream) {

        System.out.println("reicieved req for all cards");

        List<SockCard> list = service.getAllCards();

        for (SockCard sockCard:list) {
            sockCard protoCard = SocksComunicator.sockCard.newBuilder().build().newBuilder()
                    .setId((int) sockCard.getId())
                    .setPrice(sockCard.getPrice())
                    .setBrand(sockCard.getBrand())
                    .setTitle(sockCard.getTitle())
                    .setType(sockCard.getType())
                    .setDescription(sockCard.getDescription())
                    .setImage(sockCard.getImage())
                    .setMaterial(sockCard.getMaterial()).build();

            responseStream.onNext(protoCard);
            System.out.println("card added to stream with id::"+protoCard.getId());
        }
        responseStream.onCompleted();

    }
    @Override
    public void getById (IntReq req, StreamObserver<sockCard> responseStream){



        System.out.println("ricieved get by id request with id::"+req.getRequest());



            SockCard sockCard = service.getById(req.getRequest());
            SocksComunicator.sockCard toSent = SocksComunicator.sockCard.newBuilder()
                    .setId((int) sockCard.getId())
                    .setPrice(sockCard.getPrice())
                    .setBrand(sockCard.getBrand())
                    .setType(sockCard.getType())
                    .setTitle(sockCard.getTitle())
                    .setDescription(sockCard.getDescription())
                    .setImage(sockCard.getImage())
                    .setMaterial(sockCard.getMaterial()).build();



            responseStream.onNext(toSent);
            responseStream.onCompleted();

    }

    @Override
    public void addSockCard(sockCard card,StreamObserver<Empty> responseStream) {
        System.out.println("riecieved req to save card with id::"+card.getId());

        SockCard daoCard = new SockCard(card.getTitle(),card.getDescription(),card.getPrice(), card.getMaterial(), card.getBrand(), card.getImage(), card.getType());
        service.saveCard(daoCard);
        responseStream.onNext(Empty.newBuilder().build());
        responseStream.onCompleted();
    }

}
