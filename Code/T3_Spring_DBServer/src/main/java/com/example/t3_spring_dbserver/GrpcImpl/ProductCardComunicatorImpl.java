/*
package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.DTOs.SockCardDto;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.service.ProductCardService;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class ProductCardComunicatorImpl {


    @Autowired
    private ProductCardService service;



  //  @Override
    public void getByTitle(SocksCardComunicator.StringReq req, StreamObserver<sockCard> responseStream){
        System.out.println("Received req to get by title:" + req.getRequest());
        ProductCard sockCard = service.getByTitle(req.getRequest());

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
  //  @Override
    public void updateSockCard(SocksCardComunicator.sockCard card, StreamObserver<SocksCardComunicator.sockCard> responseStream){
        System.out.println("reicieved req to update sock card::"+card.getId());

         SockCardDto dtoCard = new SockCardDto(card.getId(),card.getTitle()
                 ,card.getDescription(),card.getPrice()
                , card.getMaterial()
                , card.getBrand()
                , card.getImage()
                , card.getType());


        ProductCard sockCard = service.updateSockCard(dtoCard);

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

   // @Override
    public void deleteSockCardById(SocksCardComunicator.IntReq req, StreamObserver<SocksCardComunicator.sockCard> responseStream){
        System.out.println("riecieved req to delete sock card with id::"+req.getRequest());

        ProductCard sockCard = service.deleteSockCard(req.getRequest());

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

   // @Override
    public void getAllSockCards(SocksCardComunicator.Empty req, StreamObserver<SocksCardComunicator.sockCard> responseStream) {

        System.out.println("reicieved req for all cards");

        List<ProductCard> list = service.getAllSockCards();

        for (ProductCard sockCard:list) {
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
  //  @Override
    public void getById (SocksCardComunicator.IntReq req, StreamObserver<SocksCardComunicator.sockCard> responseStream){

        System.out.println("ricieved get by id request with id::"+req.getRequest());

            ProductCard sockCard = service.getById(req.getRequest());
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

    //@Override
    public void addSockCard(SocksCardComunicator.sockCard card, StreamObserver<SocksCardComunicator.sockCard> responseStream) {
        System.out.println("riecieved req to save card with id::"+card.getId());

        ProductCard daoCard = new ProductCard(card.getTitle(),card.getDescription(),card.getPrice(), card.getMaterial(), card.getBrand(), card.getImage(), card.getType(),"sock");
        ProductCard sockCard = service.saveCard(daoCard);


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
*/
