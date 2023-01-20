package com.protoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: productComunicator.proto")
public final class ProductGrpcGrpc {

  private ProductGrpcGrpc() {}

  public static final String SERVICE_NAME = "ProductGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProductComunicator.product,
      ProductComunicator.product> getCreateSockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSock",
      requestType = ProductComunicator.product.class,
      responseType = ProductComunicator.product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductComunicator.product,
      ProductComunicator.product> getCreateSockMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.product, ProductComunicator.product> getCreateSockMethod;
    if ((getCreateSockMethod = ProductGrpcGrpc.getCreateSockMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getCreateSockMethod = ProductGrpcGrpc.getCreateSockMethod) == null) {
          ProductGrpcGrpc.getCreateSockMethod = getCreateSockMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.product, ProductComunicator.product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("createSock"))
              .build();
        }
      }
    }
    return getCreateSockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductComunicator.product,
      ProductComunicator.product> getCreateTrouserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTrouser",
      requestType = ProductComunicator.product.class,
      responseType = ProductComunicator.product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductComunicator.product,
      ProductComunicator.product> getCreateTrouserMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.product, ProductComunicator.product> getCreateTrouserMethod;
    if ((getCreateTrouserMethod = ProductGrpcGrpc.getCreateTrouserMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getCreateTrouserMethod = ProductGrpcGrpc.getCreateTrouserMethod) == null) {
          ProductGrpcGrpc.getCreateTrouserMethod = getCreateTrouserMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.product, ProductComunicator.product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTrouser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("createTrouser"))
              .build();
        }
      }
    }
    return getCreateTrouserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct,
      ProductComunicator.product> getGetAllSocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSocks",
      requestType = ProductComunicator.emptyMessageProduct.class,
      responseType = ProductComunicator.product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct,
      ProductComunicator.product> getGetAllSocksMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct, ProductComunicator.product> getGetAllSocksMethod;
    if ((getGetAllSocksMethod = ProductGrpcGrpc.getGetAllSocksMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getGetAllSocksMethod = ProductGrpcGrpc.getGetAllSocksMethod) == null) {
          ProductGrpcGrpc.getGetAllSocksMethod = getGetAllSocksMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.emptyMessageProduct, ProductComunicator.product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.emptyMessageProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("getAllSocks"))
              .build();
        }
      }
    }
    return getGetAllSocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct,
      ProductComunicator.product> getGetAllTrousersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTrousers",
      requestType = ProductComunicator.emptyMessageProduct.class,
      responseType = ProductComunicator.product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct,
      ProductComunicator.product> getGetAllTrousersMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.emptyMessageProduct, ProductComunicator.product> getGetAllTrousersMethod;
    if ((getGetAllTrousersMethod = ProductGrpcGrpc.getGetAllTrousersMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getGetAllTrousersMethod = ProductGrpcGrpc.getGetAllTrousersMethod) == null) {
          ProductGrpcGrpc.getGetAllTrousersMethod = getGetAllTrousersMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.emptyMessageProduct, ProductComunicator.product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllTrousers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.emptyMessageProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("getAllTrousers"))
              .build();
        }
      }
    }
    return getGetAllTrousersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductComunicator.intReqProduct,
      ProductComunicator.product> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = ProductComunicator.intReqProduct.class,
      responseType = ProductComunicator.product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductComunicator.intReqProduct,
      ProductComunicator.product> getGetByIdMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.intReqProduct, ProductComunicator.product> getGetByIdMethod;
    if ((getGetByIdMethod = ProductGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getGetByIdMethod = ProductGrpcGrpc.getGetByIdMethod) == null) {
          ProductGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.intReqProduct, ProductComunicator.product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.intReqProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductComunicator.intReqProduct,
      ProductComunicator.StringMessageProduct> getDeleteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteById",
      requestType = ProductComunicator.intReqProduct.class,
      responseType = ProductComunicator.StringMessageProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductComunicator.intReqProduct,
      ProductComunicator.StringMessageProduct> getDeleteByIdMethod() {
    io.grpc.MethodDescriptor<ProductComunicator.intReqProduct, ProductComunicator.StringMessageProduct> getDeleteByIdMethod;
    if ((getDeleteByIdMethod = ProductGrpcGrpc.getDeleteByIdMethod) == null) {
      synchronized (ProductGrpcGrpc.class) {
        if ((getDeleteByIdMethod = ProductGrpcGrpc.getDeleteByIdMethod) == null) {
          ProductGrpcGrpc.getDeleteByIdMethod = getDeleteByIdMethod =
              io.grpc.MethodDescriptor.<ProductComunicator.intReqProduct, ProductComunicator.StringMessageProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.intReqProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductComunicator.StringMessageProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ProductGrpcMethodDescriptorSupplier("deleteById"))
              .build();
        }
      }
    }
    return getDeleteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGrpcStub>() {
        @java.lang.Override
        public ProductGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGrpcStub(channel, callOptions);
        }
      };
    return ProductGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGrpcBlockingStub>() {
        @java.lang.Override
        public ProductGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGrpcBlockingStub(channel, callOptions);
        }
      };
    return ProductGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductGrpcFutureStub>() {
        @java.lang.Override
        public ProductGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductGrpcFutureStub(channel, callOptions);
        }
      };
    return ProductGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSock(ProductComunicator.product request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSockMethod(), responseObserver);
    }

    /**
     */
    public void createTrouser(ProductComunicator.product request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTrouserMethod(), responseObserver);
    }

    /**
     */
    public void getAllSocks(ProductComunicator.emptyMessageProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSocksMethod(), responseObserver);
    }

    /**
     */
    public void getAllTrousers(ProductComunicator.emptyMessageProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTrousersMethod(), responseObserver);
    }

    /**
     */
    public void getById(ProductComunicator.intReqProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteById(ProductComunicator.intReqProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.StringMessageProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductComunicator.product,
                ProductComunicator.product>(
                  this, METHODID_CREATE_SOCK)))
          .addMethod(
            getCreateTrouserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductComunicator.product,
                ProductComunicator.product>(
                  this, METHODID_CREATE_TROUSER)))
          .addMethod(
            getGetAllSocksMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ProductComunicator.emptyMessageProduct,
                ProductComunicator.product>(
                  this, METHODID_GET_ALL_SOCKS)))
          .addMethod(
            getGetAllTrousersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ProductComunicator.emptyMessageProduct,
                ProductComunicator.product>(
                  this, METHODID_GET_ALL_TROUSERS)))
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductComunicator.intReqProduct,
                ProductComunicator.product>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getDeleteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductComunicator.intReqProduct,
                ProductComunicator.StringMessageProduct>(
                  this, METHODID_DELETE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ProductGrpcStub extends io.grpc.stub.AbstractAsyncStub<ProductGrpcStub> {
    private ProductGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGrpcStub(channel, callOptions);
    }

    /**
     */
    public void createSock(ProductComunicator.product request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTrouser(ProductComunicator.product request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTrouserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSocks(ProductComunicator.emptyMessageProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTrousers(ProductComunicator.emptyMessageProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllTrousersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(ProductComunicator.intReqProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteById(ProductComunicator.intReqProduct request,
        io.grpc.stub.StreamObserver<ProductComunicator.StringMessageProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductGrpcBlockingStub> {
    private ProductGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductComunicator.product createSock(ProductComunicator.product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSockMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductComunicator.product createTrouser(ProductComunicator.product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTrouserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ProductComunicator.product> getAllSocks(
        ProductComunicator.emptyMessageProduct request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSocksMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ProductComunicator.product> getAllTrousers(
        ProductComunicator.emptyMessageProduct request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllTrousersMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductComunicator.product getById(ProductComunicator.intReqProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductComunicator.StringMessageProduct deleteById(ProductComunicator.intReqProduct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ProductGrpcFutureStub> {
    private ProductGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductComunicator.product> createSock(
        ProductComunicator.product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductComunicator.product> createTrouser(
        ProductComunicator.product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTrouserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductComunicator.product> getById(
        ProductComunicator.intReqProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductComunicator.StringMessageProduct> deleteById(
        ProductComunicator.intReqProduct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SOCK = 0;
  private static final int METHODID_CREATE_TROUSER = 1;
  private static final int METHODID_GET_ALL_SOCKS = 2;
  private static final int METHODID_GET_ALL_TROUSERS = 3;
  private static final int METHODID_GET_BY_ID = 4;
  private static final int METHODID_DELETE_BY_ID = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SOCK:
          serviceImpl.createSock((ProductComunicator.product) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.product>) responseObserver);
          break;
        case METHODID_CREATE_TROUSER:
          serviceImpl.createTrouser((ProductComunicator.product) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.product>) responseObserver);
          break;
        case METHODID_GET_ALL_SOCKS:
          serviceImpl.getAllSocks((ProductComunicator.emptyMessageProduct) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.product>) responseObserver);
          break;
        case METHODID_GET_ALL_TROUSERS:
          serviceImpl.getAllTrousers((ProductComunicator.emptyMessageProduct) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.product>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((ProductComunicator.intReqProduct) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.product>) responseObserver);
          break;
        case METHODID_DELETE_BY_ID:
          serviceImpl.deleteById((ProductComunicator.intReqProduct) request,
              (io.grpc.stub.StreamObserver<ProductComunicator.StringMessageProduct>) responseObserver);
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

  private static abstract class ProductGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ProductComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductGrpc");
    }
  }

  private static final class ProductGrpcFileDescriptorSupplier
      extends ProductGrpcBaseDescriptorSupplier {
    ProductGrpcFileDescriptorSupplier() {}
  }

  private static final class ProductGrpcMethodDescriptorSupplier
      extends ProductGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductGrpcFileDescriptorSupplier())
              .addMethod(getCreateSockMethod())
              .addMethod(getCreateTrouserMethod())
              .addMethod(getGetAllSocksMethod())
              .addMethod(getGetAllTrousersMethod())
              .addMethod(getGetByIdMethod())
              .addMethod(getDeleteByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
