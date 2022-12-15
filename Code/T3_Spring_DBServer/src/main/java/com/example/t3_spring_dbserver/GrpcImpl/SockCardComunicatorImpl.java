package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.SockCardService;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksCardComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksCardComunicator.sockCard;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksCardGrpcGrpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class SockCardComunicatorImpl extends SocksCardGrpcGrpc.SocksCardGrpcImplBase {


    @Autowired
    private SockCardService service;



    @Override
    public void getByTitle(SocksCardComunicator.StringReq req, StreamObserver<sockCard> responseStream){
        System.out.println("Received req to get by title:" + req.getRequest());
        SockCard sockCard = service.getByTitle(req.getRequest());

        SocksCardComunicator.sockCard toSend = SocksCardComunicator.sockCard.newBuilder()
                .setId((int) sockCard.getId())
                .setPrice(sockCard.getPrice())
                .setBrand(sockCard.getBrand())
                .setType(sockCard.getType())
                .setDescription(sockCard.getDescription())
                .setImage(sockCard.getImage())
                .setMaterial(sockCard.getMaterial()).build();

        responseStream.onNext(toSend);
        responseStream.onCompleted();


    }
    @Override
    public void updateSockCard(SocksCardComunicator.sockCard card, StreamObserver<SocksCardComunicator.sockCard> responseStream){
        System.out.println("reicieved req to update sock card::"+card.getId());

         SockCardDto dtoCard = new SockCardDto(card.getId(),card.getTitle()
                 ,card.getDescription(),card.getPrice()
                , card.getMaterial()
                , card.getBrand()
                , card.getImage()
                , card.getType());


        SockCard sockCard = service.updateSockCard(dtoCard);

        SocksCardComunicator.sockCard toSent = SocksCardComunicator.sockCard.newBuilder()
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
    public void deleteSockCardById(SocksCardComunicator.IntReq req, StreamObserver<SocksCardComunicator.sockCard> responseStream){
        System.out.println("riecieved req to delete sock card with id::"+req.getRequest());

        SockCard sockCard = service.deleteSockCard(req.getRequest());

        SocksCardComunicator.sockCard toSent = SocksCardComunicator.sockCard.newBuilder()
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
    public void getAllSockCards(SocksCardComunicator.Empty req, StreamObserver<SocksCardComunicator.sockCard> responseStream) {

        System.out.println("reicieved req for all cards");

        List<SockCard> list = service.getAllCards();

        for (SockCard sockCard:list) {
            SocksCardComunicator.sockCard protoCard = SocksCardComunicator.sockCard.newBuilder().build().newBuilder()
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
    public void getById (SocksCardComunicator.IntReq req, StreamObserver<SocksCardComunicator.sockCard> responseStream){

        System.out.println("ricieved get by id request with id::"+req.getRequest());

            SockCard sockCard = service.getById(req.getRequest());
            SocksCardComunicator.sockCard toSent = SocksCardComunicator.sockCard.newBuilder()
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
    public void addSockCard(SocksCardComunicator.sockCard card, StreamObserver<SocksCardComunicator.sockCard> responseStream) {
        System.out.println("riecieved req to save card with id::"+card.getId());

        SockCard daoCard = new SockCard(card.getTitle(),card.getDescription(),card.getPrice(), card.getMaterial(), card.getBrand(), card.getImage(), card.getType());
        SockCard sockCard = service.saveCard(daoCard);


        SocksCardComunicator.sockCard toSent = SocksCardComunicator.sockCard.newBuilder()
                .setId((int) sockCard.getId())
                .setPrice(sockCard.getPrice())
                .setBrand(sockCard.getBrand())
                .setType(sockCard.getType())
                .setTitle(sockCard.getBrand())
                .setDescription(sockCard.getType())
                .setImage(sockCard.getBrand())
                .setMaterial(sockCard.getType()).build();
        responseStream.onNext(toSent);
        responseStream.onCompleted();
    }

}
