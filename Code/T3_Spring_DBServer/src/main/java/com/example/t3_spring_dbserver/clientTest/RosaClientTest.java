package com.example.t3_spring_dbserver.clientTest;

import com.protoBuff.AddressAndUserGrpcGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RosaClientTest {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
        AddressAndUserGrpcGrpc.AddressAndUserGrpcBlockingStub stub=AddressAndUserGrpcGrpc.newBlockingStub(channel);

    }
}
