package com.example.t3_spring_dbserver.sockProtoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: trouserCardComunicator.proto")
public final class TrouserCardGrpcGrpc {

  private TrouserCardGrpcGrpc() {}

  public static final String SERVICE_NAME = "TrouserCardGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq,
      TrouserCardComunicator.trouserCard> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = TrouserCardComunicator.trouserCardIntReq.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq,
      TrouserCardComunicator.trouserCard> getGetByIdMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq, TrouserCardComunicator.trouserCard> getGetByIdMethod;
    if ((getGetByIdMethod = TrouserCardGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getGetByIdMethod = TrouserCardGrpcGrpc.getGetByIdMethod) == null) {
          TrouserCardGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCardIntReq, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCardIntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard,
      TrouserCardComunicator.trouserCard> getAddTrouserCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTrouserCard",
      requestType = TrouserCardComunicator.trouserCard.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard,
      TrouserCardComunicator.trouserCard> getAddTrouserCardMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard, TrouserCardComunicator.trouserCard> getAddTrouserCardMethod;
    if ((getAddTrouserCardMethod = TrouserCardGrpcGrpc.getAddTrouserCardMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getAddTrouserCardMethod = TrouserCardGrpcGrpc.getAddTrouserCardMethod) == null) {
          TrouserCardGrpcGrpc.getAddTrouserCardMethod = getAddTrouserCardMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCard, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addTrouserCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("addTrouserCard"))
              .build();
        }
      }
    }
    return getAddTrouserCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardEmpty,
      TrouserCardComunicator.trouserCard> getGetAllSockCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSockCards",
      requestType = TrouserCardComunicator.trouserCardEmpty.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardEmpty,
      TrouserCardComunicator.trouserCard> getGetAllSockCardsMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardEmpty, TrouserCardComunicator.trouserCard> getGetAllSockCardsMethod;
    if ((getGetAllSockCardsMethod = TrouserCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getGetAllSockCardsMethod = TrouserCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
          TrouserCardGrpcGrpc.getGetAllSockCardsMethod = getGetAllSockCardsMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCardEmpty, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSockCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCardEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("getAllSockCards"))
              .build();
        }
      }
    }
    return getGetAllSockCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq,
      TrouserCardComunicator.trouserCard> getDeleteSockCardByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSockCardById",
      requestType = TrouserCardComunicator.trouserCardIntReq.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq,
      TrouserCardComunicator.trouserCard> getDeleteSockCardByIdMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardIntReq, TrouserCardComunicator.trouserCard> getDeleteSockCardByIdMethod;
    if ((getDeleteSockCardByIdMethod = TrouserCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getDeleteSockCardByIdMethod = TrouserCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
          TrouserCardGrpcGrpc.getDeleteSockCardByIdMethod = getDeleteSockCardByIdMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCardIntReq, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSockCardById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCardIntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("deleteSockCardById"))
              .build();
        }
      }
    }
    return getDeleteSockCardByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardStringReq,
      TrouserCardComunicator.trouserCard> getGetByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitle",
      requestType = TrouserCardComunicator.trouserCardStringReq.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardStringReq,
      TrouserCardComunicator.trouserCard> getGetByTitleMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCardStringReq, TrouserCardComunicator.trouserCard> getGetByTitleMethod;
    if ((getGetByTitleMethod = TrouserCardGrpcGrpc.getGetByTitleMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getGetByTitleMethod = TrouserCardGrpcGrpc.getGetByTitleMethod) == null) {
          TrouserCardGrpcGrpc.getGetByTitleMethod = getGetByTitleMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCardStringReq, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCardStringReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("getByTitle"))
              .build();
        }
      }
    }
    return getGetByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard,
      TrouserCardComunicator.trouserCard> getUpdateSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSockCard",
      requestType = TrouserCardComunicator.trouserCard.class,
      responseType = TrouserCardComunicator.trouserCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard,
      TrouserCardComunicator.trouserCard> getUpdateSockCardMethod() {
    io.grpc.MethodDescriptor<TrouserCardComunicator.trouserCard, TrouserCardComunicator.trouserCard> getUpdateSockCardMethod;
    if ((getUpdateSockCardMethod = TrouserCardGrpcGrpc.getUpdateSockCardMethod) == null) {
      synchronized (TrouserCardGrpcGrpc.class) {
        if ((getUpdateSockCardMethod = TrouserCardGrpcGrpc.getUpdateSockCardMethod) == null) {
          TrouserCardGrpcGrpc.getUpdateSockCardMethod = getUpdateSockCardMethod =
              io.grpc.MethodDescriptor.<TrouserCardComunicator.trouserCard, TrouserCardComunicator.trouserCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserCardComunicator.trouserCard.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserCardGrpcMethodDescriptorSupplier("updateSockCard"))
              .build();
        }
      }
    }
    return getUpdateSockCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrouserCardGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcStub>() {
        @Override
        public TrouserCardGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserCardGrpcStub(channel, callOptions);
        }
      };
    return TrouserCardGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrouserCardGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcBlockingStub>() {
        @Override
        public TrouserCardGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserCardGrpcBlockingStub(channel, callOptions);
        }
      };
    return TrouserCardGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrouserCardGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserCardGrpcFutureStub>() {
        @Override
        public TrouserCardGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserCardGrpcFutureStub(channel, callOptions);
        }
      };
    return TrouserCardGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrouserCardGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getById(TrouserCardComunicator.trouserCardIntReq request,
                        io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void addTrouserCard(TrouserCardComunicator.trouserCard request,
                               io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrouserCardMethod(), responseObserver);
    }

    /**
     */
    public void getAllSockCards(TrouserCardComunicator.trouserCardEmpty request,
                                io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSockCardsMethod(), responseObserver);
    }

    /**
     */
    public void deleteSockCardById(TrouserCardComunicator.trouserCardIntReq request,
                                   io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSockCardByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByTitle(TrouserCardComunicator.trouserCardStringReq request,
                           io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleMethod(), responseObserver);
    }

    /**
     */
    public void updateSockCard(TrouserCardComunicator.trouserCard request,
                               io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSockCardMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCardIntReq,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getAddTrouserCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCard,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_ADD_TROUSER_CARD)))
          .addMethod(
            getGetAllSockCardsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCardEmpty,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_GET_ALL_SOCK_CARDS)))
          .addMethod(
            getDeleteSockCardByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCardIntReq,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_DELETE_SOCK_CARD_BY_ID)))
          .addMethod(
            getGetByTitleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCardStringReq,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_GET_BY_TITLE)))
          .addMethod(
            getUpdateSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserCardComunicator.trouserCard,
                TrouserCardComunicator.trouserCard>(
                  this, METHODID_UPDATE_SOCK_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class TrouserCardGrpcStub extends io.grpc.stub.AbstractAsyncStub<TrouserCardGrpcStub> {
    private TrouserCardGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserCardGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserCardGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getById(TrouserCardComunicator.trouserCardIntReq request,
                        io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTrouserCard(TrouserCardComunicator.trouserCard request,
                               io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrouserCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSockCards(TrouserCardComunicator.trouserCardEmpty request,
                                io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSockCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSockCardById(TrouserCardComunicator.trouserCardIntReq request,
                                   io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitle(TrouserCardComunicator.trouserCardStringReq request,
                           io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSockCard(TrouserCardComunicator.trouserCard request,
                               io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSockCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrouserCardGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrouserCardGrpcBlockingStub> {
    private TrouserCardGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserCardGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserCardGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public TrouserCardComunicator.trouserCard getById(TrouserCardComunicator.trouserCardIntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserCardComunicator.trouserCard addTrouserCard(TrouserCardComunicator.trouserCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrouserCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<TrouserCardComunicator.trouserCard> getAllSockCards(
        TrouserCardComunicator.trouserCardEmpty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSockCardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserCardComunicator.trouserCard deleteSockCardById(TrouserCardComunicator.trouserCardIntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSockCardByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserCardComunicator.trouserCard getByTitle(TrouserCardComunicator.trouserCardStringReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserCardComunicator.trouserCard updateSockCard(TrouserCardComunicator.trouserCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSockCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrouserCardGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<TrouserCardGrpcFutureStub> {
    private TrouserCardGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserCardGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserCardGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserCardComunicator.trouserCard> getById(
        TrouserCardComunicator.trouserCardIntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserCardComunicator.trouserCard> addTrouserCard(
        TrouserCardComunicator.trouserCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrouserCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserCardComunicator.trouserCard> deleteSockCardById(
        TrouserCardComunicator.trouserCardIntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserCardComunicator.trouserCard> getByTitle(
        TrouserCardComunicator.trouserCardStringReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserCardComunicator.trouserCard> updateSockCard(
        TrouserCardComunicator.trouserCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSockCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_ID = 0;
  private static final int METHODID_ADD_TROUSER_CARD = 1;
  private static final int METHODID_GET_ALL_SOCK_CARDS = 2;
  private static final int METHODID_DELETE_SOCK_CARD_BY_ID = 3;
  private static final int METHODID_GET_BY_TITLE = 4;
  private static final int METHODID_UPDATE_SOCK_CARD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrouserCardGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrouserCardGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_ID:
          serviceImpl.getById((TrouserCardComunicator.trouserCardIntReq) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
          break;
        case METHODID_ADD_TROUSER_CARD:
          serviceImpl.addTrouserCard((TrouserCardComunicator.trouserCard) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
          break;
        case METHODID_GET_ALL_SOCK_CARDS:
          serviceImpl.getAllSockCards((TrouserCardComunicator.trouserCardEmpty) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
          break;
        case METHODID_DELETE_SOCK_CARD_BY_ID:
          serviceImpl.deleteSockCardById((TrouserCardComunicator.trouserCardIntReq) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE:
          serviceImpl.getByTitle((TrouserCardComunicator.trouserCardStringReq) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
          break;
        case METHODID_UPDATE_SOCK_CARD:
          serviceImpl.updateSockCard((TrouserCardComunicator.trouserCard) request,
              (io.grpc.stub.StreamObserver<TrouserCardComunicator.trouserCard>) responseObserver);
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

  private static abstract class TrouserCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrouserCardGrpcBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TrouserCardComunicator.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrouserCardGrpc");
    }
  }

  private static final class TrouserCardGrpcFileDescriptorSupplier
      extends TrouserCardGrpcBaseDescriptorSupplier {
    TrouserCardGrpcFileDescriptorSupplier() {}
  }

  private static final class TrouserCardGrpcMethodDescriptorSupplier
      extends TrouserCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrouserCardGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrouserCardGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrouserCardGrpcFileDescriptorSupplier())
              .addMethod(getGetByIdMethod())
              .addMethod(getAddTrouserCardMethod())
              .addMethod(getGetAllSockCardsMethod())
              .addMethod(getDeleteSockCardByIdMethod())
              .addMethod(getGetByTitleMethod())
              .addMethod(getUpdateSockCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
