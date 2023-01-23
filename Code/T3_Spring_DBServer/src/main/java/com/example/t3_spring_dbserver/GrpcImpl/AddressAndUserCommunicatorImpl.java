package com.example.t3_spring_dbserver.GrpcImpl;


import com.example.t3_spring_dbserver.entity.Customer;
import com.example.t3_spring_dbserver.entity.ShippingInf;
import com.example.t3_spring_dbserver.service.*;
import com.protoBuff.AddressAndUserGrpcGrpc;
import com.protoBuff.AddressComunicator;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class AddressAndUserCommunicatorImpl extends AddressAndUserGrpcGrpc.AddressAndUserGrpcImplBase {

    @Autowired
    private IUserService userService;

    @Autowired
    private IAddressService addressService;

    @Override
    public void getAddressById(AddressComunicator.IntReqAddress request,
                               io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver)
    {
        System.out.println("Received get by id request with id: " + request.getRequest());
        ShippingInf address = addressService.GetAddressById(request.getRequest());
        AddressComunicator.address toSent = AddressComunicator.address.newBuilder()
                .setId((int) address.getId())
                .setUserId((int)address.getCustomer().getId())
                .setCountry(address.getCountry())
                .setCity(address.getCity())
                .setPostCode(address.getPostCode())
                .setStreet(address.getStreet())
                .setNumber(address.getNumber())
                .setExtraInfo(address.getExtraInf())
                .build();

        responseObserver.onNext(toSent);
        responseObserver.onCompleted();
    }

    @Override
    public void createAddress(AddressComunicator.address request, StreamObserver<AddressComunicator.address> responseObserver) {
        System.out.println("riecieved req to save address with id::"+ request.getId());
        Customer customer= userService.GetUserById(request.getId());

        ShippingInf address = new ShippingInf(request.getCountry(),request.getCity(), (int) request.getPostCode(),request.getStreet(),request.getNumber(),request.getExtraInfo(),customer);

        addressService.CreateAddress(address);
        responseObserver.onNext(AddressComunicator.address.newBuilder()
                .setId((int) address.getId())
                .setUserId((int)address.getCustomer().getId())
                .setCountry(address.getCountry())
                .setCity(address.getCity())
                .setPostCode(address.getPostCode())
                .setStreet(address.getStreet())
                .setNumber(address.getNumber())
                .setExtraInfo(address.getExtraInf())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAddresses(AddressComunicator.EmptyAddressMessage request,
                                StreamObserver<AddressComunicator.address> responseObserver) {
        System.out.println("Received req for all addresses");

        List<ShippingInf> list = addressService.GetAllAddresses();

        for (ShippingInf address:list) {
            AddressComunicator.address toSent = AddressComunicator.address.newBuilder()
                    .setId((int) address.getId())
                    .setUserId((int)address.getCustomer().getId())
                    .setCountry(address.getCountry())
                    .setCity(address.getCity())
                    .setPostCode(address.getPostCode())
                    .setStreet(address.getStreet())
                    .setNumber(address.getNumber())
                    .setExtraInfo(address.getExtraInf())
                    .build();

            responseObserver.onNext(toSent);
            System.out.println("Inventory added to stream with id: " + toSent.getId());
        }
        responseObserver.onCompleted();



    }


    @Override
    public void updateAddress(AddressComunicator.addressUpdateMessage request,
                StreamObserver<AddressComunicator.StringMessageAddress> responseObserver){


        Customer customer=  userService.GetUserById(request.getOwnerId());
        ShippingInf address = new ShippingInf(request.getCountry(),request.getCity(), (int) request.getPostCode(),request.getStreet(),request.getNumber(),request.getExtraInfo(),customer);
        ShippingInf shippingInf = addressService.UpdateAddress(address);

        responseObserver.onNext(AddressComunicator.StringMessageAddress.newBuilder().build());
        responseObserver.onCompleted();
        }



        @Override
        public void getAddressByUserId(AddressComunicator.IntReqAddress request,
                                       StreamObserver<AddressComunicator.address> responseObserver) {
            System.out.println("Received get by id request with id: " + request.getRequest());

            ShippingInf address= userService.GetAddressByUserId(request.getRequest());
            AddressComunicator.address toSent = AddressComunicator.address.newBuilder()
                    .setId((int) address.getId())
                    .setUserId((int)address.getCustomer().getId())
                    .setCountry(address.getCountry())
                    .setCity(address.getCity())
                    .setPostCode(address.getPostCode())
                    .setStreet(address.getStreet())
                    .setNumber(address.getNumber())
                    .setExtraInfo(address.getExtraInf())
                    .build();

            responseObserver.onNext(toSent);
            responseObserver.onCompleted();
        }



        @Override
        public void registerUser(AddressComunicator.loginMessage request,
                                 StreamObserver<AddressComunicator.user> responseObserver) {
            System.out.println("Received req to register customer with email:"+ request.getEmail());

            Customer user= userService.RegisterUser(request.getEmail(),request.getPassword());
            responseObserver.onNext(AddressComunicator.user.newBuilder()
                    .setEmail(user.getEmail())
                    .build());
            responseObserver.onCompleted();
        }

        @Override
        public void login(AddressComunicator.loginMessage request,
                         StreamObserver<AddressComunicator.StringMessageAddress> responseObserver) {

        Customer customer = userService.Login(request.getEmail(),request.getPassword());

            responseObserver.onNext(AddressComunicator.StringMessageAddress.newBuilder()
                    .setMessage(customer.getName())
                    .build());
            responseObserver.onCompleted();
        }



        @Override
        public void getUserById(AddressComunicator.IntReqAddress request,
                                StreamObserver<AddressComunicator.user> responseObserver) {
            System.out.println("Received req to get customer with id::"+ request.getRequest());

            Customer user = userService.GetUserById(request.getRequest());
            AddressComunicator.address address= AddressComunicator.address.newBuilder()
                            .setCity(user.getShippingInf().getCity())
                            .setCountry(user.getShippingInf().getCountry())
                             .setStreet(user.getShippingInf().getStreet())
                             .setUserId((int) user.getId()).setNumber(user.getShippingInf().getNumber())
                            .setExtraInfo(user.getShippingInf().getExtraInf()).build();
            responseObserver.onNext(AddressComunicator.user.newBuilder()
                    .setEmail(user.getEmail())
                    .setName(user.getName())
                    .setPhoneNumber(String.valueOf(user.getPhone()))
                    .setAddress(address)
                    .build());
            responseObserver.onCompleted();
        }
        }
