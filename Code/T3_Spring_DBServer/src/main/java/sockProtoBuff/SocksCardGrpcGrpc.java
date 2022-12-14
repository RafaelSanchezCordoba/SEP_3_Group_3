import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: socksCardComunicator.proto")
public final class SocksCardGrpcGrpc {

  private SocksCardGrpcGrpc() {}

  public static final String SERVICE_NAME = "SocksCardGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.IntReq,
      SocksCardComunicator.sockCard> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = SocksCardComunicator.IntReq.class,
      responseType = SocksCardComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.IntReq,
      SocksCardComunicator.sockCard> getGetByIdMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.IntReq, SocksCardComunicator.sockCard> getGetByIdMethod;
    if ((getGetByIdMethod = SocksCardGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getGetByIdMethod = SocksCardGrpcGrpc.getGetByIdMethod) == null) {
          SocksCardGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.IntReq, SocksCardComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.IntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.sockCard,
      SocksCardComunicator.Empty> getAddSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSockCard",
      requestType = SocksCardComunicator.sockCard.class,
      responseType = SocksCardComunicator.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.sockCard,
      SocksCardComunicator.Empty> getAddSockCardMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.sockCard, SocksCardComunicator.Empty> getAddSockCardMethod;
    if ((getAddSockCardMethod = SocksCardGrpcGrpc.getAddSockCardMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getAddSockCardMethod = SocksCardGrpcGrpc.getAddSockCardMethod) == null) {
          SocksCardGrpcGrpc.getAddSockCardMethod = getAddSockCardMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.sockCard, SocksCardComunicator.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("addSockCard"))
              .build();
        }
      }
    }
    return getAddSockCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.Empty,
      SocksCardComunicator.sockCard> getGetAllSockCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSockCards",
      requestType = SocksCardComunicator.Empty.class,
      responseType = SocksCardComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.Empty,
      SocksCardComunicator.sockCard> getGetAllSockCardsMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.Empty, SocksCardComunicator.sockCard> getGetAllSockCardsMethod;
    if ((getGetAllSockCardsMethod = SocksCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getGetAllSockCardsMethod = SocksCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
          SocksCardGrpcGrpc.getGetAllSockCardsMethod = getGetAllSockCardsMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.Empty, SocksCardComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSockCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("getAllSockCards"))
              .build();
        }
      }
    }
    return getGetAllSockCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.IntReq,
      SocksCardComunicator.sockCard> getDeleteSockCardByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSockCardById",
      requestType = SocksCardComunicator.IntReq.class,
      responseType = SocksCardComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.IntReq,
      SocksCardComunicator.sockCard> getDeleteSockCardByIdMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.IntReq, SocksCardComunicator.sockCard> getDeleteSockCardByIdMethod;
    if ((getDeleteSockCardByIdMethod = SocksCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getDeleteSockCardByIdMethod = SocksCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
          SocksCardGrpcGrpc.getDeleteSockCardByIdMethod = getDeleteSockCardByIdMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.IntReq, SocksCardComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSockCardById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.IntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("deleteSockCardById"))
              .build();
        }
      }
    }
    return getDeleteSockCardByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.StringReq,
      SocksCardComunicator.sockCard> getGetByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitle",
      requestType = SocksCardComunicator.StringReq.class,
      responseType = SocksCardComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.StringReq,
      SocksCardComunicator.sockCard> getGetByTitleMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.StringReq, SocksCardComunicator.sockCard> getGetByTitleMethod;
    if ((getGetByTitleMethod = SocksCardGrpcGrpc.getGetByTitleMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getGetByTitleMethod = SocksCardGrpcGrpc.getGetByTitleMethod) == null) {
          SocksCardGrpcGrpc.getGetByTitleMethod = getGetByTitleMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.StringReq, SocksCardComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.StringReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("getByTitle"))
              .build();
        }
      }
    }
    return getGetByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksCardComunicator.sockCard,
      SocksCardComunicator.sockCard> getUpdateSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSockCard",
      requestType = SocksCardComunicator.sockCard.class,
      responseType = SocksCardComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksCardComunicator.sockCard,
      SocksCardComunicator.sockCard> getUpdateSockCardMethod() {
    io.grpc.MethodDescriptor<SocksCardComunicator.sockCard, SocksCardComunicator.sockCard> getUpdateSockCardMethod;
    if ((getUpdateSockCardMethod = SocksCardGrpcGrpc.getUpdateSockCardMethod) == null) {
      synchronized (SocksCardGrpcGrpc.class) {
        if ((getUpdateSockCardMethod = SocksCardGrpcGrpc.getUpdateSockCardMethod) == null) {
          SocksCardGrpcGrpc.getUpdateSockCardMethod = getUpdateSockCardMethod =
              io.grpc.MethodDescriptor.<SocksCardComunicator.sockCard, SocksCardComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksCardComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SocksCardGrpcMethodDescriptorSupplier("updateSockCard"))
              .build();
        }
      }
    }
    return getUpdateSockCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SocksCardGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcStub>() {
        @java.lang.Override
        public SocksCardGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksCardGrpcStub(channel, callOptions);
        }
      };
    return SocksCardGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SocksCardGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcBlockingStub>() {
        @java.lang.Override
        public SocksCardGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksCardGrpcBlockingStub(channel, callOptions);
        }
      };
    return SocksCardGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SocksCardGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksCardGrpcFutureStub>() {
        @java.lang.Override
        public SocksCardGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksCardGrpcFutureStub(channel, callOptions);
        }
      };
    return SocksCardGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SocksCardGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getById(SocksCardComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void addSockCard(SocksCardComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSockCardMethod(), responseObserver);
    }

    /**
     */
    public void getAllSockCards(SocksCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSockCardsMethod(), responseObserver);
    }

    /**
     */
    public void deleteSockCardById(SocksCardComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSockCardByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByTitle(SocksCardComunicator.StringReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleMethod(), responseObserver);
    }

    /**
     */
    public void updateSockCard(SocksCardComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSockCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksCardComunicator.IntReq,
                SocksCardComunicator.sockCard>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getAddSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksCardComunicator.sockCard,
                SocksCardComunicator.Empty>(
                  this, METHODID_ADD_SOCK_CARD)))
          .addMethod(
            getGetAllSockCardsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SocksCardComunicator.Empty,
                SocksCardComunicator.sockCard>(
                  this, METHODID_GET_ALL_SOCK_CARDS)))
          .addMethod(
            getDeleteSockCardByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksCardComunicator.IntReq,
                SocksCardComunicator.sockCard>(
                  this, METHODID_DELETE_SOCK_CARD_BY_ID)))
          .addMethod(
            getGetByTitleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksCardComunicator.StringReq,
                SocksCardComunicator.sockCard>(
                  this, METHODID_GET_BY_TITLE)))
          .addMethod(
            getUpdateSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksCardComunicator.sockCard,
                SocksCardComunicator.sockCard>(
                  this, METHODID_UPDATE_SOCK_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class SocksCardGrpcStub extends io.grpc.stub.AbstractAsyncStub<SocksCardGrpcStub> {
    private SocksCardGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksCardGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksCardGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getById(SocksCardComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSockCard(SocksCardComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSockCards(SocksCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSockCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSockCardById(SocksCardComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitle(SocksCardComunicator.StringReq request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSockCard(SocksCardComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSockCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SocksCardGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SocksCardGrpcBlockingStub> {
    private SocksCardGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksCardGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksCardGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public SocksCardComunicator.sockCard getById(SocksCardComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksCardComunicator.Empty addSockCard(SocksCardComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSockCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SocksCardComunicator.sockCard> getAllSockCards(
        SocksCardComunicator.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSockCardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksCardComunicator.sockCard deleteSockCardById(SocksCardComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSockCardByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksCardComunicator.sockCard getByTitle(SocksCardComunicator.StringReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksCardComunicator.sockCard updateSockCard(SocksCardComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSockCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SocksCardGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<SocksCardGrpcFutureStub> {
    private SocksCardGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksCardGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksCardGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksCardComunicator.sockCard> getById(
        SocksCardComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksCardComunicator.Empty> addSockCard(
        SocksCardComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksCardComunicator.sockCard> deleteSockCardById(
        SocksCardComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksCardComunicator.sockCard> getByTitle(
        SocksCardComunicator.StringReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksCardComunicator.sockCard> updateSockCard(
        SocksCardComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSockCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_ID = 0;
  private static final int METHODID_ADD_SOCK_CARD = 1;
  private static final int METHODID_GET_ALL_SOCK_CARDS = 2;
  private static final int METHODID_DELETE_SOCK_CARD_BY_ID = 3;
  private static final int METHODID_GET_BY_TITLE = 4;
  private static final int METHODID_UPDATE_SOCK_CARD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SocksCardGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SocksCardGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_ID:
          serviceImpl.getById((SocksCardComunicator.IntReq) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard>) responseObserver);
          break;
        case METHODID_ADD_SOCK_CARD:
          serviceImpl.addSockCard((SocksCardComunicator.sockCard) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_SOCK_CARDS:
          serviceImpl.getAllSockCards((SocksCardComunicator.Empty) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard>) responseObserver);
          break;
        case METHODID_DELETE_SOCK_CARD_BY_ID:
          serviceImpl.deleteSockCardById((SocksCardComunicator.IntReq) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE:
          serviceImpl.getByTitle((SocksCardComunicator.StringReq) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard>) responseObserver);
          break;
        case METHODID_UPDATE_SOCK_CARD:
          serviceImpl.updateSockCard((SocksCardComunicator.sockCard) request,
              (io.grpc.stub.StreamObserver<SocksCardComunicator.sockCard>) responseObserver);
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

  private static abstract class SocksCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SocksCardGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SocksCardComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SocksCardGrpc");
    }
  }

  private static final class SocksCardGrpcFileDescriptorSupplier
      extends SocksCardGrpcBaseDescriptorSupplier {
    SocksCardGrpcFileDescriptorSupplier() {}
  }

  private static final class SocksCardGrpcMethodDescriptorSupplier
      extends SocksCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SocksCardGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (SocksCardGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SocksCardGrpcFileDescriptorSupplier())
              .addMethod(getGetByIdMethod())
              .addMethod(getAddSockCardMethod())
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
