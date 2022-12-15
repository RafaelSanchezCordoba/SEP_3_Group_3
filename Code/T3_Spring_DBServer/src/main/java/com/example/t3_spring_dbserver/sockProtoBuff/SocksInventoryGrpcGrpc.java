package com.example.t3_spring_dbserver.sockProtoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: InventoryComunicator.proto")
public final class SocksInventoryGrpcGrpc {

  private SocksInventoryGrpcGrpc() {}

  public static final String SERVICE_NAME = "SocksInventoryGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = SocksInventoryComunicator.inventory.class,
      responseType = SocksInventoryComunicator.EmptyInventoryMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getCreateMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory, SocksInventoryComunicator.EmptyInventoryMessage> getCreateMethod;
    if ((getCreateMethod = SocksInventoryGrpcGrpc.getCreateMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getCreateMethod = SocksInventoryGrpcGrpc.getCreateMethod) == null) {
          SocksInventoryGrpcGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.inventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.EmptyInventoryMessage,
      SocksInventoryComunicator.inventory> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = SocksInventoryComunicator.EmptyInventoryMessage.class,
      responseType = SocksInventoryComunicator.inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.EmptyInventoryMessage,
      SocksInventoryComunicator.inventory> getGetAllMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.EmptyInventoryMessage, SocksInventoryComunicator.inventory> getGetAllMethod;
    if ((getGetAllMethod = SocksInventoryGrpcGrpc.getGetAllMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getGetAllMethod = SocksInventoryGrpcGrpc.getGetAllMethod) == null) {
          SocksInventoryGrpcGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.EmptyInventoryMessage, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.inventory> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = SocksInventoryComunicator.IntReqInventory.class,
      responseType = SocksInventoryComunicator.inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.inventory> getGetByIdMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory> getGetByIdMethod;
    if ((getGetByIdMethod = SocksInventoryGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getGetByIdMethod = SocksInventoryGrpcGrpc.getGetByIdMethod) == null) {
          SocksInventoryGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.inventory> getGetByCardIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByCardId",
      requestType = SocksInventoryComunicator.IntReqInventory.class,
      responseType = SocksInventoryComunicator.inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.inventory> getGetByCardIdMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory> getGetByCardIdMethod;
    if ((getGetByCardIdMethod = SocksInventoryGrpcGrpc.getGetByCardIdMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getGetByCardIdMethod = SocksInventoryGrpcGrpc.getGetByCardIdMethod) == null) {
          SocksInventoryGrpcGrpc.getGetByCardIdMethod = getGetByCardIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByCardId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("getByCardId"))
              .build();
        }
      }
    }
    return getGetByCardIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getUpdateInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateInventory",
      requestType = SocksInventoryComunicator.inventory.class,
      responseType = SocksInventoryComunicator.EmptyInventoryMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getUpdateInventoryMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory, SocksInventoryComunicator.EmptyInventoryMessage> getUpdateInventoryMethod;
    if ((getUpdateInventoryMethod = SocksInventoryGrpcGrpc.getUpdateInventoryMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getUpdateInventoryMethod = SocksInventoryGrpcGrpc.getUpdateInventoryMethod) == null) {
          SocksInventoryGrpcGrpc.getUpdateInventoryMethod = getUpdateInventoryMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.inventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("updateInventory"))
              .build();
        }
      }
    }
    return getUpdateInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByCardIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByCardId",
      requestType = SocksInventoryComunicator.IntReqInventory.class,
      responseType = SocksInventoryComunicator.EmptyInventoryMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByCardIdMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByCardIdMethod;
    if ((getDeleteByCardIdMethod = SocksInventoryGrpcGrpc.getDeleteByCardIdMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getDeleteByCardIdMethod = SocksInventoryGrpcGrpc.getDeleteByCardIdMethod) == null) {
          SocksInventoryGrpcGrpc.getDeleteByCardIdMethod = getDeleteByCardIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByCardId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("deleteByCardId"))
              .build();
        }
      }
    }
    return getDeleteByCardIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = SocksInventoryComunicator.IntReqInventory.class,
      responseType = SocksInventoryComunicator.EmptyInventoryMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory,
      SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = SocksInventoryGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getDeleteByIdMethod = SocksInventoryGrpcGrpc.getDeleteByIdMethod) == null) {
          SocksInventoryGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.InvParameters,
      SocksInventoryComunicator.inventory> getGetByParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByParameters",
      requestType = SocksInventoryComunicator.InvParameters.class,
      responseType = SocksInventoryComunicator.inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.InvParameters,
      SocksInventoryComunicator.inventory> getGetByParametersMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.InvParameters, SocksInventoryComunicator.inventory> getGetByParametersMethod;
    if ((getGetByParametersMethod = SocksInventoryGrpcGrpc.getGetByParametersMethod) == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        if ((getGetByParametersMethod = SocksInventoryGrpcGrpc.getGetByParametersMethod) == null) {
          SocksInventoryGrpcGrpc.getGetByParametersMethod = getGetByParametersMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.InvParameters, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.InvParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new SocksInventoryGrpcMethodDescriptorSupplier("getByParameters"))
              .build();
        }
      }
    }
    return getGetByParametersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SocksInventoryGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcStub>() {
        @Override
        public SocksInventoryGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksInventoryGrpcStub(channel, callOptions);
        }
      };
    return SocksInventoryGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SocksInventoryGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcBlockingStub>() {
        @Override
        public SocksInventoryGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksInventoryGrpcBlockingStub(channel, callOptions);
        }
      };
    return SocksInventoryGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SocksInventoryGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksInventoryGrpcFutureStub>() {
        @Override
        public SocksInventoryGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksInventoryGrpcFutureStub(channel, callOptions);
        }
      };
    return SocksInventoryGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SocksInventoryGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(SocksInventoryComunicator.inventory request,
                       io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAll(SocksInventoryComunicator.EmptyInventoryMessage request,
                       io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(SocksInventoryComunicator.IntReqInventory request,
                        io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByCardId(SocksInventoryComunicator.IntReqInventory request,
                            io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByCardIdMethod(), responseObserver);
    }

    /**
     */
    public void updateInventory(SocksInventoryComunicator.inventory request,
                                io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInventoryMethod(), responseObserver);
    }

    /**
     */
    public void deleteByCardId(SocksInventoryComunicator.IntReqInventory request,
                               io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByCardIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(SocksInventoryComunicator.IntReqInventory request,
                           io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByParameters(SocksInventoryComunicator.InvParameters request,
                                io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByParametersMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.inventory,
                SocksInventoryComunicator.EmptyInventoryMessage>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SocksInventoryComunicator.EmptyInventoryMessage,
                SocksInventoryComunicator.inventory>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.IntReqInventory,
                SocksInventoryComunicator.inventory>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getGetByCardIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SocksInventoryComunicator.IntReqInventory,
                SocksInventoryComunicator.inventory>(
                  this, METHODID_GET_BY_CARD_ID)))
          .addMethod(
            getUpdateInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.inventory,
                SocksInventoryComunicator.EmptyInventoryMessage>(
                  this, METHODID_UPDATE_INVENTORY)))
          .addMethod(
            getDeleteByCardIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.IntReqInventory,
                SocksInventoryComunicator.EmptyInventoryMessage>(
                  this, METHODID_DELETE_BY_CARD_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.IntReqInventory,
                SocksInventoryComunicator.EmptyInventoryMessage>(
                  this, METHODID_DELETE_BY_ID)))
          .addMethod(
            getGetByParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.InvParameters,
                SocksInventoryComunicator.inventory>(
                  this, METHODID_GET_BY_PARAMETERS)))
          .build();
    }
  }

  /**
   */
  public static final class SocksInventoryGrpcStub extends io.grpc.stub.AbstractAsyncStub<SocksInventoryGrpcStub> {
    private SocksInventoryGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SocksInventoryGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksInventoryGrpcStub(channel, callOptions);
    }

    /**
     */
    public void create(SocksInventoryComunicator.inventory request,
                       io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(SocksInventoryComunicator.EmptyInventoryMessage request,
                       io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(SocksInventoryComunicator.IntReqInventory request,
                        io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByCardId(SocksInventoryComunicator.IntReqInventory request,
                            io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetByCardIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInventory(SocksInventoryComunicator.inventory request,
                                io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByCardId(SocksInventoryComunicator.IntReqInventory request,
                               io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByCardIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(SocksInventoryComunicator.IntReqInventory request,
                           io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByParameters(SocksInventoryComunicator.InvParameters request,
                                io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByParametersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SocksInventoryGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SocksInventoryGrpcBlockingStub> {
    private SocksInventoryGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SocksInventoryGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksInventoryGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public SocksInventoryComunicator.EmptyInventoryMessage create(SocksInventoryComunicator.inventory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SocksInventoryComunicator.inventory> getAll(
        SocksInventoryComunicator.EmptyInventoryMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksInventoryComunicator.inventory getById(SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SocksInventoryComunicator.inventory> getByCardId(
        SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetByCardIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksInventoryComunicator.EmptyInventoryMessage updateInventory(SocksInventoryComunicator.inventory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksInventoryComunicator.EmptyInventoryMessage deleteByCardId(SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByCardIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksInventoryComunicator.EmptyInventoryMessage deleteById(SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksInventoryComunicator.inventory getByParameters(SocksInventoryComunicator.InvParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByParametersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SocksInventoryGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<SocksInventoryGrpcFutureStub> {
    private SocksInventoryGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SocksInventoryGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksInventoryGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.EmptyInventoryMessage> create(
        SocksInventoryComunicator.inventory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.inventory> getById(
        SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.EmptyInventoryMessage> updateInventory(
        SocksInventoryComunicator.inventory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.EmptyInventoryMessage> deleteByCardId(
        SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByCardIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.EmptyInventoryMessage> deleteById(
        SocksInventoryComunicator.IntReqInventory request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.inventory> getByParameters(
        SocksInventoryComunicator.InvParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET_BY_ID = 2;
  private static final int METHODID_GET_BY_CARD_ID = 3;
  private static final int METHODID_UPDATE_INVENTORY = 4;
  private static final int METHODID_DELETE_BY_CARD_ID = 5;
  private static final int METHODID_DELETE_BY_ID = 6;
  private static final int METHODID_GET_BY_PARAMETERS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SocksInventoryGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SocksInventoryGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((SocksInventoryComunicator.inventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((SocksInventoryComunicator.EmptyInventoryMessage) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((SocksInventoryComunicator.IntReqInventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory>) responseObserver);
          break;
        case METHODID_GET_BY_CARD_ID:
          serviceImpl.getByCardId((SocksInventoryComunicator.IntReqInventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory>) responseObserver);
          break;
        case METHODID_UPDATE_INVENTORY:
          serviceImpl.updateInventory((SocksInventoryComunicator.inventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage>) responseObserver);
          break;
        case METHODID_DELETE_BY_CARD_ID:
          serviceImpl.deleteByCardId((SocksInventoryComunicator.IntReqInventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((SocksInventoryComunicator.IntReqInventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.EmptyInventoryMessage>) responseObserver);
          break;
        case METHODID_GET_BY_PARAMETERS:
          serviceImpl.getByParameters((SocksInventoryComunicator.InvParameters) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SocksInventoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SocksInventoryGrpcBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SocksInventoryComunicator.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SocksInventoryGrpc");
    }
  }

  private static final class SocksInventoryGrpcFileDescriptorSupplier
      extends SocksInventoryGrpcBaseDescriptorSupplier {
    SocksInventoryGrpcFileDescriptorSupplier() {}
  }

  private static final class SocksInventoryGrpcMethodDescriptorSupplier
      extends SocksInventoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SocksInventoryGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SocksInventoryGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SocksInventoryGrpcFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getGetByCardIdMethod())
              .addMethod(getUpdateInventoryMethod())
              .addMethod(getDeleteByCardIdMethod())
              .addMethod(getDeleteByIdMethod())
              .addMethod(getGetByParametersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
