// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/trouserCardComunicator.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

public static partial class TrouserCardGrpc
{
  static readonly string __ServiceName = "TrouserCardGrpc";

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
  static readonly grpc::Marshaller<global::trouserCardIntReq> __Marshaller_trouserCardIntReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::trouserCardIntReq.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::trouserCard> __Marshaller_trouserCard = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::trouserCard.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::trouserCardEmpty> __Marshaller_trouserCardEmpty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::trouserCardEmpty.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::trouserCardStringReq> __Marshaller_trouserCardStringReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::trouserCardStringReq.Parser));

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCardIntReq, global::trouserCard> __Method_getById = new grpc::Method<global::trouserCardIntReq, global::trouserCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getById",
      __Marshaller_trouserCardIntReq,
      __Marshaller_trouserCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCard, global::trouserCard> __Method_addTrouserCard = new grpc::Method<global::trouserCard, global::trouserCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "addTrouserCard",
      __Marshaller_trouserCard,
      __Marshaller_trouserCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCardEmpty, global::trouserCard> __Method_getAllSockCards = new grpc::Method<global::trouserCardEmpty, global::trouserCard>(
      grpc::MethodType.ServerStreaming,
      __ServiceName,
      "getAllSockCards",
      __Marshaller_trouserCardEmpty,
      __Marshaller_trouserCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCardIntReq, global::trouserCard> __Method_deleteSockCardById = new grpc::Method<global::trouserCardIntReq, global::trouserCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "deleteSockCardById",
      __Marshaller_trouserCardIntReq,
      __Marshaller_trouserCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCardStringReq, global::trouserCard> __Method_getByTitle = new grpc::Method<global::trouserCardStringReq, global::trouserCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getByTitle",
      __Marshaller_trouserCardStringReq,
      __Marshaller_trouserCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::trouserCard, global::trouserCard> __Method_updateSockCard = new grpc::Method<global::trouserCard, global::trouserCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "updateSockCard",
      __Marshaller_trouserCard,
      __Marshaller_trouserCard);

  /// <summary>Service descriptor</summary>
  public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
  {
    get { return global::TrouserCardComunicatorReflection.Descriptor.Services[0]; }
  }

  /// <summary>Base class for server-side implementations of TrouserCardGrpc</summary>
  [grpc::BindServiceMethod(typeof(TrouserCardGrpc), "BindService")]
  public abstract partial class TrouserCardGrpcBase
  {
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::trouserCard> getById(global::trouserCardIntReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::trouserCard> addTrouserCard(global::trouserCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task getAllSockCards(global::trouserCardEmpty request, grpc::IServerStreamWriter<global::trouserCard> responseStream, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::trouserCard> deleteSockCardById(global::trouserCardIntReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::trouserCard> getByTitle(global::trouserCardStringReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::trouserCard> updateSockCard(global::trouserCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

  }

  /// <summary>Client for TrouserCardGrpc</summary>
  public partial class TrouserCardGrpcClient : grpc::ClientBase<TrouserCardGrpcClient>
  {
    /// <summary>Creates a new client for TrouserCardGrpc</summary>
    /// <param name="channel">The channel to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public TrouserCardGrpcClient(grpc::ChannelBase channel) : base(channel)
    {
    }
    /// <summary>Creates a new client for TrouserCardGrpc that uses a custom <c>CallInvoker</c>.</summary>
    /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public TrouserCardGrpcClient(grpc::CallInvoker callInvoker) : base(callInvoker)
    {
    }
    /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected TrouserCardGrpcClient() : base()
    {
    }
    /// <summary>Protected constructor to allow creation of configured clients.</summary>
    /// <param name="configuration">The client configuration.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected TrouserCardGrpcClient(ClientBaseConfiguration configuration) : base(configuration)
    {
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard getById(global::trouserCardIntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard getById(global::trouserCardIntReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> getByIdAsync(global::trouserCardIntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> getByIdAsync(global::trouserCardIntReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard addTrouserCard(global::trouserCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addTrouserCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard addTrouserCard(global::trouserCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_addTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> addTrouserCardAsync(global::trouserCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addTrouserCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> addTrouserCardAsync(global::trouserCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_addTrouserCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::trouserCard> getAllSockCards(global::trouserCardEmpty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllSockCards(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::trouserCard> getAllSockCards(global::trouserCardEmpty request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncServerStreamingCall(__Method_getAllSockCards, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard deleteSockCardById(global::trouserCardIntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteSockCardById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard deleteSockCardById(global::trouserCardIntReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_deleteSockCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> deleteSockCardByIdAsync(global::trouserCardIntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteSockCardByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> deleteSockCardByIdAsync(global::trouserCardIntReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_deleteSockCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard getByTitle(global::trouserCardStringReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitle(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard getByTitle(global::trouserCardStringReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getByTitle, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> getByTitleAsync(global::trouserCardStringReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> getByTitleAsync(global::trouserCardStringReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getByTitle, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard updateSockCard(global::trouserCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateSockCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::trouserCard updateSockCard(global::trouserCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_updateSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> updateSockCardAsync(global::trouserCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateSockCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::trouserCard> updateSockCardAsync(global::trouserCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_updateSockCard, null, options, request);
    }
    /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected override TrouserCardGrpcClient NewInstance(ClientBaseConfiguration configuration)
    {
      return new TrouserCardGrpcClient(configuration);
    }
  }

  /// <summary>Creates service definition that can be registered with a server</summary>
  /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  public static grpc::ServerServiceDefinition BindService(TrouserCardGrpcBase serviceImpl)
  {
    return grpc::ServerServiceDefinition.CreateBuilder()
        .AddMethod(__Method_getById, serviceImpl.getById)
        .AddMethod(__Method_addTrouserCard, serviceImpl.addTrouserCard)
        .AddMethod(__Method_getAllSockCards, serviceImpl.getAllSockCards)
        .AddMethod(__Method_deleteSockCardById, serviceImpl.deleteSockCardById)
        .AddMethod(__Method_getByTitle, serviceImpl.getByTitle)
        .AddMethod(__Method_updateSockCard, serviceImpl.updateSockCard).Build();
  }

  /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
  /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
  /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
  /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  public static void BindService(grpc::ServiceBinderBase serviceBinder, TrouserCardGrpcBase serviceImpl)
  {
    serviceBinder.AddMethod(__Method_getById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::trouserCardIntReq, global::trouserCard>(serviceImpl.getById));
    serviceBinder.AddMethod(__Method_addTrouserCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::trouserCard, global::trouserCard>(serviceImpl.addTrouserCard));
    serviceBinder.AddMethod(__Method_getAllSockCards, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::trouserCardEmpty, global::trouserCard>(serviceImpl.getAllSockCards));
    serviceBinder.AddMethod(__Method_deleteSockCardById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::trouserCardIntReq, global::trouserCard>(serviceImpl.deleteSockCardById));
    serviceBinder.AddMethod(__Method_getByTitle, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::trouserCardStringReq, global::trouserCard>(serviceImpl.getByTitle));
    serviceBinder.AddMethod(__Method_updateSockCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::trouserCard, global::trouserCard>(serviceImpl.updateSockCard));
  }

}
#endregion
