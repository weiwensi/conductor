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
    comments = "Source: grpc/task_service.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "conductor.grpc.tasks.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest,
      com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Poll",
      requestType = com.netflix.conductor.grpc.TaskServicePb.PollRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.PollResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest,
      com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PollRequest, com.netflix.conductor.grpc.TaskServicePb.PollResponse> getPollMethod;
    if ((getPollMethod = TaskServiceGrpc.getPollMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getPollMethod = TaskServiceGrpc.getPollMethod) == null) {
          TaskServiceGrpc.getPollMethod = getPollMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.PollRequest, com.netflix.conductor.grpc.TaskServicePb.PollResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "Poll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PollRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PollResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Poll"))
                  .build();
          }
        }
     }
     return getPollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
      com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchPoll",
      requestType = com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest.class,
      responseType = com.netflix.conductor.proto.TaskPb.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
      com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest, com.netflix.conductor.proto.TaskPb.Task> getBatchPollMethod;
    if ((getBatchPollMethod = TaskServiceGrpc.getBatchPollMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getBatchPollMethod = TaskServiceGrpc.getBatchPollMethod) == null) {
          TaskServiceGrpc.getBatchPollMethod = getBatchPollMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest, com.netflix.conductor.proto.TaskPb.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "BatchPoll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.TaskPb.Task.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("BatchPoll"))
                  .build();
          }
        }
     }
     return getBatchPollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest,
      com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> getGetTasksInProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTasksInProgress",
      requestType = com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest,
      com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> getGetTasksInProgressMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest, com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> getGetTasksInProgressMethod;
    if ((getGetTasksInProgressMethod = TaskServiceGrpc.getGetTasksInProgressMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTasksInProgressMethod = TaskServiceGrpc.getGetTasksInProgressMethod) == null) {
          TaskServiceGrpc.getGetTasksInProgressMethod = getGetTasksInProgressMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest, com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetTasksInProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTasksInProgress"))
                  .build();
          }
        }
     }
     return getGetTasksInProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> getGetPendingTaskForWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingTaskForWorkflow",
      requestType = com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> getGetPendingTaskForWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest, com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> getGetPendingTaskForWorkflowMethod;
    if ((getGetPendingTaskForWorkflowMethod = TaskServiceGrpc.getGetPendingTaskForWorkflowMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetPendingTaskForWorkflowMethod = TaskServiceGrpc.getGetPendingTaskForWorkflowMethod) == null) {
          TaskServiceGrpc.getGetPendingTaskForWorkflowMethod = getGetPendingTaskForWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest, com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetPendingTaskForWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetPendingTaskForWorkflow"))
                  .build();
          }
        }
     }
     return getGetPendingTaskForWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
          TaskServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest, com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("UpdateTask"))
                  .build();
          }
        }
     }
     return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> getAckTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AckTask",
      requestType = com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> getAckTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest, com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> getAckTaskMethod;
    if ((getAckTaskMethod = TaskServiceGrpc.getAckTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getAckTaskMethod = TaskServiceGrpc.getAckTaskMethod) == null) {
          TaskServiceGrpc.getAckTaskMethod = getAckTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest, com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "AckTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("AckTask"))
                  .build();
          }
        }
     }
     return getAckTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
      com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLog",
      requestType = com.netflix.conductor.grpc.TaskServicePb.AddLogRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.AddLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
      com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest, com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> getAddLogMethod;
    if ((getAddLogMethod = TaskServiceGrpc.getAddLogMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getAddLogMethod = TaskServiceGrpc.getAddLogMethod) == null) {
          TaskServiceGrpc.getAddLogMethod = getAddLogMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.AddLogRequest, com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "AddLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AddLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.AddLogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("AddLog"))
                  .build();
          }
        }
     }
     return getAddLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskLogs",
      requestType = com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getGetTaskLogsMethod;
    if ((getGetTaskLogsMethod = TaskServiceGrpc.getGetTaskLogsMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTaskLogsMethod = TaskServiceGrpc.getGetTaskLogsMethod) == null) {
          TaskServiceGrpc.getGetTaskLogsMethod = getGetTaskLogsMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetTaskLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTaskLogs"))
                  .build();
          }
        }
     }
     return getGetTaskLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTaskMethod = TaskServiceGrpc.getGetTaskMethod) == null) {
          TaskServiceGrpc.getGetTaskMethod = getGetTaskMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest, com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTask"))
                  .build();
          }
        }
     }
     return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> getRemoveTaskFromQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTaskFromQueue",
      requestType = com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest,
      com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> getRemoveTaskFromQueueMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest, com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> getRemoveTaskFromQueueMethod;
    if ((getRemoveTaskFromQueueMethod = TaskServiceGrpc.getRemoveTaskFromQueueMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getRemoveTaskFromQueueMethod = TaskServiceGrpc.getRemoveTaskFromQueueMethod) == null) {
          TaskServiceGrpc.getRemoveTaskFromQueueMethod = getRemoveTaskFromQueueMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest, com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "RemoveTaskFromQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("RemoveTaskFromQueue"))
                  .build();
          }
        }
     }
     return getRemoveTaskFromQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueSizesForTasks",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest, com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getGetQueueSizesForTasksMethod;
    if ((getGetQueueSizesForTasksMethod = TaskServiceGrpc.getGetQueueSizesForTasksMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueSizesForTasksMethod = TaskServiceGrpc.getGetQueueSizesForTasksMethod) == null) {
          TaskServiceGrpc.getGetQueueSizesForTasksMethod = getGetQueueSizesForTasksMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest, com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetQueueSizesForTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueSizesForTasks"))
                  .build();
          }
        }
     }
     return getGetQueueSizesForTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueInfo",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getGetQueueInfoMethod;
    if ((getGetQueueInfoMethod = TaskServiceGrpc.getGetQueueInfoMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueInfoMethod = TaskServiceGrpc.getGetQueueInfoMethod) == null) {
          TaskServiceGrpc.getGetQueueInfoMethod = getGetQueueInfoMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetQueueInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueInfo"))
                  .build();
          }
        }
     }
     return getGetQueueInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueAllInfo",
      requestType = com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest.class,
      responseType = com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
      com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getGetQueueAllInfoMethod;
    if ((getGetQueueAllInfoMethod = TaskServiceGrpc.getGetQueueAllInfoMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetQueueAllInfoMethod = TaskServiceGrpc.getGetQueueAllInfoMethod) == null) {
          TaskServiceGrpc.getGetQueueAllInfoMethod = getGetQueueAllInfoMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest, com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.tasks.TaskService", "GetQueueAllInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetQueueAllInfo"))
                  .build();
          }
        }
     }
     return getGetQueueAllInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    return new TaskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public void poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPollMethod(), responseObserver);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    public void batchPoll(com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchPollMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /in_progress/{tasktype}
     * </pre>
     */
    public void getTasksInProgress(com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTasksInProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /in_progress/{workflowId}/{taskRefName}
     * </pre>
     */
    public void getPendingTaskForWorkflow(com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPendingTaskForWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/ack
     * </pre>
     */
    public void ackTask(com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAckTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public void addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public void getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /queue/{taskType}/{taskId}
     * </pre>
     */
    public void removeTaskFromQueue(com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTaskFromQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public void getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueSizesForTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public void getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public void getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueAllInfoMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPollMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.PollRequest,
                com.netflix.conductor.grpc.TaskServicePb.PollResponse>(
                  this, METHODID_POLL)))
          .addMethod(
            getBatchPollMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest,
                com.netflix.conductor.proto.TaskPb.Task>(
                  this, METHODID_BATCH_POLL)))
          .addMethod(
            getGetTasksInProgressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest,
                com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse>(
                  this, METHODID_GET_TASKS_IN_PROGRESS)))
          .addMethod(
            getGetPendingTaskForWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest,
                com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse>(
                  this, METHODID_GET_PENDING_TASK_FOR_WORKFLOW)))
          .addMethod(
            getUpdateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest,
                com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>(
                  this, METHODID_UPDATE_TASK)))
          .addMethod(
            getAckTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest,
                com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse>(
                  this, METHODID_ACK_TASK)))
          .addMethod(
            getAddLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.AddLogRequest,
                com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>(
                  this, METHODID_ADD_LOG)))
          .addMethod(
            getGetTaskLogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest,
                com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>(
                  this, METHODID_GET_TASK_LOGS)))
          .addMethod(
            getGetTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest,
                com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getRemoveTaskFromQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest,
                com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse>(
                  this, METHODID_REMOVE_TASK_FROM_QUEUE)))
          .addMethod(
            getGetQueueSizesForTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest,
                com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>(
                  this, METHODID_GET_QUEUE_SIZES_FOR_TASKS)))
          .addMethod(
            getGetQueueInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest,
                com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>(
                  this, METHODID_GET_QUEUE_INFO)))
          .addMethod(
            getGetQueueAllInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest,
                com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>(
                  this, METHODID_GET_QUEUE_ALL_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractStub<TaskServiceStub> {
    private TaskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public void poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    public void batchPoll(com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBatchPollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /in_progress/{tasktype}
     * </pre>
     */
    public void getTasksInProgress(com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTasksInProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /in_progress/{workflowId}/{taskRefName}
     * </pre>
     */
    public void getPendingTaskForWorkflow(com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPendingTaskForWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/ack
     * </pre>
     */
    public void ackTask(com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAckTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public void addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public void getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public void getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /queue/{taskType}/{taskId}
     * </pre>
     */
    public void removeTaskFromQueue(com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTaskFromQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public void getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueSizesForTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public void getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public void getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueAllInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.PollResponse poll(com.netflix.conductor.grpc.TaskServicePb.PollRequest request) {
      return blockingUnaryCall(
          getChannel(), getPollMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * /poll/batch/{tasktype}
     * </pre>
     */
    public java.util.Iterator<com.netflix.conductor.proto.TaskPb.Task> batchPoll(
        com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getBatchPollMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /in_progress/{tasktype}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse getTasksInProgress(com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTasksInProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /in_progress/{workflowId}/{taskRefName}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse getPendingTaskForWorkflow(com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPendingTaskForWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse updateTask(com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{taskId}/ack
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse ackTask(com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getAckTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.AddLogResponse addLog(com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse getTaskLogs(com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse getTask(com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /queue/{taskType}/{taskId}
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse removeTaskFromQueue(com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTaskFromQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse getQueueSizesForTasks(com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueSizesForTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse getQueueInfo(com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse getQueueAllInfo(com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueAllInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET /poll/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.PollResponse> poll(
        com.netflix.conductor.grpc.TaskServicePb.PollRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPollMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /in_progress/{tasktype}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse> getTasksInProgress(
        com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTasksInProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /in_progress/{workflowId}/{taskRefName}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse> getPendingTaskForWorkflow(
        com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPendingTaskForWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse> updateTask(
        com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{taskId}/ack
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse> ackTask(
        com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAckTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{taskId}/log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse> addLog(
        com.netflix.conductor.grpc.TaskServicePb.AddLogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET {taskId}/log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse> getTaskLogs(
        com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /{taskId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse> getTask(
        com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /queue/{taskType}/{taskId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse> removeTaskFromQueue(
        com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTaskFromQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/sizes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse> getQueueSizesForTasks(
        com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueSizesForTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/all
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse> getQueueInfo(
        com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /queue/all/verbose
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse> getQueueAllInfo(
        com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueAllInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POLL = 0;
  private static final int METHODID_BATCH_POLL = 1;
  private static final int METHODID_GET_TASKS_IN_PROGRESS = 2;
  private static final int METHODID_GET_PENDING_TASK_FOR_WORKFLOW = 3;
  private static final int METHODID_UPDATE_TASK = 4;
  private static final int METHODID_ACK_TASK = 5;
  private static final int METHODID_ADD_LOG = 6;
  private static final int METHODID_GET_TASK_LOGS = 7;
  private static final int METHODID_GET_TASK = 8;
  private static final int METHODID_REMOVE_TASK_FROM_QUEUE = 9;
  private static final int METHODID_GET_QUEUE_SIZES_FOR_TASKS = 10;
  private static final int METHODID_GET_QUEUE_INFO = 11;
  private static final int METHODID_GET_QUEUE_ALL_INFO = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POLL:
          serviceImpl.poll((com.netflix.conductor.grpc.TaskServicePb.PollRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PollResponse>) responseObserver);
          break;
        case METHODID_BATCH_POLL:
          serviceImpl.batchPoll((com.netflix.conductor.grpc.TaskServicePb.BatchPollRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.TaskPb.Task>) responseObserver);
          break;
        case METHODID_GET_TASKS_IN_PROGRESS:
          serviceImpl.getTasksInProgress((com.netflix.conductor.grpc.TaskServicePb.TasksInProgressRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.TasksInProgressResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_TASK_FOR_WORKFLOW:
          serviceImpl.getPendingTaskForWorkflow((com.netflix.conductor.grpc.TaskServicePb.PendingTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.PendingTaskResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.netflix.conductor.grpc.TaskServicePb.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_ACK_TASK:
          serviceImpl.ackTask((com.netflix.conductor.grpc.TaskServicePb.AckTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AckTaskResponse>) responseObserver);
          break;
        case METHODID_ADD_LOG:
          serviceImpl.addLog((com.netflix.conductor.grpc.TaskServicePb.AddLogRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.AddLogResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_LOGS:
          serviceImpl.getTaskLogs((com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskLogsResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.netflix.conductor.grpc.TaskServicePb.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.GetTaskResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TASK_FROM_QUEUE:
          serviceImpl.removeTaskFromQueue((com.netflix.conductor.grpc.TaskServicePb.RemoveTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.RemoveTaskResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_SIZES_FOR_TASKS:
          serviceImpl.getQueueSizesForTasks((com.netflix.conductor.grpc.TaskServicePb.QueueSizesRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueSizesResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_INFO:
          serviceImpl.getQueueInfo((com.netflix.conductor.grpc.TaskServicePb.QueueInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueInfoResponse>) responseObserver);
          break;
        case METHODID_GET_QUEUE_ALL_INFO:
          serviceImpl.getQueueAllInfo((com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.TaskServicePb.QueueAllInfoResponse>) responseObserver);
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

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.TaskServicePb.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getPollMethod())
              .addMethod(getBatchPollMethod())
              .addMethod(getGetTasksInProgressMethod())
              .addMethod(getGetPendingTaskForWorkflowMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getAckTaskMethod())
              .addMethod(getAddLogMethod())
              .addMethod(getGetTaskLogsMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getRemoveTaskFromQueueMethod())
              .addMethod(getGetQueueSizesForTasksMethod())
              .addMethod(getGetQueueInfoMethod())
              .addMethod(getGetQueueAllInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
