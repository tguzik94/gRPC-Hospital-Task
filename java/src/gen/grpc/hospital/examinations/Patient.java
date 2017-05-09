// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hospital.proto

package gen.grpc.hospital.examinations;

/**
 * Protobuf type {@code Patient}
 */
public  final class Patient extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Patient)
    PatientOrBuilder {
  // Use Patient.newBuilder() to construct.
  private Patient(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Patient() {
    id_ = "";
    firstName_ = "";
    lastName_ = "";
    sex_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Patient(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            sex_ = rawValue;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gen.grpc.hospital.examinations.HospitalExaminationsProtos.internal_static_Patient_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gen.grpc.hospital.examinations.HospitalExaminationsProtos.internal_static_Patient_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gen.grpc.hospital.examinations.Patient.class, gen.grpc.hospital.examinations.Patient.Builder.class);
  }

  /**
   * Protobuf enum {@code Patient.Sex}
   */
  public enum Sex
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MALE = 0;</code>
     */
    MALE(0),
    /**
     * <code>FEMALE = 1;</code>
     */
    FEMALE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MALE = 0;</code>
     */
    public static final int MALE_VALUE = 0;
    /**
     * <code>FEMALE = 1;</code>
     */
    public static final int FEMALE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Sex valueOf(int value) {
      return forNumber(value);
    }

    public static Sex forNumber(int value) {
      switch (value) {
        case 0: return MALE;
        case 1: return FEMALE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Sex>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Sex> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Sex>() {
            public Sex findValueByNumber(int number) {
              return Sex.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return gen.grpc.hospital.examinations.Patient.getDescriptor().getEnumTypes().get(0);
    }

    private static final Sex[] VALUES = values();

    public static Sex valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Sex(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Patient.Sex)
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * PESEL
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * PESEL
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object firstName_;
  /**
   * <code>optional string first_name = 2;</code>
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string first_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object lastName_;
  /**
   * <code>optional string last_name = 3;</code>
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string last_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEX_FIELD_NUMBER = 4;
  private int sex_;
  /**
   * <code>optional .Patient.Sex sex = 4;</code>
   */
  public int getSexValue() {
    return sex_;
  }
  /**
   * <code>optional .Patient.Sex sex = 4;</code>
   */
  public gen.grpc.hospital.examinations.Patient.Sex getSex() {
    gen.grpc.hospital.examinations.Patient.Sex result = gen.grpc.hospital.examinations.Patient.Sex.valueOf(sex_);
    return result == null ? gen.grpc.hospital.examinations.Patient.Sex.UNRECOGNIZED : result;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
    }
    if (sex_ != gen.grpc.hospital.examinations.Patient.Sex.MALE.getNumber()) {
      output.writeEnum(4, sex_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
    }
    if (sex_ != gen.grpc.hospital.examinations.Patient.Sex.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, sex_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof gen.grpc.hospital.examinations.Patient)) {
      return super.equals(obj);
    }
    gen.grpc.hospital.examinations.Patient other = (gen.grpc.hospital.examinations.Patient) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getFirstName()
        .equals(other.getFirstName());
    result = result && getLastName()
        .equals(other.getLastName());
    result = result && sex_ == other.sex_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + sex_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gen.grpc.hospital.examinations.Patient parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.hospital.examinations.Patient parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gen.grpc.hospital.examinations.Patient parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gen.grpc.hospital.examinations.Patient parseFrom(
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
  public static Builder newBuilder(gen.grpc.hospital.examinations.Patient prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Patient}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Patient)
      gen.grpc.hospital.examinations.PatientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gen.grpc.hospital.examinations.HospitalExaminationsProtos.internal_static_Patient_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gen.grpc.hospital.examinations.HospitalExaminationsProtos.internal_static_Patient_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gen.grpc.hospital.examinations.Patient.class, gen.grpc.hospital.examinations.Patient.Builder.class);
    }

    // Construct using gen.grpc.hospital.examinations.Patient.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
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
      id_ = "";

      firstName_ = "";

      lastName_ = "";

      sex_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gen.grpc.hospital.examinations.HospitalExaminationsProtos.internal_static_Patient_descriptor;
    }

    public gen.grpc.hospital.examinations.Patient getDefaultInstanceForType() {
      return gen.grpc.hospital.examinations.Patient.getDefaultInstance();
    }

    public gen.grpc.hospital.examinations.Patient build() {
      gen.grpc.hospital.examinations.Patient result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public gen.grpc.hospital.examinations.Patient buildPartial() {
      gen.grpc.hospital.examinations.Patient result = new gen.grpc.hospital.examinations.Patient(this);
      result.id_ = id_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      result.sex_ = sex_;
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
      if (other instanceof gen.grpc.hospital.examinations.Patient) {
        return mergeFrom((gen.grpc.hospital.examinations.Patient)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gen.grpc.hospital.examinations.Patient other) {
      if (other == gen.grpc.hospital.examinations.Patient.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        onChanged();
      }
      if (other.sex_ != 0) {
        setSexValue(other.getSexValue());
      }
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
      gen.grpc.hospital.examinations.Patient parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gen.grpc.hospital.examinations.Patient) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * PESEL
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * PESEL
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * PESEL
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PESEL
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * PESEL
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firstName_ = "";
    /**
     * <code>optional string first_name = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string first_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string first_name = 2;</code>
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string first_name = 2;</code>
     */
    public Builder clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string first_name = 2;</code>
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>optional string last_name = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string last_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string last_name = 3;</code>
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string last_name = 3;</code>
     */
    public Builder clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string last_name = 3;</code>
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value;
      onChanged();
      return this;
    }

    private int sex_ = 0;
    /**
     * <code>optional .Patient.Sex sex = 4;</code>
     */
    public int getSexValue() {
      return sex_;
    }
    /**
     * <code>optional .Patient.Sex sex = 4;</code>
     */
    public Builder setSexValue(int value) {
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Patient.Sex sex = 4;</code>
     */
    public gen.grpc.hospital.examinations.Patient.Sex getSex() {
      gen.grpc.hospital.examinations.Patient.Sex result = gen.grpc.hospital.examinations.Patient.Sex.valueOf(sex_);
      return result == null ? gen.grpc.hospital.examinations.Patient.Sex.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .Patient.Sex sex = 4;</code>
     */
    public Builder setSex(gen.grpc.hospital.examinations.Patient.Sex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sex_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Patient.Sex sex = 4;</code>
     */
    public Builder clearSex() {
      
      sex_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Patient)
  }

  // @@protoc_insertion_point(class_scope:Patient)
  private static final gen.grpc.hospital.examinations.Patient DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gen.grpc.hospital.examinations.Patient();
  }

  public static gen.grpc.hospital.examinations.Patient getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Patient>
      PARSER = new com.google.protobuf.AbstractParser<Patient>() {
    public Patient parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Patient(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Patient> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Patient> getParserForType() {
    return PARSER;
  }

  public gen.grpc.hospital.examinations.Patient getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

