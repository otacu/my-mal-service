package com.egoist.mal.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: anime_proto.proto")
public final class AnimeProtoServiceGrpc {

  private AnimeProtoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.egoist.mal.grpc.generated.AnimeProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest,
      com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest.class,
      responseType = com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest,
      com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest, com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> getSearchMethod;
    if ((getSearchMethod = AnimeProtoServiceGrpc.getSearchMethod) == null) {
      synchronized (AnimeProtoServiceGrpc.class) {
        if ((getSearchMethod = AnimeProtoServiceGrpc.getSearchMethod) == null) {
          AnimeProtoServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest, com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.egoist.mal.grpc.generated.AnimeProtoService", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AnimeProtoServiceMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimeProtoServiceStub newStub(io.grpc.Channel channel) {
    return new AnimeProtoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimeProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnimeProtoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimeProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnimeProtoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AnimeProtoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest request,
        io.grpc.stub.StreamObserver<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest,
                com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class AnimeProtoServiceStub extends io.grpc.stub.AbstractStub<AnimeProtoServiceStub> {
    private AnimeProtoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimeProtoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimeProtoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimeProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest request,
        io.grpc.stub.StreamObserver<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimeProtoServiceBlockingStub extends io.grpc.stub.AbstractStub<AnimeProtoServiceBlockingStub> {
    private AnimeProtoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimeProtoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimeProtoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimeProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse search(com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimeProtoServiceFutureStub extends io.grpc.stub.AbstractStub<AnimeProtoServiceFutureStub> {
    private AnimeProtoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnimeProtoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimeProtoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnimeProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse> search(
        com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimeProtoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimeProtoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.egoist.mal.grpc.generated.AnimeProto.AnimeSearchResponse>) responseObserver);
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

  private static abstract class AnimeProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimeProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.egoist.mal.grpc.generated.AnimeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimeProtoService");
    }
  }

  private static final class AnimeProtoServiceFileDescriptorSupplier
      extends AnimeProtoServiceBaseDescriptorSupplier {
    AnimeProtoServiceFileDescriptorSupplier() {}
  }

  private static final class AnimeProtoServiceMethodDescriptorSupplier
      extends AnimeProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimeProtoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimeProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimeProtoServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
