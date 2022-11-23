package com.example.t3_spring_dbserver.clientTest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.t3_spring_dbserver.sockProtoBuff.SockCardGrpcGrpc;
import com.example.t3_spring_dbserver.sockProtoBuff.SocksComunicator;

public class ClientTest {
    public static void main(String[] args)  throws Exception{
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
        SockCardGrpcGrpc.SockCardGrpcBlockingStub stub = SockCardGrpcGrpc.newBlockingStub(channel);

      SocksComunicator.sockCard card =   stub.getById(SocksComunicator.IntReq.newBuilder().setRequest(10).build());
        System.out.println("brand::"+card.getBrand()+"||id::"+card.getId());
    }
}
