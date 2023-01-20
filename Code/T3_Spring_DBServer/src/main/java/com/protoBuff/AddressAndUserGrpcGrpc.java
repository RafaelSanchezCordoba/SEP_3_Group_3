package com.protoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: addressComunicator.proto")
public final class AddressAndUserGrpcGrpc {

  private AddressAndUserGrpcGrpc() {}

  public static final String SERVICE_NAME = "AddressAndUserGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.address> getGetAddressByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressById",
      requestType = AddressComunicator.IntReqAddress.class,
      responseType = AddressComunicator.address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.address> getGetAddressByIdMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress, AddressComunicator.address> getGetAddressByIdMethod;
    if ((getGetAddressByIdMethod = AddressAndUserGrpcGrpc.getGetAddressByIdMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getGetAddressByIdMethod = AddressAndUserGrpcGrpc.getGetAddressByIdMethod) == null) {
          AddressAndUserGrpcGrpc.getGetAddressByIdMethod = getGetAddressByIdMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.IntReqAddress, AddressComunicator.address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.IntReqAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("GetAddressById"))
              .build();
        }
      }
    }
    return getGetAddressByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.address,
      AddressComunicator.address> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = AddressComunicator.address.class,
      responseType = AddressComunicator.address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.address,
      AddressComunicator.address> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.address, AddressComunicator.address> getCreateAddressMethod;
    if ((getCreateAddressMethod = AddressAndUserGrpcGrpc.getCreateAddressMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getCreateAddressMethod = AddressAndUserGrpcGrpc.getCreateAddressMethod) == null) {
          AddressAndUserGrpcGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.address, AddressComunicator.address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.EmptyAddressMessage,
      AddressComunicator.address> getGetAllAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllAddresses",
      requestType = AddressComunicator.EmptyAddressMessage.class,
      responseType = AddressComunicator.address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<AddressComunicator.EmptyAddressMessage,
      AddressComunicator.address> getGetAllAddressesMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.EmptyAddressMessage, AddressComunicator.address> getGetAllAddressesMethod;
    if ((getGetAllAddressesMethod = AddressAndUserGrpcGrpc.getGetAllAddressesMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getGetAllAddressesMethod = AddressAndUserGrpcGrpc.getGetAllAddressesMethod) == null) {
          AddressAndUserGrpcGrpc.getGetAllAddressesMethod = getGetAllAddressesMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.EmptyAddressMessage, AddressComunicator.address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.EmptyAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("GetAllAddresses"))
              .build();
        }
      }
    }
    return getGetAllAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.addressUpdateMessage,
      AddressComunicator.StringMessageAddress> getUpdateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAddress",
      requestType = AddressComunicator.addressUpdateMessage.class,
      responseType = AddressComunicator.StringMessageAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.addressUpdateMessage,
      AddressComunicator.StringMessageAddress> getUpdateAddressMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.addressUpdateMessage, AddressComunicator.StringMessageAddress> getUpdateAddressMethod;
    if ((getUpdateAddressMethod = AddressAndUserGrpcGrpc.getUpdateAddressMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getUpdateAddressMethod = AddressAndUserGrpcGrpc.getUpdateAddressMethod) == null) {
          AddressAndUserGrpcGrpc.getUpdateAddressMethod = getUpdateAddressMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.addressUpdateMessage, AddressComunicator.StringMessageAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.addressUpdateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.StringMessageAddress.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("UpdateAddress"))
              .build();
        }
      }
    }
    return getUpdateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.address> getGetAddressByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAddressByUserId",
      requestType = AddressComunicator.IntReqAddress.class,
      responseType = AddressComunicator.address.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.address> getGetAddressByUserIdMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress, AddressComunicator.address> getGetAddressByUserIdMethod;
    if ((getGetAddressByUserIdMethod = AddressAndUserGrpcGrpc.getGetAddressByUserIdMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getGetAddressByUserIdMethod = AddressAndUserGrpcGrpc.getGetAddressByUserIdMethod) == null) {
          AddressAndUserGrpcGrpc.getGetAddressByUserIdMethod = getGetAddressByUserIdMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.IntReqAddress, AddressComunicator.address>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAddressByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.IntReqAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.address.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("GetAddressByUserId"))
              .build();
        }
      }
    }
    return getGetAddressByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.loginMessage,
      AddressComunicator.user> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = AddressComunicator.loginMessage.class,
      responseType = AddressComunicator.user.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.loginMessage,
      AddressComunicator.user> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.loginMessage, AddressComunicator.user> getRegisterUserMethod;
    if ((getRegisterUserMethod = AddressAndUserGrpcGrpc.getRegisterUserMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getRegisterUserMethod = AddressAndUserGrpcGrpc.getRegisterUserMethod) == null) {
          AddressAndUserGrpcGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.loginMessage, AddressComunicator.user>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.loginMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.user.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.loginMessage,
      AddressComunicator.StringMessageAddress> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = AddressComunicator.loginMessage.class,
      responseType = AddressComunicator.StringMessageAddress.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.loginMessage,
      AddressComunicator.StringMessageAddress> getLoginMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.loginMessage, AddressComunicator.StringMessageAddress> getLoginMethod;
    if ((getLoginMethod = AddressAndUserGrpcGrpc.getLoginMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getLoginMethod = AddressAndUserGrpcGrpc.getLoginMethod) == null) {
          AddressAndUserGrpcGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.loginMessage, AddressComunicator.StringMessageAddress>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.loginMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.StringMessageAddress.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.user> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = AddressComunicator.IntReqAddress.class,
      responseType = AddressComunicator.user.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress,
      AddressComunicator.user> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.IntReqAddress, AddressComunicator.user> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = AddressAndUserGrpcGrpc.getGetUserByIdMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getGetUserByIdMethod = AddressAndUserGrpcGrpc.getGetUserByIdMethod) == null) {
          AddressAndUserGrpcGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.IntReqAddress, AddressComunicator.user>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.IntReqAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.user.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.StringMessageAddress,
      AddressComunicator.user> getGetUserByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByEmail",
      requestType = AddressComunicator.StringMessageAddress.class,
      responseType = AddressComunicator.user.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.StringMessageAddress,
      AddressComunicator.user> getGetUserByEmailMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.StringMessageAddress, AddressComunicator.user> getGetUserByEmailMethod;
    if ((getGetUserByEmailMethod = AddressAndUserGrpcGrpc.getGetUserByEmailMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getGetUserByEmailMethod = AddressAndUserGrpcGrpc.getGetUserByEmailMethod) == null) {
          AddressAndUserGrpcGrpc.getGetUserByEmailMethod = getGetUserByEmailMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.StringMessageAddress, AddressComunicator.user>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.StringMessageAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.user.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("GetUserByEmail"))
              .build();
        }
      }
    }
    return getGetUserByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddressComunicator.user,
      AddressComunicator.user> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = AddressComunicator.user.class,
      responseType = AddressComunicator.user.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddressComunicator.user,
      AddressComunicator.user> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<AddressComunicator.user, AddressComunicator.user> getUpdateUserMethod;
    if ((getUpdateUserMethod = AddressAndUserGrpcGrpc.getUpdateUserMethod) == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        if ((getUpdateUserMethod = AddressAndUserGrpcGrpc.getUpdateUserMethod) == null) {
          AddressAndUserGrpcGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<AddressComunicator.user, AddressComunicator.user>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.user.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddressComunicator.user.getDefaultInstance()))
              .setSchemaDescriptor(new AddressAndUserGrpcMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressAndUserGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcStub>() {
        @java.lang.Override
        public AddressAndUserGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressAndUserGrpcStub(channel, callOptions);
        }
      };
    return AddressAndUserGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressAndUserGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcBlockingStub>() {
        @java.lang.Override
        public AddressAndUserGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressAndUserGrpcBlockingStub(channel, callOptions);
        }
      };
    return AddressAndUserGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressAndUserGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressAndUserGrpcFutureStub>() {
        @java.lang.Override
        public AddressAndUserGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressAndUserGrpcFutureStub(channel, callOptions);
        }
      };
    return AddressAndUserGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddressAndUserGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAddressById(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByIdMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(AddressComunicator.address request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAllAddresses(AddressComunicator.EmptyAddressMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllAddressesMethod(), responseObserver);
    }

    /**
     */
    public void updateAddress(AddressComunicator.addressUpdateMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAddressMethod(), responseObserver);
    }

    /**
     */
    public void getAddressByUserId(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAddressByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void registerUser(AddressComunicator.loginMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    public void login(AddressComunicator.loginMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void getUserByEmail(AddressComunicator.StringMessageAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByEmailMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(AddressComunicator.user request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAddressByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.IntReqAddress,
                AddressComunicator.address>(
                  this, METHODID_GET_ADDRESS_BY_ID)))
          .addMethod(
            getCreateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.address,
                AddressComunicator.address>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGetAllAddressesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                AddressComunicator.EmptyAddressMessage,
                AddressComunicator.address>(
                  this, METHODID_GET_ALL_ADDRESSES)))
          .addMethod(
            getUpdateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.addressUpdateMessage,
                AddressComunicator.StringMessageAddress>(
                  this, METHODID_UPDATE_ADDRESS)))
          .addMethod(
            getGetAddressByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.IntReqAddress,
                AddressComunicator.address>(
                  this, METHODID_GET_ADDRESS_BY_USER_ID)))
          .addMethod(
            getRegisterUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.loginMessage,
                AddressComunicator.user>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.loginMessage,
                AddressComunicator.StringMessageAddress>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.IntReqAddress,
                AddressComunicator.user>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetUserByEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.StringMessageAddress,
                AddressComunicator.user>(
                  this, METHODID_GET_USER_BY_EMAIL)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AddressComunicator.user,
                AddressComunicator.user>(
                  this, METHODID_UPDATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class AddressAndUserGrpcStub extends io.grpc.stub.AbstractAsyncStub<AddressAndUserGrpcStub> {
    private AddressAndUserGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressAndUserGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressAndUserGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getAddressById(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(AddressComunicator.address request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAddresses(AddressComunicator.EmptyAddressMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAddress(AddressComunicator.addressUpdateMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAddressByUserId(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.address> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAddressByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerUser(AddressComunicator.loginMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(AddressComunicator.loginMessage request,
        io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(AddressComunicator.IntReqAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByEmail(AddressComunicator.StringMessageAddress request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(AddressComunicator.user request,
        io.grpc.stub.StreamObserver<AddressComunicator.user> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddressAndUserGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddressAndUserGrpcBlockingStub> {
    private AddressAndUserGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressAndUserGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressAndUserGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public AddressComunicator.address getAddressById(AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.address createAddress(AddressComunicator.address request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<AddressComunicator.address> getAllAddresses(
        AddressComunicator.EmptyAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.StringMessageAddress updateAddress(AddressComunicator.addressUpdateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.address getAddressByUserId(AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAddressByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.user registerUser(AddressComunicator.loginMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.StringMessageAddress login(AddressComunicator.loginMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.user getUserById(AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.user getUserByEmail(AddressComunicator.StringMessageAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public AddressComunicator.user updateUser(AddressComunicator.user request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddressAndUserGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<AddressAndUserGrpcFutureStub> {
    private AddressAndUserGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressAndUserGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressAndUserGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.address> getAddressById(
        AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.address> createAddress(
        AddressComunicator.address request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.StringMessageAddress> updateAddress(
        AddressComunicator.addressUpdateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.address> getAddressByUserId(
        AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAddressByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.user> registerUser(
        AddressComunicator.loginMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.StringMessageAddress> login(
        AddressComunicator.loginMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.user> getUserById(
        AddressComunicator.IntReqAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.user> getUserByEmail(
        AddressComunicator.StringMessageAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AddressComunicator.user> updateUser(
        AddressComunicator.user request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ADDRESS_BY_ID = 0;
  private static final int METHODID_CREATE_ADDRESS = 1;
  private static final int METHODID_GET_ALL_ADDRESSES = 2;
  private static final int METHODID_UPDATE_ADDRESS = 3;
  private static final int METHODID_GET_ADDRESS_BY_USER_ID = 4;
  private static final int METHODID_REGISTER_USER = 5;
  private static final int METHODID_LOGIN = 6;
  private static final int METHODID_GET_USER_BY_ID = 7;
  private static final int METHODID_GET_USER_BY_EMAIL = 8;
  private static final int METHODID_UPDATE_USER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressAndUserGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressAndUserGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ADDRESS_BY_ID:
          serviceImpl.getAddressById((AddressComunicator.IntReqAddress) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.address>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((AddressComunicator.address) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.address>) responseObserver);
          break;
        case METHODID_GET_ALL_ADDRESSES:
          serviceImpl.getAllAddresses((AddressComunicator.EmptyAddressMessage) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.address>) responseObserver);
          break;
        case METHODID_UPDATE_ADDRESS:
          serviceImpl.updateAddress((AddressComunicator.addressUpdateMessage) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress>) responseObserver);
          break;
        case METHODID_GET_ADDRESS_BY_USER_ID:
          serviceImpl.getAddressByUserId((AddressComunicator.IntReqAddress) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.address>) responseObserver);
          break;
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((AddressComunicator.loginMessage) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.user>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((AddressComunicator.loginMessage) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.StringMessageAddress>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((AddressComunicator.IntReqAddress) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.user>) responseObserver);
          break;
        case METHODID_GET_USER_BY_EMAIL:
          serviceImpl.getUserByEmail((AddressComunicator.StringMessageAddress) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.user>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((AddressComunicator.user) request,
              (io.grpc.stub.StreamObserver<AddressComunicator.user>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AddressAndUserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddressAndUserGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AddressComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddressAndUserGrpc");
    }
  }

  private static final class AddressAndUserGrpcFileDescriptorSupplier
      extends AddressAndUserGrpcBaseDescriptorSupplier {
    AddressAndUserGrpcFileDescriptorSupplier() {}
  }

  private static final class AddressAndUserGrpcMethodDescriptorSupplier
      extends AddressAndUserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddressAndUserGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddressAndUserGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressAndUserGrpcFileDescriptorSupplier())
              .addMethod(getGetAddressByIdMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGetAllAddressesMethod())
              .addMethod(getUpdateAddressMethod())
              .addMethod(getGetAddressByUserIdMethod())
              .addMethod(getRegisterUserMethod())
              .addMethod(getLoginMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGetUserByEmailMethod())
              .addMethod(getUpdateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
