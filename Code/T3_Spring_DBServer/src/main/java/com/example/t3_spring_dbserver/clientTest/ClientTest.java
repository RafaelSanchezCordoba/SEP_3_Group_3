package com.example.t3_spring_dbserver.clientTest;

import com.google.protobuf.GeneratedMessageV3;

import com.protoBuff.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.protoBuff.ProductCardComunicator;
import com.protoBuff.ProductCardComunicator.StringReqCard;
import com.protoBuff.ProductCardComunicator.productCard;
import com.protoBuff.ProductCardComunicator.Empty;
import com.protoBuff.ProductCardComunicator.IntReqCard;

public class ClientTest {



    public static void main(String[] args)  throws Exception{

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
       /* SocksCardGrpcGrpc.SocksCardGrpcBlockingStub stub = SocksCardGrpcGrpc.newBlockingStub(channel);
        SocksGrpcGrpc.SocksGrpcBlockingStub socksStub = SocksGrpcGrpc.newBlockingStub(channel);
        SocksCardComunicator.StringReq req= SocksCardComunicator.StringReq.newBuilder().setRequest("string").build();


        inventoryStub.create(SocksInventoryComunicator.inventory.newBuilder()
                .setId(3).setColor("b").setSize("M").setCardId(3).build());

        */
        ProductCardGrpcGrpc.ProductCardGrpcBlockingStub productCardStub = ProductCardGrpcGrpc.newBlockingStub(channel);


        // Create Product Card
        productCard productCardEmpty = productCardStub.addSockCard(productCard.newBuilder()
                .setTitle("asdf")
                .setDescription("sdfs")
                .setBrand(" sdfsd")
                .setMaterial("sdf")
                .setImage("sdfs")
                .setType("trsadf")
                .setPrice(22.33)
                .build());
        System.out.println("Product card saved: " + productCardEmpty.toString());

        // Get all inventories
//        Iterator<com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory> result =  inventoryStub.getAll(EmptyInventoryMessage.newBuilder().build());
//        for (int i = 1;result.hasNext();i++){
//            System.out.println(result.next().getId());
//        }

//        InventoryGrpcGrpc.InventoryGrpcBlockingStub inventoryStub = InventoryGrpcGrpc.newBlockingStub(channel);
//        inventoryStub.create(SocksInventoryComunicator.inventory.newBuilder()
//                .setSize("m")
//                .setColor("greenb")
//                .setId(2)
//                .setQuantity(44)
//                .setCardId(1).build());


//        com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard getByTitleCard = stub.getByTitle(req);
//        System.out.println("get by title::"+getByTitleCard.getId());

     //  Iterator<com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard>result =  stub.getAllSockCards(com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.Empty.newBuilder().build());



      // for (int i = 1;result.hasNext();i++){
         //  System.out.println(result.next().getId());
      // }
       //find by id testing

   //  com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard card = stub.getByTitle(com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.StringReq.newBuilder().setRequest("title").build());
       //update needs testing

       //delete needs testing

/*
      com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard updateReq = com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard.newBuilder().setType("type")
                 .setId(11)
                .setPrice(19.72)
                .setBrand("brand")
                .setDescription("descrpition_modified")
                .setImage("image")
                .setMaterial("material")
                .setTitle("title")
                .build();

      com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard updateResult =  stub.updateSockCard(updateReq);
        System.out.println(updateResult.getDescription());*/


//      com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.sockCard card =   stub.getById(com.example.t3_spring_dbserver.sockProtoBuff.com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.IntReq.newBuilder().setRequest(10).build());
//        Empty empty = stub.addSockCard(sockCard.newBuilder().setType("type")
//                .setPrice(13.72)
//                .setBrand("brand")
//                .setDescription("descrpition")
//                .setImage("image")
//                .setMaterial("material")
//                .setTitle("title")
//                .build());
//
//        System.out.println("Added socksCard, check your db");


        // Create Inventory
//        com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.EmptyInventoryMessage inventoryEmpty = inventoryStub.create(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory.newBuilder()
//                .setColor("red").setSize("xs").setQuantity(3).setCardId(1).build());
//
//        System.out.println("Check db");

        // Get all inventories
//        Iterator<com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory> result =  inventoryStub.getAll(EmptyInventoryMessage.newBuilder().build());
//        for (int i = 1;result.hasNext();i++){
//            System.out.println(result.next().getId());
//        }

        // Get inventory by id
//        com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory inv = inventoryStub.getById(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.IntReqInventory.newBuilder().setRequest(5).build());
//
//        System.out.println(inv);

        // Update Inventory
//        com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory updateReq = com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory.newBuilder()
//                .setId(7)
//                .setColor("orange")
//                .setSize("m")
//                .setQuantity(12)
//                .setCardId(2)
//                .build();
//
//        EmptyInventoryMessage updateResult =  inventoryStub.updateInventory(updateReq);
//        System.out.println(updateResult);

        // Delete inventory by id
//        EmptyInventoryMessage deleteReq = inventoryStub.deleteById(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.IntReqInventory.newBuilder().setRequest(4).build());
//
//        System.out.println(deleteReq);

        // Get by card id
//        Iterator<com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory> result =  inventoryStub.getByCardId(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.IntReqInventory.newBuilder().setRequest(1).build());
//        for (int i = 1;result.hasNext();i++) {
//            System.out.println(result);
//        }

        // Delete inventory by card id
//        SocksInventoryComunicator.EmptyInventoryMessage deleteReq = inventoryStub.deleteByCardId(SocksInventoryComunicator.IntReqInventory.newBuilder().setRequest(1).build());

        // Create Socks
//        EmptySocksMessage socksEmpty = socksStub.create(SocksComunicator.sock.newBuilder()
//                .setColor("blue").setSize("l").setScId(2).build());
//        System.out.println("Added socks, check your db");

        // Get all socks
//        Iterator<sock> result =  socksStub.getAll(EmptySocksMessage.newBuilder().build());
//        for (int i = 1;result.hasNext();i++){
//            System.out.println(result.next().getId());
//        }

        // Get socks by id
//        sock sock = socksStub.getById(IntReqSock.newBuilder().setRequest(4).build());
//        System.out.println(sock);

        // Delete socks by id
     //   EmptySocksMessage deleteReq = socksStub.deleteById(IntReqSock.newBuilder().setRequest(4).build());
       // System.out.println(deleteReq);
    }
}
