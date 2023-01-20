package com.protoBuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: shoppingCartComunicator.proto")
public final class ShoppingCartGrpcGrpc {

  private ShoppingCartGrpcGrpc() {}

  public static final String SERVICE_NAME = "ShoppingCartGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getCreateCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCart",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getCreateCartMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart> getCreateCartMethod;
    if ((getCreateCartMethod = ShoppingCartGrpcGrpc.getCreateCartMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getCreateCartMethod = ShoppingCartGrpcGrpc.getCreateCartMethod) == null) {
          ShoppingCartGrpcGrpc.getCreateCartMethod = getCreateCartMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("createCart"))
              .build();
        }
      }
    }
    return getCreateCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage,
      ShoppingCartComunicator.cart> getGetAllCartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCarts",
      requestType = ShoppingCartComunicator.EmptyCartMessage.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage,
      ShoppingCartComunicator.cart> getGetAllCartsMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage, ShoppingCartComunicator.cart> getGetAllCartsMethod;
    if ((getGetAllCartsMethod = ShoppingCartGrpcGrpc.getGetAllCartsMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetAllCartsMethod = ShoppingCartGrpcGrpc.getGetAllCartsMethod) == null) {
          ShoppingCartGrpcGrpc.getGetAllCartsMethod = getGetAllCartsMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.EmptyCartMessage, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllCarts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.EmptyCartMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getAllCarts"))
              .build();
        }
      }
    }
    return getGetAllCartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getGetCartByCartIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartByCartId",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getGetCartByCartIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart> getGetCartByCartIdMethod;
    if ((getGetCartByCartIdMethod = ShoppingCartGrpcGrpc.getGetCartByCartIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetCartByCartIdMethod = ShoppingCartGrpcGrpc.getGetCartByCartIdMethod) == null) {
          ShoppingCartGrpcGrpc.getGetCartByCartIdMethod = getGetCartByCartIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartByCartId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getCartByCartId"))
              .build();
        }
      }
    }
    return getGetCartByCartIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cartProduct> getGetProductsByCartIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductsByCartId",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.cartProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cartProduct> getGetProductsByCartIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cartProduct> getGetProductsByCartIdMethod;
    if ((getGetProductsByCartIdMethod = ShoppingCartGrpcGrpc.getGetProductsByCartIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetProductsByCartIdMethod = ShoppingCartGrpcGrpc.getGetProductsByCartIdMethod) == null) {
          ShoppingCartGrpcGrpc.getGetProductsByCartIdMethod = getGetProductsByCartIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cartProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductsByCartId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartProduct.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getProductsByCartId"))
              .build();
        }
      }
    }
    return getGetProductsByCartIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage,
      ShoppingCartComunicator.cart> getAddProductInCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProductInCart",
      requestType = ShoppingCartComunicator.patchProductMessage.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage,
      ShoppingCartComunicator.cart> getAddProductInCartMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage, ShoppingCartComunicator.cart> getAddProductInCartMethod;
    if ((getAddProductInCartMethod = ShoppingCartGrpcGrpc.getAddProductInCartMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getAddProductInCartMethod = ShoppingCartGrpcGrpc.getAddProductInCartMethod) == null) {
          ShoppingCartGrpcGrpc.getAddProductInCartMethod = getAddProductInCartMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.patchProductMessage, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProductInCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.patchProductMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("addProductInCart"))
              .build();
        }
      }
    }
    return getAddProductInCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage,
      ShoppingCartComunicator.cart> getDeleteProductInCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProductInCart",
      requestType = ShoppingCartComunicator.patchProductMessage.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage,
      ShoppingCartComunicator.cart> getDeleteProductInCartMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.patchProductMessage, ShoppingCartComunicator.cart> getDeleteProductInCartMethod;
    if ((getDeleteProductInCartMethod = ShoppingCartGrpcGrpc.getDeleteProductInCartMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getDeleteProductInCartMethod = ShoppingCartGrpcGrpc.getDeleteProductInCartMethod) == null) {
          ShoppingCartGrpcGrpc.getDeleteProductInCartMethod = getDeleteProductInCartMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.patchProductMessage, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProductInCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.patchProductMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("deleteProductInCart"))
              .build();
        }
      }
    }
    return getDeleteProductInCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.StringCartMessage> getDeleteByCartIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByCartId",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.StringCartMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.StringCartMessage> getDeleteByCartIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.StringCartMessage> getDeleteByCartIdMethod;
    if ((getDeleteByCartIdMethod = ShoppingCartGrpcGrpc.getDeleteByCartIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getDeleteByCartIdMethod = ShoppingCartGrpcGrpc.getDeleteByCartIdMethod) == null) {
          ShoppingCartGrpcGrpc.getDeleteByCartIdMethod = getDeleteByCartIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.StringCartMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByCartId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.StringCartMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("deleteByCartId"))
              .build();
        }
      }
    }
    return getDeleteByCartIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.IntMessageCart> getGetTotalPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTotalPrice",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.IntMessageCart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.IntMessageCart> getGetTotalPriceMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.IntMessageCart> getGetTotalPriceMethod;
    if ((getGetTotalPriceMethod = ShoppingCartGrpcGrpc.getGetTotalPriceMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetTotalPriceMethod = ShoppingCartGrpcGrpc.getGetTotalPriceMethod) == null) {
          ShoppingCartGrpcGrpc.getGetTotalPriceMethod = getGetTotalPriceMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.IntMessageCart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTotalPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getTotalPrice"))
              .build();
        }
      }
    }
    return getGetTotalPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getGetCartByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartByUserId",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cart> getGetCartByUserIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart> getGetCartByUserIdMethod;
    if ((getGetCartByUserIdMethod = ShoppingCartGrpcGrpc.getGetCartByUserIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetCartByUserIdMethod = ShoppingCartGrpcGrpc.getGetCartByUserIdMethod) == null) {
          ShoppingCartGrpcGrpc.getGetCartByUserIdMethod = getGetCartByUserIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getCartByUserId"))
              .build();
        }
      }
    }
    return getGetCartByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId,
      ShoppingCartComunicator.cartItem> getCreateQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createQuantity",
      requestType = ShoppingCartComunicator.cartIdProductId.class,
      responseType = ShoppingCartComunicator.cartItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId,
      ShoppingCartComunicator.cartItem> getCreateQuantityMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId, ShoppingCartComunicator.cartItem> getCreateQuantityMethod;
    if ((getCreateQuantityMethod = ShoppingCartGrpcGrpc.getCreateQuantityMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getCreateQuantityMethod = ShoppingCartGrpcGrpc.getCreateQuantityMethod) == null) {
          ShoppingCartGrpcGrpc.getCreateQuantityMethod = getCreateQuantityMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.cartIdProductId, ShoppingCartComunicator.cartItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartIdProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartItem.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("createQuantity"))
              .build();
        }
      }
    }
    return getCreateQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage,
      ShoppingCartComunicator.cartItem> getGetAllCartQuantitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCartQuantities",
      requestType = ShoppingCartComunicator.EmptyCartMessage.class,
      responseType = ShoppingCartComunicator.cartItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage,
      ShoppingCartComunicator.cartItem> getGetAllCartQuantitiesMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.EmptyCartMessage, ShoppingCartComunicator.cartItem> getGetAllCartQuantitiesMethod;
    if ((getGetAllCartQuantitiesMethod = ShoppingCartGrpcGrpc.getGetAllCartQuantitiesMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetAllCartQuantitiesMethod = ShoppingCartGrpcGrpc.getGetAllCartQuantitiesMethod) == null) {
          ShoppingCartGrpcGrpc.getGetAllCartQuantitiesMethod = getGetAllCartQuantitiesMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.EmptyCartMessage, ShoppingCartComunicator.cartItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllCartQuantities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.EmptyCartMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartItem.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getAllCartQuantities"))
              .build();
        }
      }
    }
    return getGetAllCartQuantitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cartItem> getGetCartItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartItemById",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.cartItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.cartItem> getGetCartItemByIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cartItem> getGetCartItemByIdMethod;
    if ((getGetCartItemByIdMethod = ShoppingCartGrpcGrpc.getGetCartItemByIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetCartItemByIdMethod = ShoppingCartGrpcGrpc.getGetCartItemByIdMethod) == null) {
          ShoppingCartGrpcGrpc.getGetCartItemByIdMethod = getGetCartItemByIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.cartItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartItem.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getCartItemById"))
              .build();
        }
      }
    }
    return getGetCartItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.IntMessageCart> getGetQuantityByCartItemIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQuantityByCartItemId",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.IntMessageCart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.IntMessageCart> getGetQuantityByCartItemIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.IntMessageCart> getGetQuantityByCartItemIdMethod;
    if ((getGetQuantityByCartItemIdMethod = ShoppingCartGrpcGrpc.getGetQuantityByCartItemIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetQuantityByCartItemIdMethod = ShoppingCartGrpcGrpc.getGetQuantityByCartItemIdMethod) == null) {
          ShoppingCartGrpcGrpc.getGetQuantityByCartItemIdMethod = getGetQuantityByCartItemIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.IntMessageCart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQuantityByCartItemId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getQuantityByCartItemId"))
              .build();
        }
      }
    }
    return getGetQuantityByCartItemIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdQuantity,
      ShoppingCartComunicator.cartItem> getUpdateQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateQuantity",
      requestType = ShoppingCartComunicator.cartIdQuantity.class,
      responseType = ShoppingCartComunicator.cartItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdQuantity,
      ShoppingCartComunicator.cartItem> getUpdateQuantityMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdQuantity, ShoppingCartComunicator.cartItem> getUpdateQuantityMethod;
    if ((getUpdateQuantityMethod = ShoppingCartGrpcGrpc.getUpdateQuantityMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getUpdateQuantityMethod = ShoppingCartGrpcGrpc.getUpdateQuantityMethod) == null) {
          ShoppingCartGrpcGrpc.getUpdateQuantityMethod = getUpdateQuantityMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.cartIdQuantity, ShoppingCartComunicator.cartItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartIdQuantity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartItem.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("updateQuantity"))
              .build();
        }
      }
    }
    return getUpdateQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.StringCartMessage> getDeleteCartByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCartById",
      requestType = ShoppingCartComunicator.IntMessageCart.class,
      responseType = ShoppingCartComunicator.StringCartMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart,
      ShoppingCartComunicator.StringCartMessage> getDeleteCartByIdMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.StringCartMessage> getDeleteCartByIdMethod;
    if ((getDeleteCartByIdMethod = ShoppingCartGrpcGrpc.getDeleteCartByIdMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getDeleteCartByIdMethod = ShoppingCartGrpcGrpc.getDeleteCartByIdMethod) == null) {
          ShoppingCartGrpcGrpc.getDeleteCartByIdMethod = getDeleteCartByIdMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.IntMessageCart, ShoppingCartComunicator.StringCartMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCartById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.IntMessageCart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.StringCartMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("deleteCartById"))
              .build();
        }
      }
    }
    return getDeleteCartByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId,
      ShoppingCartComunicator.cartItem> getGetCartByIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartByIds",
      requestType = ShoppingCartComunicator.cartIdProductId.class,
      responseType = ShoppingCartComunicator.cartItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId,
      ShoppingCartComunicator.cartItem> getGetCartByIdsMethod() {
    io.grpc.MethodDescriptor<ShoppingCartComunicator.cartIdProductId, ShoppingCartComunicator.cartItem> getGetCartByIdsMethod;
    if ((getGetCartByIdsMethod = ShoppingCartGrpcGrpc.getGetCartByIdsMethod) == null) {
      synchronized (ShoppingCartGrpcGrpc.class) {
        if ((getGetCartByIdsMethod = ShoppingCartGrpcGrpc.getGetCartByIdsMethod) == null) {
          ShoppingCartGrpcGrpc.getGetCartByIdsMethod = getGetCartByIdsMethod =
              io.grpc.MethodDescriptor.<ShoppingCartComunicator.cartIdProductId, ShoppingCartComunicator.cartItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartIdProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ShoppingCartComunicator.cartItem.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingCartGrpcMethodDescriptorSupplier("getCartByIds"))
              .build();
        }
      }
    }
    return getGetCartByIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingCartGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcStub>() {
        @java.lang.Override
        public ShoppingCartGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartGrpcStub(channel, callOptions);
        }
      };
    return ShoppingCartGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingCartGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcBlockingStub>() {
        @java.lang.Override
        public ShoppingCartGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartGrpcBlockingStub(channel, callOptions);
        }
      };
    return ShoppingCartGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingCartGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingCartGrpcFutureStub>() {
        @java.lang.Override
        public ShoppingCartGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingCartGrpcFutureStub(channel, callOptions);
        }
      };
    return ShoppingCartGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ShoppingCartGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCart(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCartMethod(), responseObserver);
    }

    /**
     */
    public void getAllCarts(ShoppingCartComunicator.EmptyCartMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCartsMethod(), responseObserver);
    }

    /**
     */
    public void getCartByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartByCartIdMethod(), responseObserver);
    }

    /**
     */
    public void getProductsByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartProduct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByCartIdMethod(), responseObserver);
    }

    /**
     */
    public void addProductInCart(ShoppingCartComunicator.patchProductMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductInCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteProductInCart(ShoppingCartComunicator.patchProductMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductInCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByCartIdMethod(), responseObserver);
    }

    /**
     */
    public void getTotalPrice(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalPriceMethod(), responseObserver);
    }

    /**
     */
    public void getCartByUserId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *wtf ask team??
     * </pre>
     */
    public void createQuantity(ShoppingCartComunicator.cartIdProductId request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQuantityMethod(), responseObserver);
    }

    /**
     */
    public void getAllCartQuantities(ShoppingCartComunicator.EmptyCartMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCartQuantitiesMethod(), responseObserver);
    }

    /**
     */
    public void getCartItemById(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void getQuantityByCartItemId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuantityByCartItemIdMethod(), responseObserver);
    }

    /**
     */
    public void updateQuantity(ShoppingCartComunicator.cartIdQuantity request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQuantityMethod(), responseObserver);
    }

    /**
     */
    public void deleteCartById(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCartByIdMethod(), responseObserver);
    }

    /**
     */
    public void getCartByIds(ShoppingCartComunicator.cartIdProductId request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartByIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.cart>(
                  this, METHODID_CREATE_CART)))
          .addMethod(
            getGetAllCartsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ShoppingCartComunicator.EmptyCartMessage,
                ShoppingCartComunicator.cart>(
                  this, METHODID_GET_ALL_CARTS)))
          .addMethod(
            getGetCartByCartIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.cart>(
                  this, METHODID_GET_CART_BY_CART_ID)))
          .addMethod(
            getGetProductsByCartIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.cartProduct>(
                  this, METHODID_GET_PRODUCTS_BY_CART_ID)))
          .addMethod(
            getAddProductInCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.patchProductMessage,
                ShoppingCartComunicator.cart>(
                  this, METHODID_ADD_PRODUCT_IN_CART)))
          .addMethod(
            getDeleteProductInCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.patchProductMessage,
                ShoppingCartComunicator.cart>(
                  this, METHODID_DELETE_PRODUCT_IN_CART)))
          .addMethod(
            getDeleteByCartIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.StringCartMessage>(
                  this, METHODID_DELETE_BY_CART_ID)))
          .addMethod(
            getGetTotalPriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.IntMessageCart>(
                  this, METHODID_GET_TOTAL_PRICE)))
          .addMethod(
            getGetCartByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.cart>(
                  this, METHODID_GET_CART_BY_USER_ID)))
          .addMethod(
            getCreateQuantityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.cartIdProductId,
                ShoppingCartComunicator.cartItem>(
                  this, METHODID_CREATE_QUANTITY)))
          .addMethod(
            getGetAllCartQuantitiesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ShoppingCartComunicator.EmptyCartMessage,
                ShoppingCartComunicator.cartItem>(
                  this, METHODID_GET_ALL_CART_QUANTITIES)))
          .addMethod(
            getGetCartItemByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.cartItem>(
                  this, METHODID_GET_CART_ITEM_BY_ID)))
          .addMethod(
            getGetQuantityByCartItemIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.IntMessageCart>(
                  this, METHODID_GET_QUANTITY_BY_CART_ITEM_ID)))
          .addMethod(
            getUpdateQuantityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.cartIdQuantity,
                ShoppingCartComunicator.cartItem>(
                  this, METHODID_UPDATE_QUANTITY)))
          .addMethod(
            getDeleteCartByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.IntMessageCart,
                ShoppingCartComunicator.StringCartMessage>(
                  this, METHODID_DELETE_CART_BY_ID)))
          .addMethod(
            getGetCartByIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ShoppingCartComunicator.cartIdProductId,
                ShoppingCartComunicator.cartItem>(
                  this, METHODID_GET_CART_BY_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class ShoppingCartGrpcStub extends io.grpc.stub.AbstractAsyncStub<ShoppingCartGrpcStub> {
    private ShoppingCartGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartGrpcStub(channel, callOptions);
    }

    /**
     */
    public void createCart(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCarts(ShoppingCartComunicator.EmptyCartMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllCartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartByCartIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartProduct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductsByCartIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProductInCart(ShoppingCartComunicator.patchProductMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductInCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductInCart(ShoppingCartComunicator.patchProductMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductInCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByCartId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByCartIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalPrice(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartByUserId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *wtf ask team??
     * </pre>
     */
    public void createQuantity(ShoppingCartComunicator.cartIdProductId request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCartQuantities(ShoppingCartComunicator.EmptyCartMessage request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllCartQuantitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartItemById(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuantityByCartItemId(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuantityByCartItemIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQuantity(ShoppingCartComunicator.cartIdQuantity request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCartById(ShoppingCartComunicator.IntMessageCart request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCartByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartByIds(ShoppingCartComunicator.cartIdProductId request,
        io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartByIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShoppingCartGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShoppingCartGrpcBlockingStub> {
    private ShoppingCartGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public ShoppingCartComunicator.cart createCart(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ShoppingCartComunicator.cart> getAllCarts(
        ShoppingCartComunicator.EmptyCartMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllCartsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cart getCartByCartId(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartByCartIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ShoppingCartComunicator.cartProduct> getProductsByCartId(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductsByCartIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cart addProductInCart(ShoppingCartComunicator.patchProductMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductInCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cart deleteProductInCart(ShoppingCartComunicator.patchProductMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductInCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.StringCartMessage deleteByCartId(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByCartIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.IntMessageCart getTotalPrice(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cart getCartByUserId(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *wtf ask team??
     * </pre>
     */
    public ShoppingCartComunicator.cartItem createQuantity(ShoppingCartComunicator.cartIdProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQuantityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ShoppingCartComunicator.cartItem> getAllCartQuantities(
        ShoppingCartComunicator.EmptyCartMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllCartQuantitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cartItem getCartItemById(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.IntMessageCart getQuantityByCartItemId(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuantityByCartItemIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cartItem updateQuantity(ShoppingCartComunicator.cartIdQuantity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQuantityMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.StringCartMessage deleteCartById(ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCartByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ShoppingCartComunicator.cartItem getCartByIds(ShoppingCartComunicator.cartIdProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartByIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShoppingCartGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ShoppingCartGrpcFutureStub> {
    private ShoppingCartGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingCartGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingCartGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cart> createCart(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cart> getCartByCartId(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartByCartIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cart> addProductInCart(
        ShoppingCartComunicator.patchProductMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductInCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cart> deleteProductInCart(
        ShoppingCartComunicator.patchProductMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductInCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.StringCartMessage> deleteByCartId(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByCartIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.IntMessageCart> getTotalPrice(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cart> getCartByUserId(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *wtf ask team??
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cartItem> createQuantity(
        ShoppingCartComunicator.cartIdProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQuantityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cartItem> getCartItemById(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.IntMessageCart> getQuantityByCartItemId(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuantityByCartItemIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cartItem> updateQuantity(
        ShoppingCartComunicator.cartIdQuantity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQuantityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.StringCartMessage> deleteCartById(
        ShoppingCartComunicator.IntMessageCart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCartByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ShoppingCartComunicator.cartItem> getCartByIds(
        ShoppingCartComunicator.cartIdProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartByIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CART = 0;
  private static final int METHODID_GET_ALL_CARTS = 1;
  private static final int METHODID_GET_CART_BY_CART_ID = 2;
  private static final int METHODID_GET_PRODUCTS_BY_CART_ID = 3;
  private static final int METHODID_ADD_PRODUCT_IN_CART = 4;
  private static final int METHODID_DELETE_PRODUCT_IN_CART = 5;
  private static final int METHODID_DELETE_BY_CART_ID = 6;
  private static final int METHODID_GET_TOTAL_PRICE = 7;
  private static final int METHODID_GET_CART_BY_USER_ID = 8;
  private static final int METHODID_CREATE_QUANTITY = 9;
  private static final int METHODID_GET_ALL_CART_QUANTITIES = 10;
  private static final int METHODID_GET_CART_ITEM_BY_ID = 11;
  private static final int METHODID_GET_QUANTITY_BY_CART_ITEM_ID = 12;
  private static final int METHODID_UPDATE_QUANTITY = 13;
  private static final int METHODID_DELETE_CART_BY_ID = 14;
  private static final int METHODID_GET_CART_BY_IDS = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingCartGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingCartGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CART:
          serviceImpl.createCart((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_GET_ALL_CARTS:
          serviceImpl.getAllCarts((ShoppingCartComunicator.EmptyCartMessage) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_GET_CART_BY_CART_ID:
          serviceImpl.getCartByCartId((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_CART_ID:
          serviceImpl.getProductsByCartId((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartProduct>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT_IN_CART:
          serviceImpl.addProductInCart((ShoppingCartComunicator.patchProductMessage) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_IN_CART:
          serviceImpl.deleteProductInCart((ShoppingCartComunicator.patchProductMessage) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_DELETE_BY_CART_ID:
          serviceImpl.deleteByCartId((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage>) responseObserver);
          break;
        case METHODID_GET_TOTAL_PRICE:
          serviceImpl.getTotalPrice((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart>) responseObserver);
          break;
        case METHODID_GET_CART_BY_USER_ID:
          serviceImpl.getCartByUserId((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cart>) responseObserver);
          break;
        case METHODID_CREATE_QUANTITY:
          serviceImpl.createQuantity((ShoppingCartComunicator.cartIdProductId) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem>) responseObserver);
          break;
        case METHODID_GET_ALL_CART_QUANTITIES:
          serviceImpl.getAllCartQuantities((ShoppingCartComunicator.EmptyCartMessage) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem>) responseObserver);
          break;
        case METHODID_GET_CART_ITEM_BY_ID:
          serviceImpl.getCartItemById((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem>) responseObserver);
          break;
        case METHODID_GET_QUANTITY_BY_CART_ITEM_ID:
          serviceImpl.getQuantityByCartItemId((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.IntMessageCart>) responseObserver);
          break;
        case METHODID_UPDATE_QUANTITY:
          serviceImpl.updateQuantity((ShoppingCartComunicator.cartIdQuantity) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem>) responseObserver);
          break;
        case METHODID_DELETE_CART_BY_ID:
          serviceImpl.deleteCartById((ShoppingCartComunicator.IntMessageCart) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.StringCartMessage>) responseObserver);
          break;
        case METHODID_GET_CART_BY_IDS:
          serviceImpl.getCartByIds((ShoppingCartComunicator.cartIdProductId) request,
              (io.grpc.stub.StreamObserver<ShoppingCartComunicator.cartItem>) responseObserver);
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

  private static abstract class ShoppingCartGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingCartGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ShoppingCartComunicator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingCartGrpc");
    }
  }

  private static final class ShoppingCartGrpcFileDescriptorSupplier
      extends ShoppingCartGrpcBaseDescriptorSupplier {
    ShoppingCartGrpcFileDescriptorSupplier() {}
  }

  private static final class ShoppingCartGrpcMethodDescriptorSupplier
      extends ShoppingCartGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingCartGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingCartGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingCartGrpcFileDescriptorSupplier())
              .addMethod(getCreateCartMethod())
              .addMethod(getGetAllCartsMethod())
              .addMethod(getGetCartByCartIdMethod())
              .addMethod(getGetProductsByCartIdMethod())
              .addMethod(getAddProductInCartMethod())
              .addMethod(getDeleteProductInCartMethod())
              .addMethod(getDeleteByCartIdMethod())
              .addMethod(getGetTotalPriceMethod())
              .addMethod(getGetCartByUserIdMethod())
              .addMethod(getCreateQuantityMethod())
              .addMethod(getGetAllCartQuantitiesMethod())
              .addMethod(getGetCartItemByIdMethod())
              .addMethod(getGetQuantityByCartItemIdMethod())
              .addMethod(getUpdateQuantityMethod())
              .addMethod(getDeleteCartByIdMethod())
              .addMethod(getGetCartByIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
