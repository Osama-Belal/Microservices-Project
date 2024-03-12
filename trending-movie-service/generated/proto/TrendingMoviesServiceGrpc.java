package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: trendingMovies.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrendingMoviesServiceGrpc {

  private TrendingMoviesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TrendingMoviesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.getMovieRequest,
      proto.topTenTrendingMovies> getGetTopTenTrendingMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopTenTrendingMovies",
      requestType = proto.getMovieRequest.class,
      responseType = proto.topTenTrendingMovies.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.getMovieRequest,
      proto.topTenTrendingMovies> getGetTopTenTrendingMoviesMethod() {
    io.grpc.MethodDescriptor<proto.getMovieRequest, proto.topTenTrendingMovies> getGetTopTenTrendingMoviesMethod;
    if ((getGetTopTenTrendingMoviesMethod = TrendingMoviesServiceGrpc.getGetTopTenTrendingMoviesMethod) == null) {
      synchronized (TrendingMoviesServiceGrpc.class) {
        if ((getGetTopTenTrendingMoviesMethod = TrendingMoviesServiceGrpc.getGetTopTenTrendingMoviesMethod) == null) {
          TrendingMoviesServiceGrpc.getGetTopTenTrendingMoviesMethod = getGetTopTenTrendingMoviesMethod =
              io.grpc.MethodDescriptor.<proto.getMovieRequest, proto.topTenTrendingMovies>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTopTenTrendingMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.getMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.topTenTrendingMovies.getDefaultInstance()))
              .setSchemaDescriptor(new TrendingMoviesServiceMethodDescriptorSupplier("getTopTenTrendingMovies"))
              .build();
        }
      }
    }
    return getGetTopTenTrendingMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceStub>() {
        @java.lang.Override
        public TrendingMoviesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesServiceStub(channel, callOptions);
        }
      };
    return TrendingMoviesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceBlockingStub>() {
        @java.lang.Override
        public TrendingMoviesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesServiceBlockingStub(channel, callOptions);
        }
      };
    return TrendingMoviesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesServiceFutureStub>() {
        @java.lang.Override
        public TrendingMoviesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesServiceFutureStub(channel, callOptions);
        }
      };
    return TrendingMoviesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTopTenTrendingMovies(proto.getMovieRequest request,
        io.grpc.stub.StreamObserver<proto.topTenTrendingMovies> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopTenTrendingMoviesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrendingMoviesService.
   */
  public static abstract class TrendingMoviesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrendingMoviesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrendingMoviesService.
   */
  public static final class TrendingMoviesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TrendingMoviesServiceStub> {
    private TrendingMoviesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTopTenTrendingMovies(proto.getMovieRequest request,
        io.grpc.stub.StreamObserver<proto.topTenTrendingMovies> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrendingMoviesService.
   */
  public static final class TrendingMoviesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrendingMoviesServiceBlockingStub> {
    private TrendingMoviesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.topTenTrendingMovies getTopTenTrendingMovies(proto.getMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopTenTrendingMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrendingMoviesService.
   */
  public static final class TrendingMoviesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrendingMoviesServiceFutureStub> {
    private TrendingMoviesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.topTenTrendingMovies> getTopTenTrendingMovies(
        proto.getMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopTenTrendingMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TEN_TRENDING_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_TEN_TRENDING_MOVIES:
          serviceImpl.getTopTenTrendingMovies((proto.getMovieRequest) request,
              (io.grpc.stub.StreamObserver<proto.topTenTrendingMovies>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTopTenTrendingMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.getMovieRequest,
              proto.topTenTrendingMovies>(
                service, METHODID_GET_TOP_TEN_TRENDING_MOVIES)))
        .build();
  }

  private static abstract class TrendingMoviesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrendingMoviesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.TrendingMoviesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrendingMoviesService");
    }
  }

  private static final class TrendingMoviesServiceFileDescriptorSupplier
      extends TrendingMoviesServiceBaseDescriptorSupplier {
    TrendingMoviesServiceFileDescriptorSupplier() {}
  }

  private static final class TrendingMoviesServiceMethodDescriptorSupplier
      extends TrendingMoviesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrendingMoviesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrendingMoviesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesServiceFileDescriptorSupplier())
              .addMethod(getGetTopTenTrendingMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
