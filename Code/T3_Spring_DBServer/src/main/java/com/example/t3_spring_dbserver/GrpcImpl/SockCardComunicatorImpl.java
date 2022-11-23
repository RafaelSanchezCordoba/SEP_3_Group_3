package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.entity.SockCard;
import com.example.t3_spring_dbserver.service.SockCardService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.t3_spring_dbserver.repository.ISockCardRepository;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator;
import com.example.t3_spring_dbserver.sockProtoBuff.SockCardGrpcGrpc.SockCardGrpcImplBase;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator.*;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@GRpcService
@Controller
public class SockCardComunicatorImpl extends SockCardGrpcImplBase {


    @Autowired
    private SockCardService service;
    @Override
    public void getById (IntReq req, StreamObserver<sockCard> responseStream){



        System.out.println("ricieved get by id request with id::"+req.getRequest());



            SockCard sockCard = service.getById((long)req.getRequest());
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

}
