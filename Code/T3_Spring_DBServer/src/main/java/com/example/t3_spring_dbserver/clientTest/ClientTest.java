package com.example.t3_spring_dbserver.clientTest;

import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.ISockCardService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.t3_spring_dbserver.sockProtoBuff.SockCardGrpcGrpc;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

public class ClientTest {



    public static void main(String[] args)  throws Exception{

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
        SockCardGrpcGrpc.SockCardGrpcBlockingStub stub = SockCardGrpcGrpc.newBlockingStub(channel);
        SocksComunicator.StringReq req= SocksComunicator.StringReq.newBuilder().setRequest("string").build();

        SocksComunicator.sockCard getByTitleCard = stub.getByTitle(req);
        System.out.println("get by title::"+getByTitleCard.getId());

     //  Iterator<SocksComunicator.sockCard>result =  stub.getAllSockCards(SocksComunicator.Empty.newBuilder().build());



      // for (int i = 1;result.hasNext();i++){
         //  System.out.println(result.next().getId());
      // }
       //find by id testing

   //  SocksComunicator.sockCard card = stub.getByTitle(SocksComunicator.StringReq.newBuilder().setRequest("title").build());
       //update needs testing

       //delete needs testing

/*
      SocksComunicator.sockCard updateReq = SocksComunicator.sockCard.newBuilder().setType("type")
                 .setId(11)
                .setPrice(19.72)
                .setBrand("brand")
                .setDescription("descrpition_modified")
                .setImage("image")
                .setMaterial("material")
                .setTitle("title")
                .build();

      SocksComunicator.sockCard updateResult =  stub.updateSockCard(updateReq);
        System.out.println(updateResult.getDescription());*/


      //SocksComunicator.sockCard card =   stub.getById(SocksComunicator.IntReq.newBuilder().setRequest(10).build());
      /*  SocksComunicator.Empty empty = stub.addSockCard( SocksComunicator.sockCard.newBuilder().setType("type")
                .setPrice(13.72)
                .setBrand("brand")
                .setDescription("descrpition")
                .setImage("image")
                .setMaterial("material")
                .setTitle("title")
                .build());

        System.out.println("check db");*/
    }
}
