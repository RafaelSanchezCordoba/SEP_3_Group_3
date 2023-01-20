package com.example.t3_spring_dbserver.GrpcImpl;


import com.example.t3_spring_dbserver.DTOs.InventoryDto;
import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.service.ProductCardService;
import com.example.t3_spring_dbserver.service.InventoryService;
import com.protoBuff.InventoryGrpcGrpc.*;
import com.protoBuff.SocksInventoryComunicator;
import com.protoBuff.SocksInventoryComunicator.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class InventoryComunicatorImpl extends InventoryGrpcImplBase {

    @Autowired
    private InventoryService service;

    @Autowired
    private ProductCardService cardService;

    @Override
    public void create(inventory req, StreamObserver<inventory> responseStream) {
        System.out.println("riecieved req to save inv with id::"+ req.getId());

        ProductCard card = cardService.getById(req.getCardId());
        Inventory inventory = new Inventory(req.getColor(),req.getSize(),req.getQuantity(),card);
        service.create(inventory);
        responseStream.onNext(SocksInventoryComunicator.inventory.newBuilder()
                .setCardId((int) inventory.getProductCard().getId())
                .setColor(inventory.getColor())
                .setId((int) inventory.getId())
                .setQuantity(inventory.getQuantity())
                .setSize(inventory.getSize()).build());
        responseStream.onCompleted();
    }

    @Override
    public void getAll(EmptyInventoryMessage req, StreamObserver<inventory> responseStream) {
        System.out.println("Received req for all inventories");

        List<Inventory> list = service.getAll();

        for (Inventory inventory:list) {
            inventory protoInventory = SocksInventoryComunicator.inventory.newBuilder()
                    .setId((int)inventory.getId())
                    .setColor(inventory.getColor())
                    .setSize(inventory.getSize())
                    .setQuantity(inventory.getQuantity())
                    .setCardId((int)inventory.getProductCard().getId()).build();

            responseStream.onNext(protoInventory);
            System.out.println("Inventory added to stream with id: " + protoInventory.getId());
        }
        responseStream.onCompleted();
    }

    @Override
    public void getById(IntReqInventory req, StreamObserver<inventory> responseStream) {
        System.out.println("Received get by id request with id: " + req.getRequest());
        Inventory inventory = service.getById(req.getRequest());
        SocksInventoryComunicator.inventory toSent = SocksInventoryComunicator.inventory.newBuilder()
                .setId((int) inventory.getId())
                .setColor(inventory.getColor())
                .setSize(inventory.getSize())
                .setQuantity(inventory.getQuantity())
                .setCardId((int)inventory.getProductCard().getId()).build();

        responseStream.onNext(toSent);
        responseStream.onCompleted();
    }

    @Override
    public void updateInventory(inventory inv, StreamObserver<EmptyInventoryMessage> message) {
        System.out.println("Received req to update inventory: " + inv.getId());

        InventoryDto inventoryDto = new InventoryDto(inv.getId(), inv.getColor(), inv.getSize(), inv.getQuantity(), inv.getCardId());
        Inventory inventory = service.updateInventory(inventoryDto);

        message.onNext(EmptyInventoryMessage.newBuilder().build());
        message.onCompleted();
    }

    @Override
    public void deleteById(IntReqInventory req, StreamObserver<EmptyInventoryMessage> responseStream) {
        System.out.println("Received req to delete inventory with id: " + req.getRequest());
        service.deleteById(req.getRequest());

        responseStream.onNext(EmptyInventoryMessage.newBuilder().build());
        responseStream.onCompleted();
    }

    @Override
    public void getByCardId(IntReqInventory req, StreamObserver<inventory> streamObserver) {
        System.out.println("Received get by inv id request with id: " + req.getRequest());
        List<Inventory> list = service.getByCardId(req.getRequest());

        for (Inventory inventory:list) {
            SocksInventoryComunicator.inventory protoInventory = SocksInventoryComunicator.inventory.newBuilder()
                    .setId((int)inventory.getId())
                    .setColor(inventory.getColor())
                    .setSize(inventory.getSize())
                    .setQuantity(inventory.getQuantity())
                    .setCardId((int)inventory.getProductCard().getId()).build();

            streamObserver.onNext(protoInventory);
            System.out.println("Inventory added to stream with id: " + protoInventory.getId());
        }
        streamObserver.onCompleted();

    }

    @Override
    public void deleteByCardId(IntReqInventory req, StreamObserver<EmptyInventoryMessage> streamObserver) {
        System.out.println("Received req to delete inventory with card id: " + req.getRequest());
        service.deleteByCardId(req.getRequest());

        streamObserver.onNext(EmptyInventoryMessage.newBuilder().build());
        streamObserver.onCompleted();
    }

    @Override
    public void getByParameters(InvParameters req, StreamObserver<inventory> responseStream) {
        System.out.println("Received get by parameters request with : " + req.getCardId() + req.getColor() + req.getSize());
        Inventory inventory = service.getByParameters(req.getCardId(), req.getColor(), req.getSize());
        SocksInventoryComunicator.inventory toSent = SocksInventoryComunicator.inventory.newBuilder()
                .setId((int) inventory.getId())
                .setColor(inventory.getColor())
                .setSize(inventory.getSize())
                .setQuantity(inventory.getQuantity())
                .setCardId((int)inventory.getProductCard().getId()).build();

        responseStream.onNext(toSent);
        responseStream.onCompleted();
    }

}

