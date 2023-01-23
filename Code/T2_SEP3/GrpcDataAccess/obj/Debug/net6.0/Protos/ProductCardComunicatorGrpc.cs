// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/productCardComunicator.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

public static partial class ProductCardGrpc
{
  static readonly string __ServiceName = "ProductCardGrpc";

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
  {
    #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
    if (message is global::Google.Protobuf.IBufferMessage)
    {
      context.SetPayloadLength(message.CalculateSize());
      global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
      context.Complete();
      return;
    }
    #endif
    context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static class __Helper_MessageCache<T>
  {
    public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
  {
    #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
    if (__Helper_MessageCache<T>.IsBufferMessage)
    {
      return parser.ParseFrom(context.PayloadAsReadOnlySequence());
    }
    #endif
    return parser.ParseFrom(context.PayloadAsNewBuffer());
  }

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::IntReqCard> __Marshaller_IntReqCard = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::IntReqCard.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::productCard> __Marshaller_productCard = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::productCard.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::Empty> __Marshaller_Empty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Empty.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::StringReqCard> __Marshaller_StringReqCard = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::StringReqCard.Parser));

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::IntReqCard, global::productCard> __Method_getById = new grpc::Method<global::IntReqCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getById",
      __Marshaller_IntReqCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::productCard, global::productCard> __Method_addSockCard = new grpc::Method<global::productCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "addSockCard",
      __Marshaller_productCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::productCard, global::productCard> __Method_addTrouserCard = new grpc::Method<global::productCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "addTrouserCard",
      __Marshaller_productCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::Empty, global::productCard> __Method_getAllSockCards = new grpc::Method<global::Empty, global::productCard>(
      grpc::MethodType.ServerStreaming,
      __ServiceName,
      "getAllSockCards",
      __Marshaller_Empty,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::Empty, global::productCard> __Method_getAllTrouserCards = new grpc::Method<global::Empty, global::productCard>(
      grpc::MethodType.ServerStreaming,
      __ServiceName,
      "getAllTrouserCards",
      __Marshaller_Empty,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::IntReqCard, global::productCard> __Method_deleteProductCardById = new grpc::Method<global::IntReqCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "deleteProductCardById",
      __Marshaller_IntReqCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::StringReqCard, global::productCard> __Method_getByTitleSockCard = new grpc::Method<global::StringReqCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getByTitleSockCard",
      __Marshaller_StringReqCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::StringReqCard, global::productCard> __Method_getByTitleTrouserCard = new grpc::Method<global::StringReqCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getByTitleTrouserCard",
      __Marshaller_StringReqCard,
      __Marshaller_productCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::productCard, global::productCard> __Method_updateCard = new grpc::Method<global::productCard, global::productCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "updateCard",
      __Marshaller_productCard,
      __Marshaller_productCard);

  /// <summary>Service descriptor</summary>
  public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
  {
    get { return global::ProductCardComunicatorReflection.Descriptor.Services[0]; }
  }

  /// <summary>Base class for server-side implementations of ProductCardGrpc</summary>
  [grpc::BindServiceMethod(typeof(ProductCardGrpc), "BindService")]
  public abstract partial class ProductCardGrpcBase
  {
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> getById(global::IntReqCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> addSockCard(global::productCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> addTrouserCard(global::productCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task getAllSockCards(global::Empty request, grpc::IServerStreamWriter<global::productCard> responseStream, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task getAllTrouserCards(global::Empty request, grpc::IServerStreamWriter<global::productCard> responseStream, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> deleteProductCardById(global::IntReqCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> getByTitleSockCard(global::StringReqCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> getByTitleTrouserCard(global::StringReqCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::productCard> updateCard(global::productCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

  }

  /// <summary>Client for ProductCardGrpc</summary>
  public partial class ProductCardGrpcClient : grpc::ClientBase<ProductCardGrpcClient>
  {
    /// <summary>Creates a new client for ProductCardGrpc</summary>
    /// <param name="channel">The channel to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public ProductCardGrpcClient(grpc::ChannelBase channel) : base(channel)
    {
    }
    /// <summary>Creates a new client for ProductCardGrpc that uses a custom <c>CallInvoker</c>.</summary>
    /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public ProductCardGrpcClient(grpc::CallInvoker callInvoker) : base(callInvoker)
    {
    }
    /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected ProductCardGrpcClient() : base()
    {
    }
    /// <summary>Protected constructor to allow creation of configured clients.</summary>
    /// <param name="configuration">The client configuration.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected ProductCardGrpcClient(ClientBaseConfiguration configuration) : base(configuration)
    {
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getById(global::IntReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getById(global::IntReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByIdAsync(global::IntReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByIdAsync(global::IntReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard addSockCard(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addSockCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard addSockCard(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_addSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> addSockCardAsync(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addSockCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> addSockCardAsync(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_addSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard addTrouserCard(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addTrouserCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard addTrouserCard(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_addTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> addTrouserCardAsync(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addTrouserCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> addTrouserCardAsync(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_addTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::productCard> getAllSockCards(global::Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllSockCards(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::productCard> getAllSockCards(global::Empty request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncServerStreamingCall(__Method_getAllSockCards, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::productCard> getAllTrouserCards(global::Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllTrouserCards(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::productCard> getAllTrouserCards(global::Empty request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncServerStreamingCall(__Method_getAllTrouserCards, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard deleteProductCardById(global::IntReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteProductCardById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard deleteProductCardById(global::IntReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_deleteProductCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> deleteProductCardByIdAsync(global::IntReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteProductCardByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> deleteProductCardByIdAsync(global::IntReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_deleteProductCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getByTitleSockCard(global::StringReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleSockCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getByTitleSockCard(global::StringReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getByTitleSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByTitleSockCardAsync(global::StringReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleSockCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByTitleSockCardAsync(global::StringReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getByTitleSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getByTitleTrouserCard(global::StringReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleTrouserCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard getByTitleTrouserCard(global::StringReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getByTitleTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByTitleTrouserCardAsync(global::StringReqCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleTrouserCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> getByTitleTrouserCardAsync(global::StringReqCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getByTitleTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard updateCard(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::productCard updateCard(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_updateCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> updateCardAsync(global::productCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::productCard> updateCardAsync(global::productCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_updateCard, null, options, request);
    }
    /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected override ProductCardGrpcClient NewInstance(ClientBaseConfiguration configuration)
    {
      return new ProductCardGrpcClient(configuration);
    }
  }

  /// <summary>Creates service definition that can be registered with a server</summary>
  /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  public static grpc::ServerServiceDefinition BindService(ProductCardGrpcBase serviceImpl)
  {
    return grpc::ServerServiceDefinition.CreateBuilder()
        .AddMethod(__Method_getById, serviceImpl.getById)
        .AddMethod(__Method_addSockCard, serviceImpl.addSockCard)
        .AddMethod(__Method_addTrouserCard, serviceImpl.addTrouserCard)
        .AddMethod(__Method_getAllSockCards, serviceImpl.getAllSockCards)
        .AddMethod(__Method_getAllTrouserCards, serviceImpl.getAllTrouserCards)
        .AddMethod(__Method_deleteProductCardById, serviceImpl.deleteProductCardById)
        .AddMethod(__Method_getByTitleSockCard, serviceImpl.getByTitleSockCard)
        .AddMethod(__Method_getByTitleTrouserCard, serviceImpl.getByTitleTrouserCard)
        .AddMethod(__Method_updateCard, serviceImpl.updateCard).Build();
  }

  /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
  /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
  /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
  /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  public static void BindService(grpc::ServiceBinderBase serviceBinder, ProductCardGrpcBase serviceImpl)
  {
    serviceBinder.AddMethod(__Method_getById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::IntReqCard, global::productCard>(serviceImpl.getById));
    serviceBinder.AddMethod(__Method_addSockCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::productCard, global::productCard>(serviceImpl.addSockCard));
    serviceBinder.AddMethod(__Method_addTrouserCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::productCard, global::productCard>(serviceImpl.addTrouserCard));
    serviceBinder.AddMethod(__Method_getAllSockCards, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::Empty, global::productCard>(serviceImpl.getAllSockCards));
    serviceBinder.AddMethod(__Method_getAllTrouserCards, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::Empty, global::productCard>(serviceImpl.getAllTrouserCards));
    serviceBinder.AddMethod(__Method_deleteProductCardById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::IntReqCard, global::productCard>(serviceImpl.deleteProductCardById));
    serviceBinder.AddMethod(__Method_getByTitleSockCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::StringReqCard, global::productCard>(serviceImpl.getByTitleSockCard));
    serviceBinder.AddMethod(__Method_getByTitleTrouserCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::StringReqCard, global::productCard>(serviceImpl.getByTitleTrouserCard));
    serviceBinder.AddMethod(__Method_updateCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::productCard, global::productCard>(serviceImpl.updateCard));
  }

}
#endregion