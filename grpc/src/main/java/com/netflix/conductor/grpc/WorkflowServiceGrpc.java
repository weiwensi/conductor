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
    comments = "Source: grpc/workflow_service.proto")
public final class WorkflowServiceGrpc {

  private WorkflowServiceGrpc() {}

  public static final String SERVICE_NAME = "conductor.grpc.workflows.WorkflowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> getStartWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartWorkflow",
      requestType = com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> getStartWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> getStartWorkflowMethod;
    if ((getStartWorkflowMethod = WorkflowServiceGrpc.getStartWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getStartWorkflowMethod = WorkflowServiceGrpc.getStartWorkflowMethod) == null) {
          WorkflowServiceGrpc.getStartWorkflowMethod = getStartWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "StartWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("StartWorkflow"))
                  .build();
          }
        }
     }
     return getStartWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> getGetWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflows",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> getGetWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest, com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> getGetWorkflowsMethod;
    if ((getGetWorkflowsMethod = WorkflowServiceGrpc.getGetWorkflowsMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getGetWorkflowsMethod = WorkflowServiceGrpc.getGetWorkflowsMethod) == null) {
          WorkflowServiceGrpc.getGetWorkflowsMethod = getGetWorkflowsMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest, com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "GetWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("GetWorkflows"))
                  .build();
          }
        }
     }
     return getGetWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest,
      com.netflix.conductor.proto.WorkflowPb.Workflow> getGetWorkflowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflowStatus",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest.class,
      responseType = com.netflix.conductor.proto.WorkflowPb.Workflow.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest,
      com.netflix.conductor.proto.WorkflowPb.Workflow> getGetWorkflowStatusMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest, com.netflix.conductor.proto.WorkflowPb.Workflow> getGetWorkflowStatusMethod;
    if ((getGetWorkflowStatusMethod = WorkflowServiceGrpc.getGetWorkflowStatusMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getGetWorkflowStatusMethod = WorkflowServiceGrpc.getGetWorkflowStatusMethod) == null) {
          WorkflowServiceGrpc.getGetWorkflowStatusMethod = getGetWorkflowStatusMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest, com.netflix.conductor.proto.WorkflowPb.Workflow>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "GetWorkflowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.WorkflowPb.Workflow.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("GetWorkflowStatus"))
                  .build();
          }
        }
     }
     return getGetWorkflowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> getRemoveWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> getRemoveWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> getRemoveWorkflowMethod;
    if ((getRemoveWorkflowMethod = WorkflowServiceGrpc.getRemoveWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getRemoveWorkflowMethod = WorkflowServiceGrpc.getRemoveWorkflowMethod) == null) {
          WorkflowServiceGrpc.getRemoveWorkflowMethod = getRemoveWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "RemoveWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("RemoveWorkflow"))
                  .build();
          }
        }
     }
     return getRemoveWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> getGetRunningWorkflowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRunningWorkflows",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> getGetRunningWorkflowsMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest, com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> getGetRunningWorkflowsMethod;
    if ((getGetRunningWorkflowsMethod = WorkflowServiceGrpc.getGetRunningWorkflowsMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getGetRunningWorkflowsMethod = WorkflowServiceGrpc.getGetRunningWorkflowsMethod) == null) {
          WorkflowServiceGrpc.getGetRunningWorkflowsMethod = getGetRunningWorkflowsMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest, com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "GetRunningWorkflows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("GetRunningWorkflows"))
                  .build();
          }
        }
     }
     return getGetRunningWorkflowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> getDecideWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecideWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> getDecideWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> getDecideWorkflowMethod;
    if ((getDecideWorkflowMethod = WorkflowServiceGrpc.getDecideWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getDecideWorkflowMethod = WorkflowServiceGrpc.getDecideWorkflowMethod) == null) {
          WorkflowServiceGrpc.getDecideWorkflowMethod = getDecideWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "DecideWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("DecideWorkflow"))
                  .build();
          }
        }
     }
     return getDecideWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> getPauseWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> getPauseWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> getPauseWorkflowMethod;
    if ((getPauseWorkflowMethod = WorkflowServiceGrpc.getPauseWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getPauseWorkflowMethod = WorkflowServiceGrpc.getPauseWorkflowMethod) == null) {
          WorkflowServiceGrpc.getPauseWorkflowMethod = getPauseWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "PauseWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("PauseWorkflow"))
                  .build();
          }
        }
     }
     return getPauseWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> getResumeWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> getResumeWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> getResumeWorkflowMethod;
    if ((getResumeWorkflowMethod = WorkflowServiceGrpc.getResumeWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getResumeWorkflowMethod = WorkflowServiceGrpc.getResumeWorkflowMethod) == null) {
          WorkflowServiceGrpc.getResumeWorkflowMethod = getResumeWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "ResumeWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("ResumeWorkflow"))
                  .build();
          }
        }
     }
     return getResumeWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> getSkipTaskFromWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SkipTaskFromWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> getSkipTaskFromWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest, com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> getSkipTaskFromWorkflowMethod;
    if ((getSkipTaskFromWorkflowMethod = WorkflowServiceGrpc.getSkipTaskFromWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getSkipTaskFromWorkflowMethod = WorkflowServiceGrpc.getSkipTaskFromWorkflowMethod) == null) {
          WorkflowServiceGrpc.getSkipTaskFromWorkflowMethod = getSkipTaskFromWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest, com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "SkipTaskFromWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("SkipTaskFromWorkflow"))
                  .build();
          }
        }
     }
     return getSkipTaskFromWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> getRerunWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RerunWorkflow",
      requestType = com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> getRerunWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> getRerunWorkflowMethod;
    if ((getRerunWorkflowMethod = WorkflowServiceGrpc.getRerunWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getRerunWorkflowMethod = WorkflowServiceGrpc.getRerunWorkflowMethod) == null) {
          WorkflowServiceGrpc.getRerunWorkflowMethod = getRerunWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "RerunWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("RerunWorkflow"))
                  .build();
          }
        }
     }
     return getRerunWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> getRestartWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestartWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> getRestartWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> getRestartWorkflowMethod;
    if ((getRestartWorkflowMethod = WorkflowServiceGrpc.getRestartWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getRestartWorkflowMethod = WorkflowServiceGrpc.getRestartWorkflowMethod) == null) {
          WorkflowServiceGrpc.getRestartWorkflowMethod = getRestartWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "RestartWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("RestartWorkflow"))
                  .build();
          }
        }
     }
     return getRestartWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> getRetryWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> getRetryWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> getRetryWorkflowMethod;
    if ((getRetryWorkflowMethod = WorkflowServiceGrpc.getRetryWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getRetryWorkflowMethod = WorkflowServiceGrpc.getRetryWorkflowMethod) == null) {
          WorkflowServiceGrpc.getRetryWorkflowMethod = getRetryWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "RetryWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("RetryWorkflow"))
                  .build();
          }
        }
     }
     return getRetryWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> getResetWorkflowCallbacksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetWorkflowCallbacks",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> getResetWorkflowCallbacksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest, com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> getResetWorkflowCallbacksMethod;
    if ((getResetWorkflowCallbacksMethod = WorkflowServiceGrpc.getResetWorkflowCallbacksMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getResetWorkflowCallbacksMethod = WorkflowServiceGrpc.getResetWorkflowCallbacksMethod) == null) {
          WorkflowServiceGrpc.getResetWorkflowCallbacksMethod = getResetWorkflowCallbacksMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest, com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "ResetWorkflowCallbacks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("ResetWorkflowCallbacks"))
                  .build();
          }
        }
     }
     return getResetWorkflowCallbacksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> getTerminateWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateWorkflow",
      requestType = com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest,
      com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> getTerminateWorkflowMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> getTerminateWorkflowMethod;
    if ((getTerminateWorkflowMethod = WorkflowServiceGrpc.getTerminateWorkflowMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getTerminateWorkflowMethod = WorkflowServiceGrpc.getTerminateWorkflowMethod) == null) {
          WorkflowServiceGrpc.getTerminateWorkflowMethod = getTerminateWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest, com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "TerminateWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("TerminateWorkflow"))
                  .build();
          }
        }
     }
     return getTerminateWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchMethod;
    if ((getSearchMethod = WorkflowServiceGrpc.getSearchMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getSearchMethod = WorkflowServiceGrpc.getSearchMethod) == null) {
          WorkflowServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchByTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByTasks",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchByTasksMethod() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> getSearchByTasksMethod;
    if ((getSearchByTasksMethod = WorkflowServiceGrpc.getSearchByTasksMethod) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getSearchByTasksMethod = WorkflowServiceGrpc.getSearchByTasksMethod) == null) {
          WorkflowServiceGrpc.getSearchByTasksMethod = getSearchByTasksMethod = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "SearchByTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("SearchByTasks"))
                  .build();
          }
        }
     }
     return getSearchByTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchV2",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchV2Method() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchV2Method;
    if ((getSearchV2Method = WorkflowServiceGrpc.getSearchV2Method) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getSearchV2Method = WorkflowServiceGrpc.getSearchV2Method) == null) {
          WorkflowServiceGrpc.getSearchV2Method = getSearchV2Method = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "SearchV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("SearchV2"))
                  .build();
          }
        }
     }
     return getSearchV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchByTasksV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchByTasksV2",
      requestType = com.netflix.conductor.grpc.SearchPb.Request.class,
      responseType = com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request,
      com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchByTasksV2Method() {
    io.grpc.MethodDescriptor<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> getSearchByTasksV2Method;
    if ((getSearchByTasksV2Method = WorkflowServiceGrpc.getSearchByTasksV2Method) == null) {
      synchronized (WorkflowServiceGrpc.class) {
        if ((getSearchByTasksV2Method = WorkflowServiceGrpc.getSearchByTasksV2Method) == null) {
          WorkflowServiceGrpc.getSearchByTasksV2Method = getSearchByTasksV2Method = 
              io.grpc.MethodDescriptor.<com.netflix.conductor.grpc.SearchPb.Request, com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "conductor.grpc.workflows.WorkflowService", "SearchByTasksV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.SearchPb.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new WorkflowServiceMethodDescriptorSupplier("SearchByTasksV2"))
                  .build();
          }
        }
     }
     return getSearchByTasksV2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowServiceStub newStub(io.grpc.Channel channel) {
    return new WorkflowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkflowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkflowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WorkflowServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void startWorkflow(com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{name}/correlated/{correlationId}
     * </pre>
     */
    public void getWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /{workflowId}
     * </pre>
     */
    public void getWorkflowStatus(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.WorkflowPb.Workflow> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWorkflowStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /{workflodId}/remove
     * </pre>
     */
    public void removeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /running/{name}
     * </pre>
     */
    public void getRunningWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRunningWorkflowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /decide/{workflowId}
     * </pre>
     */
    public void decideWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecideWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public void pauseWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public void resumeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResumeWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/skiptask/{taskReferenceName}
     * </pre>
     */
    public void skipTaskFromWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSkipTaskFromWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/rerun
     * </pre>
     */
    public void rerunWorkflow(com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRerunWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/restart
     * </pre>
     */
    public void restartWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRestartWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}retry
     * </pre>
     */
    public void retryWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRetryWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/resetcallbacks
     * </pre>
     */
    public void resetWorkflowCallbacks(com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetWorkflowCallbacksMethod(), responseObserver);
    }

    /**
     * <pre>
     * DELETE /{workflowId}
     * </pre>
     */
    public void terminateWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateWorkflowMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public void search(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchByTasks(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public void searchV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchV2Method(), responseObserver);
    }

    /**
     */
    public void searchByTasksV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByTasksV2Method(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse>(
                  this, METHODID_START_WORKFLOW)))
          .addMethod(
            getGetWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse>(
                  this, METHODID_GET_WORKFLOWS)))
          .addMethod(
            getGetWorkflowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest,
                com.netflix.conductor.proto.WorkflowPb.Workflow>(
                  this, METHODID_GET_WORKFLOW_STATUS)))
          .addMethod(
            getRemoveWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse>(
                  this, METHODID_REMOVE_WORKFLOW)))
          .addMethod(
            getGetRunningWorkflowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse>(
                  this, METHODID_GET_RUNNING_WORKFLOWS)))
          .addMethod(
            getDecideWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse>(
                  this, METHODID_DECIDE_WORKFLOW)))
          .addMethod(
            getPauseWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse>(
                  this, METHODID_PAUSE_WORKFLOW)))
          .addMethod(
            getResumeWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse>(
                  this, METHODID_RESUME_WORKFLOW)))
          .addMethod(
            getSkipTaskFromWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse>(
                  this, METHODID_SKIP_TASK_FROM_WORKFLOW)))
          .addMethod(
            getRerunWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse>(
                  this, METHODID_RERUN_WORKFLOW)))
          .addMethod(
            getRestartWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse>(
                  this, METHODID_RESTART_WORKFLOW)))
          .addMethod(
            getRetryWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse>(
                  this, METHODID_RETRY_WORKFLOW)))
          .addMethod(
            getResetWorkflowCallbacksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse>(
                  this, METHODID_RESET_WORKFLOW_CALLBACKS)))
          .addMethod(
            getTerminateWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest,
                com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse>(
                  this, METHODID_TERMINATE_WORKFLOW)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.SearchPb.Request,
                com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchByTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.SearchPb.Request,
                com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>(
                  this, METHODID_SEARCH_BY_TASKS)))
          .addMethod(
            getSearchV2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.SearchPb.Request,
                com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>(
                  this, METHODID_SEARCH_V2)))
          .addMethod(
            getSearchByTasksV2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netflix.conductor.grpc.SearchPb.Request,
                com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>(
                  this, METHODID_SEARCH_BY_TASKS_V2)))
          .build();
    }
  }

  /**
   */
  public static final class WorkflowServiceStub extends io.grpc.stub.AbstractStub<WorkflowServiceStub> {
    private WorkflowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkflowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public void startWorkflow(com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{name}/correlated/{correlationId}
     * </pre>
     */
    public void getWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /{workflowId}
     * </pre>
     */
    public void getWorkflowStatus(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.proto.WorkflowPb.Workflow> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWorkflowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /{workflodId}/remove
     * </pre>
     */
    public void removeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /running/{name}
     * </pre>
     */
    public void getRunningWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRunningWorkflowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /decide/{workflowId}
     * </pre>
     */
    public void decideWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecideWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public void pauseWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public void resumeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResumeWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PUT /{workflowId}/skiptask/{taskReferenceName}
     * </pre>
     */
    public void skipTaskFromWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSkipTaskFromWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/rerun
     * </pre>
     */
    public void rerunWorkflow(com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRerunWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/restart
     * </pre>
     */
    public void restartWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestartWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}retry
     * </pre>
     */
    public void retryWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetryWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * POST /{workflowId}/resetcallbacks
     * </pre>
     */
    public void resetWorkflowCallbacks(com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetWorkflowCallbacksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DELETE /{workflowId}
     * </pre>
     */
    public void terminateWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public void search(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByTasks(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public void searchV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByTasksV2(com.netflix.conductor.grpc.SearchPb.Request request,
        io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByTasksV2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WorkflowServiceBlockingStub extends io.grpc.stub.AbstractStub<WorkflowServiceBlockingStub> {
    private WorkflowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkflowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse startWorkflow(com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{name}/correlated/{correlationId}
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse getWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /{workflowId}
     * </pre>
     */
    public com.netflix.conductor.proto.WorkflowPb.Workflow getWorkflowStatus(com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWorkflowStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /{workflodId}/remove
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse removeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /running/{name}
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse getRunningWorkflows(com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRunningWorkflowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /decide/{workflowId}
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse decideWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getDecideWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse pauseWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse resumeWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getResumeWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/skiptask/{taskReferenceName}
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse skipTaskFromWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getSkipTaskFromWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/rerun
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse rerunWorkflow(com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getRerunWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/restart
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse restartWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestartWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{workflowId}retry
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse retryWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetryWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/resetcallbacks
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse resetWorkflowCallbacks(com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetWorkflowCallbacksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DELETE /{workflowId}
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse terminateWorkflow(com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest request) {
      return blockingUnaryCall(
          getChannel(), getTerminateWorkflowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult search(com.netflix.conductor.grpc.SearchPb.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult searchByTasks(com.netflix.conductor.grpc.SearchPb.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchByTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult searchV2(com.netflix.conductor.grpc.SearchPb.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult searchByTasksV2(com.netflix.conductor.grpc.SearchPb.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchByTasksV2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkflowServiceFutureStub extends io.grpc.stub.AbstractStub<WorkflowServiceFutureStub> {
    private WorkflowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkflowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WorkflowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkflowServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * POST /
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse> startWorkflow(
        com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /{name}/correlated/{correlationId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse> getWorkflows(
        com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /{workflowId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.proto.WorkflowPb.Workflow> getWorkflowStatus(
        com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWorkflowStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /{workflodId}/remove
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse> removeWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /running/{name}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse> getRunningWorkflows(
        com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRunningWorkflowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /decide/{workflowId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse> decideWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDecideWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse> pauseWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/pause
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse> resumeWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResumeWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PUT /{workflowId}/skiptask/{taskReferenceName}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse> skipTaskFromWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSkipTaskFromWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/rerun
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse> rerunWorkflow(
        com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRerunWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/restart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse> restartWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestartWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{workflowId}retry
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse> retryWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetryWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * POST /{workflowId}/resetcallbacks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse> resetWorkflowCallbacks(
        com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetWorkflowCallbacksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DELETE /{workflowId}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse> terminateWorkflow(
        com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateWorkflowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /search
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> search(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult> searchByTasks(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GET /searchV2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> searchV2(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult> searchByTasksV2(
        com.netflix.conductor.grpc.SearchPb.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByTasksV2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_WORKFLOW = 0;
  private static final int METHODID_GET_WORKFLOWS = 1;
  private static final int METHODID_GET_WORKFLOW_STATUS = 2;
  private static final int METHODID_REMOVE_WORKFLOW = 3;
  private static final int METHODID_GET_RUNNING_WORKFLOWS = 4;
  private static final int METHODID_DECIDE_WORKFLOW = 5;
  private static final int METHODID_PAUSE_WORKFLOW = 6;
  private static final int METHODID_RESUME_WORKFLOW = 7;
  private static final int METHODID_SKIP_TASK_FROM_WORKFLOW = 8;
  private static final int METHODID_RERUN_WORKFLOW = 9;
  private static final int METHODID_RESTART_WORKFLOW = 10;
  private static final int METHODID_RETRY_WORKFLOW = 11;
  private static final int METHODID_RESET_WORKFLOW_CALLBACKS = 12;
  private static final int METHODID_TERMINATE_WORKFLOW = 13;
  private static final int METHODID_SEARCH = 14;
  private static final int METHODID_SEARCH_BY_TASKS = 15;
  private static final int METHODID_SEARCH_V2 = 16;
  private static final int METHODID_SEARCH_BY_TASKS_V2 = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkflowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkflowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_WORKFLOW:
          serviceImpl.startWorkflow((com.netflix.conductor.proto.StartWorkflowRequestPb.StartWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.StartWorkflowResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOWS:
          serviceImpl.getWorkflows((com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowsResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW_STATUS:
          serviceImpl.getWorkflowStatus((com.netflix.conductor.grpc.WorkflowServicePb.GetWorkflowStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.proto.WorkflowPb.Workflow>) responseObserver);
          break;
        case METHODID_REMOVE_WORKFLOW:
          serviceImpl.removeWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RemoveWorkflowResponse>) responseObserver);
          break;
        case METHODID_GET_RUNNING_WORKFLOWS:
          serviceImpl.getRunningWorkflows((com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.GetRunningWorkflowsResponse>) responseObserver);
          break;
        case METHODID_DECIDE_WORKFLOW:
          serviceImpl.decideWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.DecideWorkflowResponse>) responseObserver);
          break;
        case METHODID_PAUSE_WORKFLOW:
          serviceImpl.pauseWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.PauseWorkflowResponse>) responseObserver);
          break;
        case METHODID_RESUME_WORKFLOW:
          serviceImpl.resumeWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResumeWorkflowResponse>) responseObserver);
          break;
        case METHODID_SKIP_TASK_FROM_WORKFLOW:
          serviceImpl.skipTaskFromWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.SkipTaskResponse>) responseObserver);
          break;
        case METHODID_RERUN_WORKFLOW:
          serviceImpl.rerunWorkflow((com.netflix.conductor.proto.RerunWorkflowRequestPb.RerunWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RerunWorkflowResponse>) responseObserver);
          break;
        case METHODID_RESTART_WORKFLOW:
          serviceImpl.restartWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RestartWorkflowResponse>) responseObserver);
          break;
        case METHODID_RETRY_WORKFLOW:
          serviceImpl.retryWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.RetryWorkflowResponse>) responseObserver);
          break;
        case METHODID_RESET_WORKFLOW_CALLBACKS:
          serviceImpl.resetWorkflowCallbacks((com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.ResetWorkflowCallbacksResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_WORKFLOW:
          serviceImpl.terminateWorkflow((com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowRequest) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.TerminateWorkflowResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_BY_TASKS:
          serviceImpl.searchByTasks((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSummarySearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_V2:
          serviceImpl.searchV2((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_BY_TASKS_V2:
          serviceImpl.searchByTasksV2((com.netflix.conductor.grpc.SearchPb.Request) request,
              (io.grpc.stub.StreamObserver<com.netflix.conductor.grpc.WorkflowServicePb.WorkflowSearchResult>) responseObserver);
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

  private static abstract class WorkflowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netflix.conductor.grpc.WorkflowServicePb.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowService");
    }
  }

  private static final class WorkflowServiceFileDescriptorSupplier
      extends WorkflowServiceBaseDescriptorSupplier {
    WorkflowServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowServiceMethodDescriptorSupplier
      extends WorkflowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowServiceFileDescriptorSupplier())
              .addMethod(getStartWorkflowMethod())
              .addMethod(getGetWorkflowsMethod())
              .addMethod(getGetWorkflowStatusMethod())
              .addMethod(getRemoveWorkflowMethod())
              .addMethod(getGetRunningWorkflowsMethod())
              .addMethod(getDecideWorkflowMethod())
              .addMethod(getPauseWorkflowMethod())
              .addMethod(getResumeWorkflowMethod())
              .addMethod(getSkipTaskFromWorkflowMethod())
              .addMethod(getRerunWorkflowMethod())
              .addMethod(getRestartWorkflowMethod())
              .addMethod(getRetryWorkflowMethod())
              .addMethod(getResetWorkflowCallbacksMethod())
              .addMethod(getTerminateWorkflowMethod())
              .addMethod(getSearchMethod())
              .addMethod(getSearchByTasksMethod())
              .addMethod(getSearchV2Method())
              .addMethod(getSearchByTasksV2Method())
              .build();
        }
      }
    }
    return result;
  }
}
