package com.protoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SocksInventoryComunicator.proto")
public final class InventoryGrpcGrpc {

  private InventoryGrpcGrpc() {}

  public static final String SERVICE_NAME = "InventoryGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.inventory> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = SocksInventoryComunicator.inventory.class,
      responseType = SocksInventoryComunicator.inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory,
      SocksInventoryComunicator.inventory> getCreateMethod() {
    io.grpc.MethodDescriptor<SocksInventoryComunicator.inventory, SocksInventoryComunicator.inventory> getCreateMethod;
    if ((getCreateMethod = InventoryGrpcGrpc.getCreateMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getCreateMethod = InventoryGrpcGrpc.getCreateMethod) == null) {
          InventoryGrpcGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.inventory, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("create"))
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
    if ((getGetAllMethod = InventoryGrpcGrpc.getGetAllMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getGetAllMethod = InventoryGrpcGrpc.getGetAllMethod) == null) {
          InventoryGrpcGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.EmptyInventoryMessage, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("getAll"))
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
    if ((getGetByIdMethod = InventoryGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getGetByIdMethod = InventoryGrpcGrpc.getGetByIdMethod) == null) {
          InventoryGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("getById"))
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
    if ((getGetByCardIdMethod = InventoryGrpcGrpc.getGetByCardIdMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getGetByCardIdMethod = InventoryGrpcGrpc.getGetByCardIdMethod) == null) {
          InventoryGrpcGrpc.getGetByCardIdMethod = getGetByCardIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByCardId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("getByCardId"))
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
    if ((getUpdateInventoryMethod = InventoryGrpcGrpc.getUpdateInventoryMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getUpdateInventoryMethod = InventoryGrpcGrpc.getUpdateInventoryMethod) == null) {
          InventoryGrpcGrpc.getUpdateInventoryMethod = getUpdateInventoryMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.inventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("updateInventory"))
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
    if ((getDeleteByCardIdMethod = InventoryGrpcGrpc.getDeleteByCardIdMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getDeleteByCardIdMethod = InventoryGrpcGrpc.getDeleteByCardIdMethod) == null) {
          InventoryGrpcGrpc.getDeleteByCardIdMethod = getDeleteByCardIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByCardId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("deleteByCardId"))
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
    if ((getDeleteByIdMethod = InventoryGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getDeleteByIdMethod = InventoryGrpcGrpc.getDeleteByIdMethod) == null) {
          InventoryGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.IntReqInventory, SocksInventoryComunicator.EmptyInventoryMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.IntReqInventory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.EmptyInventoryMessage.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("deleteById"))
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
    if ((getGetByParametersMethod = InventoryGrpcGrpc.getGetByParametersMethod) == null) {
      synchronized (InventoryGrpcGrpc.class) {
        if ((getGetByParametersMethod = InventoryGrpcGrpc.getGetByParametersMethod) == null) {
          InventoryGrpcGrpc.getGetByParametersMethod = getGetByParametersMethod =
              io.grpc.MethodDescriptor.<SocksInventoryComunicator.InvParameters, SocksInventoryComunicator.inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.InvParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksInventoryComunicator.inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryGrpcMethodDescriptorSupplier("getByParameters"))
              .build();
        }
      }
    }
    return getGetByParametersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcStub>() {
        @java.lang.Override
        public InventoryGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryGrpcStub(channel, callOptions);
        }
      };
    return InventoryGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcBlockingStub>() {
        @java.lang.Override
        public InventoryGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryGrpcBlockingStub(channel, callOptions);
        }
      };
    return InventoryGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryGrpcFutureStub>() {
        @java.lang.Override
        public InventoryGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryGrpcFutureStub(channel, callOptions);
        }
      };
    return InventoryGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InventoryGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(SocksInventoryComunicator.inventory request,
        io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksInventoryComunicator.inventory,
                SocksInventoryComunicator.inventory>(
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
  public static final class InventoryGrpcStub extends io.grpc.stub.AbstractAsyncStub<InventoryGrpcStub> {
    private InventoryGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryGrpcStub(channel, callOptions);
    }

    /**
     */
    public void create(SocksInventoryComunicator.inventory request,
        io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory> responseObserver) {
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
  public static final class InventoryGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<InventoryGrpcBlockingStub> {
    private InventoryGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public SocksInventoryComunicator.inventory create(SocksInventoryComunicator.inventory request) {
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
  public static final class InventoryGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<InventoryGrpcFutureStub> {
    private InventoryGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksInventoryComunicator.inventory> create(
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
    private final InventoryGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((SocksInventoryComunicator.inventory) request,
              (io.grpc.stub.StreamObserver<SocksInventoryComunicator.inventory>) responseObserver);
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

  private static abstract class InventoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SocksInventoryComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryGrpc");
    }
  }

  private static final class InventoryGrpcFileDescriptorSupplier
      extends InventoryGrpcBaseDescriptorSupplier {
    InventoryGrpcFileDescriptorSupplier() {}
  }

  private static final class InventoryGrpcMethodDescriptorSupplier
      extends InventoryGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryGrpcFileDescriptorSupplier())
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
