package com.example.t3_spring_dbserver.GrpcImpl;

import com.example.t3_spring_dbserver.entity.Inventory;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.SockCardService;
import com.example.t3_spring_dbserver.service.SocksInventoryService;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryGrpcGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class SocksInventoryComunicatorImpl extends SocksInventoryGrpcGrpc.SocksInventoryGrpcImplBase {

    @Autowired
    private SocksInventoryService service;

    @Autowired
    private SockCardService cardService;

    @Override
    public void create(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.inventory req,
                       io.grpc.stub.StreamObserver<com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.EmptyInventoryMessage> responseStream) {

        System.out.println("riecieved req to save inv with id::"+ req.getId());
        SockCard sockCard = cardService.getById(req.getCardId());

        Inventory daoInventory = new Inventory(req.getColor(),req.getSize(),req.getQuantity(),sockCard);
        service.create(daoInventory);

        responseStream.onNext(com.example.t3_spring_dbserver.sockProtoBuff.SocksInventoryComunicator.EmptyInventoryMessage.newBuilder().build());
        responseStream.onCompleted();
    }






}
