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
    comments = "Source: grpc/metadata_service.proto")
public final class MetadataServiceGrpc {

  private MetadataServiceGrpc() {}

  public static final String SERVICE_NAME = "conductor.grpc.metadata.MetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkflow",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> getCreateWorkflowMethod;
    if ((getCreateWorkflowMethod = MetadataServiceGrpc.getCreateWorkflowMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getCreateWorkflowMethod = MetadataServiceGrpc.getCreateWorkflowMethod) == null) {
          MetadataServiceGrpc.getCreateWorkflowMethod = getCreateWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "CreateWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("CreateWorkflow"))
                  .build();
          }
        }
     }
     return getCreateWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkflows",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> getUpdateWorkflowsMethod;
    if ((getUpdateWorkflowsMethod = MetadataServiceGrpc.getUpdateWorkflowsMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getUpdateWorkflowsMethod = MetadataServiceGrpc.getUpdateWorkflowsMethod) == null) {
          MetadataServiceGrpc.getUpdateWorkflowsMethod = getUpdateWorkflowsMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "UpdateWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("UpdateWorkflows"))
                  .build();
          }
        }
     }
     return getUpdateWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflow",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getGetWorkflowMethod;
    if ((getGetWorkflowMethod = MetadataServiceGrpc.getGetWorkflowMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetWorkflowMethod = MetadataServiceGrpc.getGetWorkflowMethod) == null) {
          MetadataServiceGrpc.getGetWorkflowMethod = getGetWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest, com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "GetWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetWorkflow"))
                  .build();
          }
        }
     }
     return getGetWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTasks",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
      com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> getCreateTasksMethod;
    if ((getCreateTasksMethod = MetadataServiceGrpc.getCreateTasksMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getCreateTasksMethod = MetadataServiceGrpc.getCreateTasksMethod) == null) {
          MetadataServiceGrpc.getCreateTasksMethod = getCreateTasksMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest, com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "CreateTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("CreateTasks"))
                  .build();
          }
        }
     }
     return getCreateTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = MetadataServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getUpdateTaskMethod = MetadataServiceGrpc.getUpdateTaskMethod) == null) {
          MetadataServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("UpdateTask"))
                  .build();
          }
        }
     }
     return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = MetadataServiceGrpc.getGetTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getGetTaskMethod = MetadataServiceGrpc.getGetTaskMethod) == null) {
          MetadataServiceGrpc.getGetTaskMethod = getGetTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("GetTask"))
                  .build();
          }
        }
     }
     return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest.class,
      responseType = com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
      com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = MetadataServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (MetadataServiceGrpc.class) {
        if ((getDeleteTaskMethod = MetadataServiceGrpc.getDeleteTaskMethod) == null) {
          MetadataServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest, com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.metadata.MetadataService", "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetadataServiceMethodDescriptorSupplier("DeleteTask"))
                  .build();
          }
        }
     }
     return getDeleteTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataServiceStub newStub(io.grpc.Channel channel) {
    return new MetadataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MetadataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public void createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public void updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public void getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public void createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public void deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest,
                com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>(
                  this, METHODID_CREATE_WORKFLOW)))
          .addMethod(
            getUpdateWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest,
                com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>(
                  this, METHODID_UPDATE_WORKFLOWS)))
          .addMethod(
            getGetWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest,
                com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>(
                  this, METHODID_GET_WORKFLOW)))
          .addMethod(
            getCreateTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest,
                com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>(
                  this, METHODID_CREATE_TASKS)))
          .addMethod(
            getUpdateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest,
                com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>(
                  this, METHODID_UPDATE_TASK)))
          .addMethod(
            getGetTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest,
                com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getDeleteTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest,
                com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>(
                  this, METHODID_DELETE_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class MetadataServiceStub extends io.grpc.stub.AbstractStub<MetadataServiceStub> {
    private MetadataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MetadataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public void createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public void updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public void getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public void createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public void deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetadataServiceBlockingStub extends io.grpc.stub.AbstractStub<MetadataServiceBlockingStub> {
    private MetadataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MetadataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse createWorkflow(com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse updateWorkflows(com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse getWorkflow(com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse createTasks(com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse updateTask(com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse getTask(com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse deleteTask(com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetadataServiceFutureStub extends io.grpc.stub.AbstractStub<MetadataServiceFutureStub> {
    private MetadataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MetadataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse> createWorkflow(
        com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /workflow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse> updateWorkflows(
        com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /workflow/{name}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse> getWorkflow(
        com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /taskdefs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse> createTasks(
        com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /taskdefs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse> updateTask(
        com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /taskdefs/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse> getTask(
        com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /taskdefs/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse> deleteTask(
        com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKFLOW = 0;
  private static final int METHODID_UPDATE_WORKFLOWS = 1;
  private static final int METHODID_GET_WORKFLOW = 2;
  private static final int METHODID_CREATE_TASKS = 3;
  private static final int METHODID_UPDATE_TASK = 4;
  private static final int METHODID_GET_TASK = 5;
  private static final int METHODID_DELETE_TASK = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetadataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WORKFLOW:
          serviceImpl.createWorkflow((com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateWorkflowResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKFLOWS:
          serviceImpl.updateWorkflows((com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateWorkflowsResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW:
          serviceImpl.getWorkflow((com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetWorkflowResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASKS:
          serviceImpl.createTasks((com.netflix.conductor.grpc.MetadataServicePb.CreateTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.CreateTasksResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.netflix.conductor.grpc.MetadataServicePb.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.GetTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.MetadataServicePb.DeleteTaskResponse>) responseObserver);
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

  private static abstract class MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetadataServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.MetadataServicePb.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetadataService");
    }
  }

  private static final class MetadataServiceFileDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier {
    MetadataServiceFileDescriptorSupplier() {}
  }

  private static final class MetadataServiceMethodDescriptorSupplier
      extends MetadataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetadataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataServiceFileDescriptorSupplier())
              .addMethod(getCreateWorkflowMethod())
              .addMethod(getUpdateWorkflowsMethod())
              .addMethod(getGetWorkflowMethod())
              .addMethod(getCreateTasksMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
