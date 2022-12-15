// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/socksCardComunicator.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

public static partial class SocksCardGrpc
{
  static readonly string __ServiceName = "SocksCardGrpc";

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
  static readonly grpc::Marshaller<global::IntReq> __Marshaller_IntReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::IntReq.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::sockCard> __Marshaller_sockCard = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::sockCard.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::Empty> __Marshaller_Empty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Empty.Parser));
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Marshaller<global::StringReq> __Marshaller_StringReq = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::StringReq.Parser));

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::IntReq, global::sockCard> __Method_getById = new grpc::Method<global::IntReq, global::sockCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getById",
      __Marshaller_IntReq,
      __Marshaller_sockCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::sockCard, global::sockCard> __Method_addSockCard = new grpc::Method<global::sockCard, global::sockCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "addSockCard",
      __Marshaller_sockCard,
      __Marshaller_sockCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::Empty, global::sockCard> __Method_getAllSockCards = new grpc::Method<global::Empty, global::sockCard>(
      grpc::MethodType.ServerStreaming,
      __ServiceName,
      "getAllSockCards",
      __Marshaller_Empty,
      __Marshaller_sockCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::IntReq, global::sockCard> __Method_deleteSockCardById = new grpc::Method<global::IntReq, global::sockCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "deleteSockCardById",
      __Marshaller_IntReq,
      __Marshaller_sockCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::StringReq, global::sockCard> __Method_getByTitle = new grpc::Method<global::StringReq, global::sockCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "getByTitle",
      __Marshaller_StringReq,
      __Marshaller_sockCard);

  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  static readonly grpc::Method<global::sockCard, global::sockCard> __Method_updateSockCard = new grpc::Method<global::sockCard, global::sockCard>(
      grpc::MethodType.Unary,
      __ServiceName,
      "updateSockCard",
      __Marshaller_sockCard,
      __Marshaller_sockCard);

  /// <summary>Service descriptor</summary>
  public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
  {
    get { return global::SocksCardComunicatorReflection.Descriptor.Services[0]; }
  }

  /// <summary>Base class for server-side implementations of SocksCardGrpc</summary>
  [grpc::BindServiceMethod(typeof(SocksCardGrpc), "BindService")]
  public abstract partial class SocksCardGrpcBase
  {
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::sockCard> getById(global::IntReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::sockCard> addSockCard(global::sockCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task getAllSockCards(global::Empty request, grpc::IServerStreamWriter<global::sockCard> responseStream, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::sockCard> deleteSockCardById(global::IntReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::sockCard> getByTitle(global::StringReq request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::System.Threading.Tasks.Task<global::sockCard> updateSockCard(global::sockCard request, grpc::ServerCallContext context)
    {
      throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
    }

  }

  /// <summary>Client for SocksCardGrpc</summary>
  public partial class SocksCardGrpcClient : grpc::ClientBase<SocksCardGrpcClient>
  {
    /// <summary>Creates a new client for SocksCardGrpc</summary>
    /// <param name="channel">The channel to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public SocksCardGrpcClient(grpc::ChannelBase channel) : base(channel)
    {
    }
    /// <summary>Creates a new client for SocksCardGrpc that uses a custom <c>CallInvoker</c>.</summary>
    /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public SocksCardGrpcClient(grpc::CallInvoker callInvoker) : base(callInvoker)
    {
    }
    /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected SocksCardGrpcClient() : base()
    {
    }
    /// <summary>Protected constructor to allow creation of configured clients.</summary>
    /// <param name="configuration">The client configuration.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected SocksCardGrpcClient(ClientBaseConfiguration configuration) : base(configuration)
    {
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard getById(global::IntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard getById(global::IntReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> getByIdAsync(global::IntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> getByIdAsync(global::IntReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard addSockCard(global::sockCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addSockCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard addSockCard(global::sockCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_addSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> addSockCardAsync(global::sockCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return addSockCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> addSockCardAsync(global::sockCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_addSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::sockCard> getAllSockCards(global::Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getAllSockCards(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncServerStreamingCall<global::sockCard> getAllSockCards(global::Empty request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncServerStreamingCall(__Method_getAllSockCards, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard deleteSockCardById(global::IntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteSockCardById(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard deleteSockCardById(global::IntReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_deleteSockCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> deleteSockCardByIdAsync(global::IntReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return deleteSockCardByIdAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> deleteSockCardByIdAsync(global::IntReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_deleteSockCardById, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard getByTitle(global::StringReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitle(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard getByTitle(global::StringReq request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_getByTitle, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> getByTitleAsync(global::StringReq request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return getByTitleAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> getByTitleAsync(global::StringReq request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_getByTitle, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard updateSockCard(global::sockCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateSockCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual global::sockCard updateSockCard(global::sockCard request, grpc::CallOptions options)
    {
      return CallInvoker.BlockingUnaryCall(__Method_updateSockCard, null, options, request);
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> updateSockCardAsync(global::sockCard request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
    {
      return updateSockCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
    }
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public virtual grpc::AsyncUnaryCall<global::sockCard> updateSockCardAsync(global::sockCard request, grpc::CallOptions options)
    {
      return CallInvoker.AsyncUnaryCall(__Method_updateSockCard, null, options, request);
    }
    /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    protected override SocksCardGrpcClient NewInstance(ClientBaseConfiguration configuration)
    {
      return new SocksCardGrpcClient(configuration);
    }
  }

  /// <summary>Creates service definition that can be registered with a server</summary>
  /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
  [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
  public static grpc::ServerServiceDefinition BindService(SocksCardGrpcBase serviceImpl)
  {
    return grpc::ServerServiceDefinition.CreateBuilder()
        .AddMethod(__Method_getById, serviceImpl.getById)
        .AddMethod(__Method_addSockCard, serviceImpl.addSockCard)
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
  public static void BindService(grpc::ServiceBinderBase serviceBinder, SocksCardGrpcBase serviceImpl)
  {
    serviceBinder.AddMethod(__Method_getById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::IntReq, global::sockCard>(serviceImpl.getById));
    serviceBinder.AddMethod(__Method_addSockCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::sockCard, global::sockCard>(serviceImpl.addSockCard));
    serviceBinder.AddMethod(__Method_getAllSockCards, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::Empty, global::sockCard>(serviceImpl.getAllSockCards));
    serviceBinder.AddMethod(__Method_deleteSockCardById, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::IntReq, global::sockCard>(serviceImpl.deleteSockCardById));
    serviceBinder.AddMethod(__Method_getByTitle, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::StringReq, global::sockCard>(serviceImpl.getByTitle));
    serviceBinder.AddMethod(__Method_updateSockCard, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::sockCard, global::sockCard>(serviceImpl.updateSockCard));
  }

}
#endregion
