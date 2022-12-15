package com.example.t3_spring_dbserver.sockProtoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: trouserComunicator.proto")
public final class TrouserGrpcGrpc {

  private TrouserGrpcGrpc() {}

  public static final String SERVICE_NAME = "TrouserGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TrouserComunicator.trouser,
      TrouserComunicator.trouser> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = TrouserComunicator.trouser.class,
      responseType = TrouserComunicator.trouser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserComunicator.trouser,
      TrouserComunicator.trouser> getCreateMethod() {
    io.grpc.MethodDescriptor<TrouserComunicator.trouser, TrouserComunicator.trouser> getCreateMethod;
    if ((getCreateMethod = TrouserGrpcGrpc.getCreateMethod) == null) {
      synchronized (TrouserGrpcGrpc.class) {
        if ((getCreateMethod = TrouserGrpcGrpc.getCreateMethod) == null) {
          TrouserGrpcGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<TrouserComunicator.trouser, TrouserComunicator.trouser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouser.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserGrpcMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserComunicator.trouserEmpty,
      TrouserComunicator.trouser> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = TrouserComunicator.trouserEmpty.class,
      responseType = TrouserComunicator.trouser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<TrouserComunicator.trouserEmpty,
      TrouserComunicator.trouser> getGetAllMethod() {
    io.grpc.MethodDescriptor<TrouserComunicator.trouserEmpty, TrouserComunicator.trouser> getGetAllMethod;
    if ((getGetAllMethod = TrouserGrpcGrpc.getGetAllMethod) == null) {
      synchronized (TrouserGrpcGrpc.class) {
        if ((getGetAllMethod = TrouserGrpcGrpc.getGetAllMethod) == null) {
          TrouserGrpcGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<TrouserComunicator.trouserEmpty, TrouserComunicator.trouser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouserEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouser.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserGrpcMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq,
      TrouserComunicator.trouser> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = TrouserComunicator.trouserIntReq.class,
      responseType = TrouserComunicator.trouser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq,
      TrouserComunicator.trouser> getGetByIdMethod() {
    io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq, TrouserComunicator.trouser> getGetByIdMethod;
    if ((getGetByIdMethod = TrouserGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (TrouserGrpcGrpc.class) {
        if ((getGetByIdMethod = TrouserGrpcGrpc.getGetByIdMethod) == null) {
          TrouserGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<TrouserComunicator.trouserIntReq, TrouserComunicator.trouser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouserIntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouser.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq,
      TrouserComunicator.trouserEmpty> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = TrouserComunicator.trouserIntReq.class,
      responseType = TrouserComunicator.trouserEmpty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq,
      TrouserComunicator.trouserEmpty> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<TrouserComunicator.trouserIntReq, TrouserComunicator.trouserEmpty> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = TrouserGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (TrouserGrpcGrpc.class) {
        if ((getDeleteByIdMethod = TrouserGrpcGrpc.getDeleteByIdMethod) == null) {
          TrouserGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<TrouserComunicator.trouserIntReq, TrouserComunicator.trouserEmpty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouserIntReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TrouserComunicator.trouserEmpty.getDefaultInstance()))
              .setSchemaDescriptor(new TrouserGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrouserGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcStub>() {
        @Override
        public TrouserGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserGrpcStub(channel, callOptions);
        }
      };
    return TrouserGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrouserGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcBlockingStub>() {
        @Override
        public TrouserGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserGrpcBlockingStub(channel, callOptions);
        }
      };
    return TrouserGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrouserGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrouserGrpcFutureStub>() {
        @Override
        public TrouserGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrouserGrpcFutureStub(channel, callOptions);
        }
      };
    return TrouserGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrouserGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(TrouserComunicator.trouser request,
                       io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAll(TrouserComunicator.trouserEmpty request,
                       io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(TrouserComunicator.trouserIntReq request,
                        io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(TrouserComunicator.trouserIntReq request,
                           io.grpc.stub.StreamObserver<TrouserComunicator.trouserEmpty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserComunicator.trouser,
                TrouserComunicator.trouser>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                TrouserComunicator.trouserEmpty,
                TrouserComunicator.trouser>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserComunicator.trouserIntReq,
                TrouserComunicator.trouser>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                TrouserComunicator.trouserIntReq,
                TrouserComunicator.trouserEmpty>(
                  this, METHODID_DELETE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class TrouserGrpcStub extends io.grpc.stub.AbstractAsyncStub<TrouserGrpcStub> {
    private TrouserGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserGrpcStub(channel, callOptions);
    }

    /**
     */
    public void create(TrouserComunicator.trouser request,
                       io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(TrouserComunicator.trouserEmpty request,
                       io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(TrouserComunicator.trouserIntReq request,
                        io.grpc.stub.StreamObserver<TrouserComunicator.trouser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(TrouserComunicator.trouserIntReq request,
                           io.grpc.stub.StreamObserver<TrouserComunicator.trouserEmpty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrouserGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrouserGrpcBlockingStub> {
    private TrouserGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public TrouserComunicator.trouser create(TrouserComunicator.trouser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<TrouserComunicator.trouser> getAll(
        TrouserComunicator.trouserEmpty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserComunicator.trouser getById(TrouserComunicator.trouserIntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public TrouserComunicator.trouserEmpty deleteById(TrouserComunicator.trouserIntReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrouserGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<TrouserGrpcFutureStub> {
    private TrouserGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TrouserGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrouserGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserComunicator.trouser> create(
        TrouserComunicator.trouser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserComunicator.trouser> getById(
        TrouserComunicator.trouserIntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TrouserComunicator.trouserEmpty> deleteById(
        TrouserComunicator.trouserIntReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET_BY_ID = 2;
  private static final int METHODID_DELETE_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrouserGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrouserGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((TrouserComunicator.trouser) request,
              (io.grpc.stub.StreamObserver<TrouserComunicator.trouser>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((TrouserComunicator.trouserEmpty) request,
              (io.grpc.stub.StreamObserver<TrouserComunicator.trouser>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((TrouserComunicator.trouserIntReq) request,
              (io.grpc.stub.StreamObserver<TrouserComunicator.trouser>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((TrouserComunicator.trouserIntReq) request,
              (io.grpc.stub.StreamObserver<TrouserComunicator.trouserEmpty>) responseObserver);
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

  private static abstract class TrouserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrouserGrpcBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TrouserComunicator.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrouserGrpc");
    }
  }

  private static final class TrouserGrpcFileDescriptorSupplier
      extends TrouserGrpcBaseDescriptorSupplier {
    TrouserGrpcFileDescriptorSupplier() {}
  }

  private static final class TrouserGrpcMethodDescriptorSupplier
      extends TrouserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrouserGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrouserGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrouserGrpcFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getDeleteByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
