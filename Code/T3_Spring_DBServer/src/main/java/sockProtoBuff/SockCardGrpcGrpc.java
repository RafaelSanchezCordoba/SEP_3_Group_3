import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: socksComunicator.proto")
public final class SockCardGrpcGrpc {

  private SockCardGrpcGrpc() {}

  public static final String SERVICE_NAME = "SockCardGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SocksComunicator.IntReq,
      SocksComunicator.sockCard> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = SocksComunicator.IntReq.class,
      responseType = SocksComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.IntReq,
      SocksComunicator.sockCard> getGetByIdMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.IntReq, SocksComunicator.sockCard> getGetByIdMethod;
    if ((getGetByIdMethod = SockCardGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getGetByIdMethod = SockCardGrpcGrpc.getGetByIdMethod) == null) {
          SockCardGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.IntReq, SocksComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.IntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.sockCard,
      SocksComunicator.Empty> getAddSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSockCard",
      requestType = SocksComunicator.sockCard.class,
      responseType = SocksComunicator.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.sockCard,
      SocksComunicator.Empty> getAddSockCardMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.sockCard, SocksComunicator.Empty> getAddSockCardMethod;
    if ((getAddSockCardMethod = SockCardGrpcGrpc.getAddSockCardMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getAddSockCardMethod = SockCardGrpcGrpc.getAddSockCardMethod) == null) {
          SockCardGrpcGrpc.getAddSockCardMethod = getAddSockCardMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.sockCard, SocksComunicator.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("addSockCard"))
              .build();
        }
      }
    }
    return getAddSockCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.Empty,
      SocksComunicator.sockCard> getGetAllSockCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSockCards",
      requestType = SocksComunicator.Empty.class,
      responseType = SocksComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SocksComunicator.Empty,
      SocksComunicator.sockCard> getGetAllSockCardsMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.Empty, SocksComunicator.sockCard> getGetAllSockCardsMethod;
    if ((getGetAllSockCardsMethod = SockCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getGetAllSockCardsMethod = SockCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
          SockCardGrpcGrpc.getGetAllSockCardsMethod = getGetAllSockCardsMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.Empty, SocksComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSockCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("getAllSockCards"))
              .build();
        }
      }
    }
    return getGetAllSockCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.IntReq,
      SocksComunicator.sockCard> getDeleteSockCardByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSockCardById",
      requestType = SocksComunicator.IntReq.class,
      responseType = SocksComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.IntReq,
      SocksComunicator.sockCard> getDeleteSockCardByIdMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.IntReq, SocksComunicator.sockCard> getDeleteSockCardByIdMethod;
    if ((getDeleteSockCardByIdMethod = SockCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getDeleteSockCardByIdMethod = SockCardGrpcGrpc.getDeleteSockCardByIdMethod) == null) {
          SockCardGrpcGrpc.getDeleteSockCardByIdMethod = getDeleteSockCardByIdMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.IntReq, SocksComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSockCardById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.IntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("deleteSockCardById"))
              .build();
        }
      }
    }
    return getDeleteSockCardByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.StringReq,
      SocksComunicator.sockCard> getGetByTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitle",
      requestType = SocksComunicator.StringReq.class,
      responseType = SocksComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.StringReq,
      SocksComunicator.sockCard> getGetByTitleMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.StringReq, SocksComunicator.sockCard> getGetByTitleMethod;
    if ((getGetByTitleMethod = SockCardGrpcGrpc.getGetByTitleMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getGetByTitleMethod = SockCardGrpcGrpc.getGetByTitleMethod) == null) {
          SockCardGrpcGrpc.getGetByTitleMethod = getGetByTitleMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.StringReq, SocksComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.StringReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("getByTitle"))
              .build();
        }
      }
    }
    return getGetByTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.sockCard,
      SocksComunicator.sockCard> getUpdateSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSockCard",
      requestType = SocksComunicator.sockCard.class,
      responseType = SocksComunicator.sockCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.sockCard,
      SocksComunicator.sockCard> getUpdateSockCardMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.sockCard, SocksComunicator.sockCard> getUpdateSockCardMethod;
    if ((getUpdateSockCardMethod = SockCardGrpcGrpc.getUpdateSockCardMethod) == null) {
      synchronized (SockCardGrpcGrpc.class) {
        if ((getUpdateSockCardMethod = SockCardGrpcGrpc.getUpdateSockCardMethod) == null) {
          SockCardGrpcGrpc.getUpdateSockCardMethod = getUpdateSockCardMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.sockCard, SocksComunicator.sockCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sockCard.getDefaultInstance()))
              .setSchemaDescriptor(new SockCardGrpcMethodDescriptorSupplier("updateSockCard"))
              .build();
        }
      }
    }
    return getUpdateSockCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SockCardGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcStub>() {
        @java.lang.Override
        public SockCardGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SockCardGrpcStub(channel, callOptions);
        }
      };
    return SockCardGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SockCardGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcBlockingStub>() {
        @java.lang.Override
        public SockCardGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SockCardGrpcBlockingStub(channel, callOptions);
        }
      };
    return SockCardGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SockCardGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SockCardGrpcFutureStub>() {
        @java.lang.Override
        public SockCardGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SockCardGrpcFutureStub(channel, callOptions);
        }
      };
    return SockCardGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SockCardGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getById(SocksComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void addSockCard(SocksComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksComunicator.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSockCardMethod(), responseObserver);
    }

    /**
     */
    public void getAllSockCards(SocksComunicator.Empty request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSockCardsMethod(), responseObserver);
    }

    /**
     */
    public void deleteSockCardById(SocksComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSockCardByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByTitle(SocksComunicator.StringReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleMethod(), responseObserver);
    }

    /**
     */
    public void updateSockCard(SocksComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSockCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.IntReq,
                SocksComunicator.sockCard>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getAddSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.sockCard,
                SocksComunicator.Empty>(
                  this, METHODID_ADD_SOCK_CARD)))
          .addMethod(
            getGetAllSockCardsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SocksComunicator.Empty,
                SocksComunicator.sockCard>(
                  this, METHODID_GET_ALL_SOCK_CARDS)))
          .addMethod(
            getDeleteSockCardByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.IntReq,
                SocksComunicator.sockCard>(
                  this, METHODID_DELETE_SOCK_CARD_BY_ID)))
          .addMethod(
            getGetByTitleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.StringReq,
                SocksComunicator.sockCard>(
                  this, METHODID_GET_BY_TITLE)))
          .addMethod(
            getUpdateSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.sockCard,
                SocksComunicator.sockCard>(
                  this, METHODID_UPDATE_SOCK_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class SockCardGrpcStub extends io.grpc.stub.AbstractAsyncStub<SockCardGrpcStub> {
    private SockCardGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SockCardGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SockCardGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getById(SocksComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSockCard(SocksComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksComunicator.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSockCards(SocksComunicator.Empty request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSockCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSockCardById(SocksComunicator.IntReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitle(SocksComunicator.StringReq request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSockCard(SocksComunicator.sockCard request,
        io.grpc.stub.StreamObserver<SocksComunicator.sockCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSockCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SockCardGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SockCardGrpcBlockingStub> {
    private SockCardGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SockCardGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SockCardGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public SocksComunicator.sockCard getById(SocksComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.Empty addSockCard(SocksComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSockCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SocksComunicator.sockCard> getAllSockCards(
        SocksComunicator.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSockCardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.sockCard deleteSockCardById(SocksComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSockCardByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.sockCard getByTitle(SocksComunicator.StringReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.sockCard updateSockCard(SocksComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSockCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SockCardGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<SockCardGrpcFutureStub> {
    private SockCardGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SockCardGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SockCardGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.sockCard> getById(
        SocksComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.Empty> addSockCard(
        SocksComunicator.sockCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.sockCard> deleteSockCardById(
        SocksComunicator.IntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSockCardByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.sockCard> getByTitle(
        SocksComunicator.StringReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.sockCard> updateSockCard(
        SocksComunicator.sockCard request) {
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
    private final SockCardGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SockCardGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_ID:
          serviceImpl.getById((SocksComunicator.IntReq) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sockCard>) responseObserver);
          break;
        case METHODID_ADD_SOCK_CARD:
          serviceImpl.addSockCard((SocksComunicator.sockCard) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_SOCK_CARDS:
          serviceImpl.getAllSockCards((SocksComunicator.Empty) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sockCard>) responseObserver);
          break;
        case METHODID_DELETE_SOCK_CARD_BY_ID:
          serviceImpl.deleteSockCardById((SocksComunicator.IntReq) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sockCard>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE:
          serviceImpl.getByTitle((SocksComunicator.StringReq) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sockCard>) responseObserver);
          break;
        case METHODID_UPDATE_SOCK_CARD:
          serviceImpl.updateSockCard((SocksComunicator.sockCard) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sockCard>) responseObserver);
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

  private static abstract class SockCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SockCardGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SocksComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SockCardGrpc");
    }
  }

  private static final class SockCardGrpcFileDescriptorSupplier
      extends SockCardGrpcBaseDescriptorSupplier {
    SockCardGrpcFileDescriptorSupplier() {}
  }

  private static final class SockCardGrpcMethodDescriptorSupplier
      extends SockCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SockCardGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (SockCardGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SockCardGrpcFileDescriptorSupplier())
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
