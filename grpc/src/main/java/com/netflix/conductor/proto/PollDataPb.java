// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/polldata.proto

package com.netflix.conductor.proto;

public final class PollDataPb {
  private PollDataPb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PollDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:conductor.proto.PollData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string queue_name = 1;</code>
     */
    String getQueueName();
    /**
     * <code>string queue_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getQueueNameBytes();

    /**
     * <code>string domain = 2;</code>
     */
    String getDomain();
    /**
     * <code>string domain = 2;</code>
     */
    com.google.protobuf.ByteString
        getDomainBytes();

    /**
     * <code>string worker_id = 3;</code>
     */
    String getWorkerId();
    /**
     * <code>string worker_id = 3;</code>
     */
    com.google.protobuf.ByteString
        getWorkerIdBytes();

    /**
     * <code>int64 last_poll_time = 4;</code>
     */
    long getLastPollTime();
  }
  /**
   * Protobuf type {@code conductor.proto.PollData}
   */
  public  static final class PollData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:conductor.proto.PollData)
      PollDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PollData.newBuilder() to construct.
    private PollData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PollData() {
      queueName_ = "";
      domain_ = "";
      workerId_ = "";
      lastPollTime_ = 0L;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PollData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              String s = input.readStringRequireUtf8();

              queueName_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              domain_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              workerId_ = s;
              break;
            }
            case 32: {

              lastPollTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_conductor_proto_PollData_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_conductor_proto_PollData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netflix.conductor.proto.PollDataPb.PollData.class, com.netflix.conductor.proto.PollDataPb.PollData.Builder.class);
    }

    public static final int QUEUE_NAME_FIELD_NUMBER = 1;
    private volatile Object queueName_;
    /**
     * <code>string queue_name = 1;</code>
     */
    public String getQueueName() {
      Object ref = queueName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        queueName_ = s;
        return s;
      }
    }
    /**
     * <code>string queue_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueueNameBytes() {
      Object ref = queueName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        queueName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOMAIN_FIELD_NUMBER = 2;
    private volatile Object domain_;
    /**
     * <code>string domain = 2;</code>
     */
    public String getDomain() {
      Object ref = domain_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        domain_ = s;
        return s;
      }
    }
    /**
     * <code>string domain = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      Object ref = domain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WORKER_ID_FIELD_NUMBER = 3;
    private volatile Object workerId_;
    /**
     * <code>string worker_id = 3;</code>
     */
    public String getWorkerId() {
      Object ref = workerId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        workerId_ = s;
        return s;
      }
    }
    /**
     * <code>string worker_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getWorkerIdBytes() {
      Object ref = workerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        workerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LAST_POLL_TIME_FIELD_NUMBER = 4;
    private long lastPollTime_;
    /**
     * <code>int64 last_poll_time = 4;</code>
     */
    public long getLastPollTime() {
      return lastPollTime_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getQueueNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queueName_);
      }
      if (!getDomainBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domain_);
      }
      if (!getWorkerIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, workerId_);
      }
      if (lastPollTime_ != 0L) {
        output.writeInt64(4, lastPollTime_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getQueueNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queueName_);
      }
      if (!getDomainBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, domain_);
      }
      if (!getWorkerIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, workerId_);
      }
      if (lastPollTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, lastPollTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.netflix.conductor.proto.PollDataPb.PollData)) {
        return super.equals(obj);
      }
      com.netflix.conductor.proto.PollDataPb.PollData other = (com.netflix.conductor.proto.PollDataPb.PollData) obj;

      boolean result = true;
      result = result && getQueueName()
          .equals(other.getQueueName());
      result = result && getDomain()
          .equals(other.getDomain());
      result = result && getWorkerId()
          .equals(other.getWorkerId());
      result = result && (getLastPollTime()
          == other.getLastPollTime());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + QUEUE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getQueueName().hashCode();
      hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getDomain().hashCode();
      hash = (37 * hash) + WORKER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerId().hashCode();
      hash = (37 * hash) + LAST_POLL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastPollTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.netflix.conductor.proto.PollDataPb.PollData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.netflix.conductor.proto.PollDataPb.PollData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code conductor.proto.PollData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:conductor.proto.PollData)
        com.netflix.conductor.proto.PollDataPb.PollDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_conductor_proto_PollData_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_conductor_proto_PollData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.netflix.conductor.proto.PollDataPb.PollData.class, com.netflix.conductor.proto.PollDataPb.PollData.Builder.class);
      }

      // Construct using com.netflix.conductor.proto.PollDataPb.PollData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        queueName_ = "";

        domain_ = "";

        workerId_ = "";

        lastPollTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_conductor_proto_PollData_descriptor;
      }

      public com.netflix.conductor.proto.PollDataPb.PollData getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      public com.netflix.conductor.proto.PollDataPb.PollData build() {
        com.netflix.conductor.proto.PollDataPb.PollData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.netflix.conductor.proto.PollDataPb.PollData buildPartial() {
        com.netflix.conductor.proto.PollDataPb.PollData result = new com.netflix.conductor.proto.PollDataPb.PollData(this);
        result.queueName_ = queueName_;
        result.domain_ = domain_;
        result.workerId_ = workerId_;
        result.lastPollTime_ = lastPollTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.netflix.conductor.proto.PollDataPb.PollData) {
          return mergeFrom((com.netflix.conductor.proto.PollDataPb.PollData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.netflix.conductor.proto.PollDataPb.PollData other) {
        if (other == getDefaultInstance()) return this;
        if (!other.getQueueName().isEmpty()) {
          queueName_ = other.queueName_;
          onChanged();
        }
        if (!other.getDomain().isEmpty()) {
          domain_ = other.domain_;
          onChanged();
        }
        if (!other.getWorkerId().isEmpty()) {
          workerId_ = other.workerId_;
          onChanged();
        }
        if (other.getLastPollTime() != 0L) {
          setLastPollTime(other.getLastPollTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.netflix.conductor.proto.PollDataPb.PollData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.netflix.conductor.proto.PollDataPb.PollData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object queueName_ = "";
      /**
       * <code>string queue_name = 1;</code>
       */
      public String getQueueName() {
        Object ref = queueName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          queueName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string queue_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQueueNameBytes() {
        Object ref = queueName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          queueName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string queue_name = 1;</code>
       */
      public Builder setQueueName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        queueName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string queue_name = 1;</code>
       */
      public Builder clearQueueName() {
        
        queueName_ = getDefaultInstance().getQueueName();
        onChanged();
        return this;
      }
      /**
       * <code>string queue_name = 1;</code>
       */
      public Builder setQueueNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        queueName_ = value;
        onChanged();
        return this;
      }

      private Object domain_ = "";
      /**
       * <code>string domain = 2;</code>
       */
      public String getDomain() {
        Object ref = domain_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          domain_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string domain = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDomainBytes() {
        Object ref = domain_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          domain_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string domain = 2;</code>
       */
      public Builder setDomain(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        domain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string domain = 2;</code>
       */
      public Builder clearDomain() {
        
        domain_ = getDefaultInstance().getDomain();
        onChanged();
        return this;
      }
      /**
       * <code>string domain = 2;</code>
       */
      public Builder setDomainBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        domain_ = value;
        onChanged();
        return this;
      }

      private Object workerId_ = "";
      /**
       * <code>string worker_id = 3;</code>
       */
      public String getWorkerId() {
        Object ref = workerId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          workerId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string worker_id = 3;</code>
       */
      public com.google.protobuf.ByteString
          getWorkerIdBytes() {
        Object ref = workerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          workerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string worker_id = 3;</code>
       */
      public Builder setWorkerId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        workerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string worker_id = 3;</code>
       */
      public Builder clearWorkerId() {
        
        workerId_ = getDefaultInstance().getWorkerId();
        onChanged();
        return this;
      }
      /**
       * <code>string worker_id = 3;</code>
       */
      public Builder setWorkerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        workerId_ = value;
        onChanged();
        return this;
      }

      private long lastPollTime_ ;
      /**
       * <code>int64 last_poll_time = 4;</code>
       */
      public long getLastPollTime() {
        return lastPollTime_;
      }
      /**
       * <code>int64 last_poll_time = 4;</code>
       */
      public Builder setLastPollTime(long value) {
        
        lastPollTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 last_poll_time = 4;</code>
       */
      public Builder clearLastPollTime() {
        
        lastPollTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:conductor.proto.PollData)
    }

    // @@protoc_insertion_point(class_scope:conductor.proto.PollData)
    private static final com.netflix.conductor.proto.PollDataPb.PollData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.netflix.conductor.proto.PollDataPb.PollData();
    }

    public static com.netflix.conductor.proto.PollDataPb.PollData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PollData>
        PARSER = new com.google.protobuf.AbstractParser<PollData>() {
      public PollData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PollData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PollData> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<PollData> getParserForType() {
      return PARSER;
    }

    public com.netflix.conductor.proto.PollDataPb.PollData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_conductor_proto_PollData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_conductor_proto_PollData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024model/polldata.proto\022\017conductor.proto\"" +
      "Y\n\010PollData\022\022\n\nqueue_name\030\001 \001(\t\022\016\n\006domai" +
      "n\030\002 \001(\t\022\021\n\tworker_id\030\003 \001(\t\022\026\n\016last_poll_" +
      "time\030\004 \001(\003Be\n\033com.netflix.conductor.prot" +
      "oB\nPollDataPbZ:github.com/netflix/conduc" +
      "tor/client/gogrpc/conductor/modelb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_conductor_proto_PollData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_conductor_proto_PollData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_conductor_proto_PollData_descriptor,
        new String[] { "QueueName", "Domain", "WorkerId", "LastPollTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
