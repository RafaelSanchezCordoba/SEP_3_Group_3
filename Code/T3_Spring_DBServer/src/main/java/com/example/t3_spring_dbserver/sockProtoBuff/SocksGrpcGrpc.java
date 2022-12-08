package com.example.t3_spring_dbserver.sockProtoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: socksComunicator.proto")
public final class SocksGrpcGrpc {

  private SocksGrpcGrpc() {}

  public static final String SERVICE_NAME = "SocksGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SocksComunicator.sock,
      SocksComunicator.EmptySocksMessage> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = SocksComunicator.sock.class,
      responseType = SocksComunicator.EmptySocksMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.sock,
      SocksComunicator.EmptySocksMessage> getCreateMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.sock, SocksComunicator.EmptySocksMessage> getCreateMethod;
    if ((getCreateMethod = SocksGrpcGrpc.getCreateMethod) == null) {
      synchronized (SocksGrpcGrpc.class) {
        if ((getCreateMethod = SocksGrpcGrpc.getCreateMethod) == null) {
          SocksGrpcGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.sock, SocksComunicator.EmptySocksMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.EmptySocksMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksGrpcMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.EmptySocksMessage,
      SocksComunicator.sock> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = SocksComunicator.EmptySocksMessage.class,
      responseType = SocksComunicator.sock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SocksComunicator.EmptySocksMessage,
      SocksComunicator.sock> getGetAllMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.EmptySocksMessage, SocksComunicator.sock> getGetAllMethod;
    if ((getGetAllMethod = SocksGrpcGrpc.getGetAllMethod) == null) {
      synchronized (SocksGrpcGrpc.class) {
        if ((getGetAllMethod = SocksGrpcGrpc.getGetAllMethod) == null) {
          SocksGrpcGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.EmptySocksMessage, SocksComunicator.sock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.EmptySocksMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sock.getDefaultInstance()))
              .setSchemaDescriptor(new SocksGrpcMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.IntReqSock,
      SocksComunicator.sock> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = SocksComunicator.IntReqSock.class,
      responseType = SocksComunicator.sock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.IntReqSock,
      SocksComunicator.sock> getGetByIdMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.IntReqSock, SocksComunicator.sock> getGetByIdMethod;
    if ((getGetByIdMethod = SocksGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (SocksGrpcGrpc.class) {
        if ((getGetByIdMethod = SocksGrpcGrpc.getGetByIdMethod) == null) {
          SocksGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.IntReqSock, SocksComunicator.sock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.IntReqSock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.sock.getDefaultInstance()))
              .setSchemaDescriptor(new SocksGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SocksComunicator.IntReqSock,
      SocksComunicator.EmptySocksMessage> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = SocksComunicator.IntReqSock.class,
      responseType = SocksComunicator.EmptySocksMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SocksComunicator.IntReqSock,
      SocksComunicator.EmptySocksMessage> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<SocksComunicator.IntReqSock, SocksComunicator.EmptySocksMessage> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = SocksGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (SocksGrpcGrpc.class) {
        if ((getDeleteByIdMethod = SocksGrpcGrpc.getDeleteByIdMethod) == null) {
          SocksGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<SocksComunicator.IntReqSock, SocksComunicator.EmptySocksMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.IntReqSock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SocksComunicator.EmptySocksMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SocksGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SocksGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksGrpcStub>() {
        @java.lang.Override
        public SocksGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksGrpcStub(channel, callOptions);
        }
      };
    return SocksGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SocksGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksGrpcBlockingStub>() {
        @java.lang.Override
        public SocksGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksGrpcBlockingStub(channel, callOptions);
        }
      };
    return SocksGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SocksGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocksGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocksGrpcFutureStub>() {
        @java.lang.Override
        public SocksGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocksGrpcFutureStub(channel, callOptions);
        }
      };
    return SocksGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SocksGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(SocksComunicator.sock request,
        io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAll(SocksComunicator.EmptySocksMessage request,
        io.grpc.stub.StreamObserver<SocksComunicator.sock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getById(SocksComunicator.IntReqSock request,
        io.grpc.stub.StreamObserver<SocksComunicator.sock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(SocksComunicator.IntReqSock request,
        io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.sock,
                SocksComunicator.EmptySocksMessage>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                SocksComunicator.EmptySocksMessage,
                SocksComunicator.sock>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.IntReqSock,
                SocksComunicator.sock>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SocksComunicator.IntReqSock,
                SocksComunicator.EmptySocksMessage>(
                  this, METHODID_DELETE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SocksGrpcStub extends io.grpc.stub.AbstractAsyncStub<SocksGrpcStub> {
    private SocksGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksGrpcStub(channel, callOptions);
    }

    /**
     */
    public void create(SocksComunicator.sock request,
        io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(SocksComunicator.EmptySocksMessage request,
        io.grpc.stub.StreamObserver<SocksComunicator.sock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(SocksComunicator.IntReqSock request,
        io.grpc.stub.StreamObserver<SocksComunicator.sock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(SocksComunicator.IntReqSock request,
        io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SocksGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<SocksGrpcBlockingStub> {
    private SocksGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public SocksComunicator.EmptySocksMessage create(SocksComunicator.sock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<SocksComunicator.sock> getAll(
        SocksComunicator.EmptySocksMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.sock getById(SocksComunicator.IntReqSock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public SocksComunicator.EmptySocksMessage deleteById(SocksComunicator.IntReqSock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SocksGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<SocksGrpcFutureStub> {
    private SocksGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocksGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocksGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.EmptySocksMessage> create(
        SocksComunicator.sock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.sock> getById(
        SocksComunicator.IntReqSock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SocksComunicator.EmptySocksMessage> deleteById(
        SocksComunicator.IntReqSock request) {
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
    private final SocksGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SocksGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((SocksComunicator.sock) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((SocksComunicator.EmptySocksMessage) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sock>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((SocksComunicator.IntReqSock) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.sock>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((SocksComunicator.IntReqSock) request,
              (io.grpc.stub.StreamObserver<SocksComunicator.EmptySocksMessage>) responseObserver);
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

  private static abstract class SocksGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SocksGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SocksComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SocksGrpc");
    }
  }

  private static final class SocksGrpcFileDescriptorSupplier
      extends SocksGrpcBaseDescriptorSupplier {
    SocksGrpcFileDescriptorSupplier() {}
  }

  private static final class SocksGrpcMethodDescriptorSupplier
      extends SocksGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SocksGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (SocksGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SocksGrpcFileDescriptorSupplier())
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
