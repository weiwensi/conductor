package com.netflix.conductor.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: grpc/event_service.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "conductor.grpc.events.EventService";

  // Static method descriptos that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> getAddEventHandlerMethod;
    if ((getAddEventHandlerMethod = EventServiceGrpc.getAddEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getAddEventHandlerMethod = EventServiceGrpc.getAddEventHandlerMethod) == null) {
          EventServiceGrpc.getAddEventHandlerMethod = getAddEventHandlerMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "AddEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("AddEventHandler"))
                  .build();
          }
        }
     }
     return getAddEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> getUpdateEventHandlerMethod;
    if ((getUpdateEventHandlerMethod = EventServiceGrpc.getUpdateEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUpdateEventHandlerMethod = EventServiceGrpc.getUpdateEventHandlerMethod) == null) {
          EventServiceGrpc.getUpdateEventHandlerMethod = getUpdateEventHandlerMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "UpdateEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("UpdateEventHandler"))
                  .build();
          }
        }
     }
     return getUpdateEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEventHandler",
      requestType = com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
      com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> getRemoveEventHandlerMethod;
    if ((getRemoveEventHandlerMethod = EventServiceGrpc.getRemoveEventHandlerMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getRemoveEventHandlerMethod = EventServiceGrpc.getRemoveEventHandlerMethod) == null) {
          EventServiceGrpc.getRemoveEventHandlerMethod = getRemoveEventHandlerMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest, com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "RemoveEventHandler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("RemoveEventHandler"))
                  .build();
          }
        }
     }
     return getRemoveEventHandlerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventHandlers",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest.class,
      responseType = com.netflix.conductor.proto.EventHandlerPb.EventHandler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersMethod;
    if ((getGetEventHandlersMethod = EventServiceGrpc.getGetEventHandlersMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventHandlersMethod = EventServiceGrpc.getGetEventHandlersMethod) == null) {
          EventServiceGrpc.getGetEventHandlersMethod = getGetEventHandlersMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "GetEventHandlers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.EventHandlerPb.EventHandler.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEventHandlers"))
                  .build();
          }
        }
     }
     return getGetEventHandlersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventHandlersForEvent",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest.class,
      responseType = com.netflix.conductor.proto.EventHandlerPb.EventHandler.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
      com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler> getGetEventHandlersForEventMethod;
    if ((getGetEventHandlersForEventMethod = EventServiceGrpc.getGetEventHandlersForEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventHandlersForEventMethod = EventServiceGrpc.getGetEventHandlersForEventMethod) == null) {
          EventServiceGrpc.getGetEventHandlersForEventMethod = getGetEventHandlersForEventMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest, com.netflix.conductor.proto.EventHandlerPb.EventHandler>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "GetEventHandlersForEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.EventHandlerPb.EventHandler.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEventHandlersForEvent"))
                  .build();
          }
        }
     }
     return getGetEventHandlersForEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> getGetQueuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueues",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> getGetQueuesMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest, com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> getGetQueuesMethod;
    if ((getGetQueuesMethod = EventServiceGrpc.getGetQueuesMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetQueuesMethod = EventServiceGrpc.getGetQueuesMethod) == null) {
          EventServiceGrpc.getGetQueuesMethod = getGetQueuesMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest, com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "GetQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetQueues"))
                  .build();
          }
        }
     }
     return getGetQueuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> getGetQueueSizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueSizes",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> getGetQueueSizesMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest, com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> getGetQueueSizesMethod;
    if ((getGetQueueSizesMethod = EventServiceGrpc.getGetQueueSizesMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetQueueSizesMethod = EventServiceGrpc.getGetQueueSizesMethod) == null) {
          EventServiceGrpc.getGetQueueSizesMethod = getGetQueueSizesMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest, com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "GetQueueSizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetQueueSizes"))
                  .build();
          }
        }
     }
     return getGetQueueSizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> getGetQueueProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueProviders",
      requestType = com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest.class,
      responseType = com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest,
      com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> getGetQueueProvidersMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest, com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> getGetQueueProvidersMethod;
    if ((getGetQueueProvidersMethod = EventServiceGrpc.getGetQueueProvidersMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetQueueProvidersMethod = EventServiceGrpc.getGetQueueProvidersMethod) == null) {
          EventServiceGrpc.getGetQueueProvidersMethod = getGetQueueProvidersMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest, com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.events.EventService", "GetQueueProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetQueueProviders"))
                  .build();
          }
        }
     }
     return getGetQueueProvidersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    return new EventServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public void updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public void removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveEventHandlerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    public void getEventHandlers(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventHandlersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    public void getEventHandlersForEvent(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventHandlersForEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queues
     * </pre>
     */
    public void getQueues(com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueuesMethod(), responseObserver);
    }

    /**
     */
    public void getQueueSizes(com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueSizesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queues/providers
     * </pre>
     */
    public void getQueueProviders(com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueProvidersMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddEventHandlerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest,
                com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>(
                  this, METHODID_ADD_EVENT_HANDLER)))
          .addMethod(
            getUpdateEventHandlerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest,
                com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>(
                  this, METHODID_UPDATE_EVENT_HANDLER)))
          .addMethod(
            getRemoveEventHandlerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest,
                com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>(
                  this, METHODID_REMOVE_EVENT_HANDLER)))
          .addMethod(
            getGetEventHandlersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest,
                com.netflix.conductor.proto.EventHandlerPb.EventHandler>(
                  this, METHODID_GET_EVENT_HANDLERS)))
          .addMethod(
            getGetEventHandlersForEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest,
                com.netflix.conductor.proto.EventHandlerPb.EventHandler>(
                  this, METHODID_GET_EVENT_HANDLERS_FOR_EVENT)))
          .addMethod(
            getGetQueuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest,
                com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse>(
                  this, METHODID_GET_QUEUES)))
          .addMethod(
            getGetQueueSizesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest,
                com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse>(
                  this, METHODID_GET_QUEUE_SIZES)))
          .addMethod(
            getGetQueueProvidersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest,
                com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse>(
                  this, METHODID_GET_QUEUE_PROVIDERS)))
          .build();
    }
  }

  /**
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractStub<EventServiceStub> {
    private EventServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public void updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public void removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveEventHandlerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    public void getEventHandlers(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEventHandlersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    public void getEventHandlersForEvent(com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEventHandlersForEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queues
     * </pre>
     */
    public void getQueues(com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueueSizes(com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueSizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queues/providers
     * </pre>
     */
    public void getQueueProviders(com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueProvidersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse addEventHandler(com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse updateEventHandler(com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse removeEventHandler(com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveEventHandlerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.EventHandlerPb.EventHandler> getEventHandlers(
        com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEventHandlersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{name}
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.EventHandlerPb.EventHandler> getEventHandlersForEvent(
        com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEventHandlersForEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queues
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse getQueues(com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse getQueueSizes(com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueSizesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queues/providers
     * </pre>
     */
    public com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse getQueueProviders(com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueProvidersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractStub<EventServiceFutureStub> {
    private EventServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse> addEventHandler(
        com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEventHandlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse> updateEventHandler(
        com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEventHandlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /{name}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse> removeEventHandler(
        com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveEventHandlerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queues
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse> getQueues(
        com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse> getQueueSizes(
        com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueSizesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queues/providers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse> getQueueProviders(
        com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueProvidersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EVENT_HANDLER = 0;
  private static final int METHODID_UPDATE_EVENT_HANDLER = 1;
  private static final int METHODID_REMOVE_EVENT_HANDLER = 2;
  private static final int METHODID_GET_EVENT_HANDLERS = 3;
  private static final int METHODID_GET_EVENT_HANDLERS_FOR_EVENT = 4;
  private static final int METHODID_GET_QUEUES = 5;
  private static final int METHODID_GET_QUEUE_SIZES = 6;
  private static final int METHODID_GET_QUEUE_PROVIDERS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_EVENT_HANDLER:
          serviceImpl.addEventHandler((com.netflix.conductor.grpc.EventServicePb.AddEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.AddEventHandlerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_HANDLER:
          serviceImpl.updateEventHandler((com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.UpdateEventHandlerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EVENT_HANDLER:
          serviceImpl.removeEventHandler((com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.RemoveEventHandlerResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT_HANDLERS:
          serviceImpl.getEventHandlers((com.netflix.conductor.grpc.EventServicePb.GetEventHandlersRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler>) responseObserver);
          break;
        case METHODID_GET_EVENT_HANDLERS_FOR_EVENT:
          serviceImpl.getEventHandlersForEvent((com.netflix.conductor.grpc.EventServicePb.GetEventHandlersForEventRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.EventHandlerPb.EventHandler>) responseObserver);
          break;
        case METHODID_GET_QUEUES:
          serviceImpl.getQueues((com.netflix.conductor.grpc.EventServicePb.GetQueuesRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueuesResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_SIZES:
          serviceImpl.getQueueSizes((com.netflix.conductor.grpc.EventServicePb.GetQueueSizesRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueSizesResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_PROVIDERS:
          serviceImpl.getQueueProviders((com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.EventServicePb.GetQueueProvidersResponse>) responseObserver);
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

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.EventServicePb.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getAddEventHandlerMethod())
              .addMethod(getUpdateEventHandlerMethod())
              .addMethod(getRemoveEventHandlerMethod())
              .addMethod(getGetEventHandlersMethod())
              .addMethod(getGetEventHandlersForEventMethod())
              .addMethod(getGetQueuesMethod())
              .addMethod(getGetQueueSizesMethod())
              .addMethod(getGetQueueProvidersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
