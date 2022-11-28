package com.example.t3_spring_dbserver.clientTest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.t3_spring_dbserver.sockProtoBuff.SockCardGrpcGrpc;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator;

import java.util.Iterator;
import java.util.List;

public class ClientTest {
    public static void main(String[] args)  throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
        SockCardGrpcGrpc.SockCardGrpcBlockingStub stub = SockCardGrpcGrpc.newBlockingStub(channel);
       Iterator<SocksComunicator.sockCard>result =  stub.getAllSockCards(SocksComunicator.Empty.newBuilder().build());

       for (int i = 1;result.hasNext();i++){
           System.out.println(result.next().getId());
       }

       /* SocksComunicator.sockCard.newBuilder().setType("type")
                .setPrice(13.72)
                .setBrand("brand")
                .setDescription("descrpition")
                .setImage("image")
                .setMaterial("material")
                .setTitle("title")
                .build();
                */



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
