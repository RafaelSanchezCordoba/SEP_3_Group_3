package com.protoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: productCardComunicator.proto")
public final class ProductCardGrpcGrpc {

  private ProductCardGrpcGrpc() {}

  public static final String SERVICE_NAME = "ProductCardGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard,
      ProductCardComunicator.productCard> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getById",
      requestType = ProductCardComunicator.IntReqCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard,
      ProductCardComunicator.productCard> getGetByIdMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard, ProductCardComunicator.productCard> getGetByIdMethod;
    if ((getGetByIdMethod = ProductCardGrpcGrpc.getGetByIdMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getGetByIdMethod = ProductCardGrpcGrpc.getGetByIdMethod) == null) {
          ProductCardGrpcGrpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.IntReqCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.IntReqCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("getById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getAddSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSockCard",
      requestType = ProductCardComunicator.productCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getAddSockCardMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.productCard, ProductCardComunicator.productCard> getAddSockCardMethod;
    if ((getAddSockCardMethod = ProductCardGrpcGrpc.getAddSockCardMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getAddSockCardMethod = ProductCardGrpcGrpc.getAddSockCardMethod) == null) {
          ProductCardGrpcGrpc.getAddSockCardMethod = getAddSockCardMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.productCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("addSockCard"))
              .build();
        }
      }
    }
    return getAddSockCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getAddTrouserCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTrouserCard",
      requestType = ProductCardComunicator.productCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getAddTrouserCardMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.productCard, ProductCardComunicator.productCard> getAddTrouserCardMethod;
    if ((getAddTrouserCardMethod = ProductCardGrpcGrpc.getAddTrouserCardMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getAddTrouserCardMethod = ProductCardGrpcGrpc.getAddTrouserCardMethod) == null) {
          ProductCardGrpcGrpc.getAddTrouserCardMethod = getAddTrouserCardMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.productCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addTrouserCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("addTrouserCard"))
              .build();
        }
      }
    }
    return getAddTrouserCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.Empty,
      ProductCardComunicator.productCard> getGetAllSockCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSockCards",
      requestType = ProductCardComunicator.Empty.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.Empty,
      ProductCardComunicator.productCard> getGetAllSockCardsMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.Empty, ProductCardComunicator.productCard> getGetAllSockCardsMethod;
    if ((getGetAllSockCardsMethod = ProductCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getGetAllSockCardsMethod = ProductCardGrpcGrpc.getGetAllSockCardsMethod) == null) {
          ProductCardGrpcGrpc.getGetAllSockCardsMethod = getGetAllSockCardsMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.Empty, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSockCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("getAllSockCards"))
              .build();
        }
      }
    }
    return getGetAllSockCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.Empty,
      ProductCardComunicator.productCard> getGetAllTrouserCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTrouserCards",
      requestType = ProductCardComunicator.Empty.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.Empty,
      ProductCardComunicator.productCard> getGetAllTrouserCardsMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.Empty, ProductCardComunicator.productCard> getGetAllTrouserCardsMethod;
    if ((getGetAllTrouserCardsMethod = ProductCardGrpcGrpc.getGetAllTrouserCardsMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getGetAllTrouserCardsMethod = ProductCardGrpcGrpc.getGetAllTrouserCardsMethod) == null) {
          ProductCardGrpcGrpc.getGetAllTrouserCardsMethod = getGetAllTrouserCardsMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.Empty, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllTrouserCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("getAllTrouserCards"))
              .build();
        }
      }
    }
    return getGetAllTrouserCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard,
      ProductCardComunicator.productCard> getDeleteProductCardByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProductCardById",
      requestType = ProductCardComunicator.IntReqCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard,
      ProductCardComunicator.productCard> getDeleteProductCardByIdMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.IntReqCard, ProductCardComunicator.productCard> getDeleteProductCardByIdMethod;
    if ((getDeleteProductCardByIdMethod = ProductCardGrpcGrpc.getDeleteProductCardByIdMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getDeleteProductCardByIdMethod = ProductCardGrpcGrpc.getDeleteProductCardByIdMethod) == null) {
          ProductCardGrpcGrpc.getDeleteProductCardByIdMethod = getDeleteProductCardByIdMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.IntReqCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProductCardById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.IntReqCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("deleteProductCardById"))
              .build();
        }
      }
    }
    return getDeleteProductCardByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard,
      ProductCardComunicator.productCard> getGetByTitleSockCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitleSockCard",
      requestType = ProductCardComunicator.StringReqCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard,
      ProductCardComunicator.productCard> getGetByTitleSockCardMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard, ProductCardComunicator.productCard> getGetByTitleSockCardMethod;
    if ((getGetByTitleSockCardMethod = ProductCardGrpcGrpc.getGetByTitleSockCardMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getGetByTitleSockCardMethod = ProductCardGrpcGrpc.getGetByTitleSockCardMethod) == null) {
          ProductCardGrpcGrpc.getGetByTitleSockCardMethod = getGetByTitleSockCardMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.StringReqCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitleSockCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.StringReqCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("getByTitleSockCard"))
              .build();
        }
      }
    }
    return getGetByTitleSockCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard,
      ProductCardComunicator.productCard> getGetByTitleTrouserCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByTitleTrouserCard",
      requestType = ProductCardComunicator.StringReqCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard,
      ProductCardComunicator.productCard> getGetByTitleTrouserCardMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.StringReqCard, ProductCardComunicator.productCard> getGetByTitleTrouserCardMethod;
    if ((getGetByTitleTrouserCardMethod = ProductCardGrpcGrpc.getGetByTitleTrouserCardMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getGetByTitleTrouserCardMethod = ProductCardGrpcGrpc.getGetByTitleTrouserCardMethod) == null) {
          ProductCardGrpcGrpc.getGetByTitleTrouserCardMethod = getGetByTitleTrouserCardMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.StringReqCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByTitleTrouserCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.StringReqCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("getByTitleTrouserCard"))
              .build();
        }
      }
    }
    return getGetByTitleTrouserCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getUpdateCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCard",
      requestType = ProductCardComunicator.productCard.class,
      responseType = ProductCardComunicator.productCard.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProductCardComunicator.productCard,
      ProductCardComunicator.productCard> getUpdateCardMethod() {
    io.grpc.MethodDescriptor<ProductCardComunicator.productCard, ProductCardComunicator.productCard> getUpdateCardMethod;
    if ((getUpdateCardMethod = ProductCardGrpcGrpc.getUpdateCardMethod) == null) {
      synchronized (ProductCardGrpcGrpc.class) {
        if ((getUpdateCardMethod = ProductCardGrpcGrpc.getUpdateCardMethod) == null) {
          ProductCardGrpcGrpc.getUpdateCardMethod = getUpdateCardMethod =
              io.grpc.MethodDescriptor.<ProductCardComunicator.productCard, ProductCardComunicator.productCard>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProductCardComunicator.productCard.getDefaultInstance()))
              .setSchemaDescriptor(new ProductCardGrpcMethodDescriptorSupplier("updateCard"))
              .build();
        }
      }
    }
    return getUpdateCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductCardGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcStub>() {
        @java.lang.Override
        public ProductCardGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCardGrpcStub(channel, callOptions);
        }
      };
    return ProductCardGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductCardGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcBlockingStub>() {
        @java.lang.Override
        public ProductCardGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCardGrpcBlockingStub(channel, callOptions);
        }
      };
    return ProductCardGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductCardGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductCardGrpcFutureStub>() {
        @java.lang.Override
        public ProductCardGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductCardGrpcFutureStub(channel, callOptions);
        }
      };
    return ProductCardGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductCardGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getById(ProductCardComunicator.IntReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void addSockCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSockCardMethod(), responseObserver);
    }

    /**
     */
    public void addTrouserCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTrouserCardMethod(), responseObserver);
    }

    /**
     */
    public void getAllSockCards(ProductCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSockCardsMethod(), responseObserver);
    }

    /**
     */
    public void getAllTrouserCards(ProductCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTrouserCardsMethod(), responseObserver);
    }

    /**
     */
    public void deleteProductCardById(ProductCardComunicator.IntReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductCardByIdMethod(), responseObserver);
    }

    /**
     */
    public void getByTitleSockCard(ProductCardComunicator.StringReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleSockCardMethod(), responseObserver);
    }

    /**
     */
    public void getByTitleTrouserCard(ProductCardComunicator.StringReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByTitleTrouserCardMethod(), responseObserver);
    }

    /**
     */
    public void updateCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.IntReqCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_GET_BY_ID)))
          .addMethod(
            getAddSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.productCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_ADD_SOCK_CARD)))
          .addMethod(
            getAddTrouserCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.productCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_ADD_TROUSER_CARD)))
          .addMethod(
            getGetAllSockCardsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ProductCardComunicator.Empty,
                ProductCardComunicator.productCard>(
                  this, METHODID_GET_ALL_SOCK_CARDS)))
          .addMethod(
            getGetAllTrouserCardsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ProductCardComunicator.Empty,
                ProductCardComunicator.productCard>(
                  this, METHODID_GET_ALL_TROUSER_CARDS)))
          .addMethod(
            getDeleteProductCardByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.IntReqCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_DELETE_PRODUCT_CARD_BY_ID)))
          .addMethod(
            getGetByTitleSockCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.StringReqCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_GET_BY_TITLE_SOCK_CARD)))
          .addMethod(
            getGetByTitleTrouserCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.StringReqCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_GET_BY_TITLE_TROUSER_CARD)))
          .addMethod(
            getUpdateCardMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ProductCardComunicator.productCard,
                ProductCardComunicator.productCard>(
                  this, METHODID_UPDATE_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class ProductCardGrpcStub extends io.grpc.stub.AbstractAsyncStub<ProductCardGrpcStub> {
    private ProductCardGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCardGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCardGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getById(ProductCardComunicator.IntReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSockCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTrouserCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTrouserCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSockCards(ProductCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSockCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTrouserCards(ProductCardComunicator.Empty request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllTrouserCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductCardById(ProductCardComunicator.IntReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductCardByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitleSockCard(ProductCardComunicator.StringReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleSockCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByTitleTrouserCard(ProductCardComunicator.StringReqCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByTitleTrouserCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCard(ProductCardComunicator.productCard request,
        io.grpc.stub.StreamObserver<ProductCardComunicator.productCard> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductCardGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductCardGrpcBlockingStub> {
    private ProductCardGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCardGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCardGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductCardComunicator.productCard getById(ProductCardComunicator.IntReqCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard addSockCard(ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSockCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard addTrouserCard(ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTrouserCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ProductCardComunicator.productCard> getAllSockCards(
        ProductCardComunicator.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSockCardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ProductCardComunicator.productCard> getAllTrouserCards(
        ProductCardComunicator.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllTrouserCardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard deleteProductCardById(ProductCardComunicator.IntReqCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductCardByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard getByTitleSockCard(ProductCardComunicator.StringReqCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleSockCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard getByTitleTrouserCard(ProductCardComunicator.StringReqCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByTitleTrouserCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public ProductCardComunicator.productCard updateCard(ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductCardGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ProductCardGrpcFutureStub> {
    private ProductCardGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductCardGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductCardGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> getById(
        ProductCardComunicator.IntReqCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> addSockCard(
        ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSockCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> addTrouserCard(
        ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTrouserCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> deleteProductCardById(
        ProductCardComunicator.IntReqCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductCardByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> getByTitleSockCard(
        ProductCardComunicator.StringReqCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleSockCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> getByTitleTrouserCard(
        ProductCardComunicator.StringReqCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByTitleTrouserCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductCardComunicator.productCard> updateCard(
        ProductCardComunicator.productCard request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_ID = 0;
  private static final int METHODID_ADD_SOCK_CARD = 1;
  private static final int METHODID_ADD_TROUSER_CARD = 2;
  private static final int METHODID_GET_ALL_SOCK_CARDS = 3;
  private static final int METHODID_GET_ALL_TROUSER_CARDS = 4;
  private static final int METHODID_DELETE_PRODUCT_CARD_BY_ID = 5;
  private static final int METHODID_GET_BY_TITLE_SOCK_CARD = 6;
  private static final int METHODID_GET_BY_TITLE_TROUSER_CARD = 7;
  private static final int METHODID_UPDATE_CARD = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductCardGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductCardGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_ID:
          serviceImpl.getById((ProductCardComunicator.IntReqCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_ADD_SOCK_CARD:
          serviceImpl.addSockCard((ProductCardComunicator.productCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_ADD_TROUSER_CARD:
          serviceImpl.addTrouserCard((ProductCardComunicator.productCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_GET_ALL_SOCK_CARDS:
          serviceImpl.getAllSockCards((ProductCardComunicator.Empty) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_GET_ALL_TROUSER_CARDS:
          serviceImpl.getAllTrouserCards((ProductCardComunicator.Empty) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_CARD_BY_ID:
          serviceImpl.deleteProductCardById((ProductCardComunicator.IntReqCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE_SOCK_CARD:
          serviceImpl.getByTitleSockCard((ProductCardComunicator.StringReqCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_GET_BY_TITLE_TROUSER_CARD:
          serviceImpl.getByTitleTrouserCard((ProductCardComunicator.StringReqCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
          break;
        case METHODID_UPDATE_CARD:
          serviceImpl.updateCard((ProductCardComunicator.productCard) request,
              (io.grpc.stub.StreamObserver<ProductCardComunicator.productCard>) responseObserver);
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

  private static abstract class ProductCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductCardGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ProductCardComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductCardGrpc");
    }
  }

  private static final class ProductCardGrpcFileDescriptorSupplier
      extends ProductCardGrpcBaseDescriptorSupplier {
    ProductCardGrpcFileDescriptorSupplier() {}
  }

  private static final class ProductCardGrpcMethodDescriptorSupplier
      extends ProductCardGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductCardGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductCardGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductCardGrpcFileDescriptorSupplier())
              .addMethod(getGetByIdMethod())
              .addMethod(getAddSockCardMethod())
              .addMethod(getAddTrouserCardMethod())
              .addMethod(getGetAllSockCardsMethod())
              .addMethod(getGetAllTrouserCardsMethod())
              .addMethod(getDeleteProductCardByIdMethod())
              .addMethod(getGetByTitleSockCardMethod())
              .addMethod(getGetByTitleTrouserCardMethod())
              .addMethod(getUpdateCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
