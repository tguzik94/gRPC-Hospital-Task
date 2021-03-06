// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hospital.proto

package gen.grpc.hospital.examinations;

public interface ExaminationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Examination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string patient_id = 2;</code>
   */
  java.lang.String getPatientId();
  /**
   * <code>optional string patient_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getPatientIdBytes();

  /**
   * <code>optional .DateTime date_time = 3;</code>
   */
  boolean hasDateTime();
  /**
   * <code>optional .DateTime date_time = 3;</code>
   */
  gen.grpc.hospital.examinations.DateTime getDateTime();
  /**
   * <code>optional .DateTime date_time = 3;</code>
   */
  gen.grpc.hospital.examinations.DateTimeOrBuilder getDateTimeOrBuilder();

  /**
   * <code>optional int32 doctor_id = 4;</code>
   */
  int getDoctorId();

  /**
   * <code>repeated .Parameter parameter = 5;</code>
   */
  java.util.List<gen.grpc.hospital.examinations.Parameter> 
      getParameterList();
  /**
   * <code>repeated .Parameter parameter = 5;</code>
   */
  gen.grpc.hospital.examinations.Parameter getParameter(int index);
  /**
   * <code>repeated .Parameter parameter = 5;</code>
   */
  int getParameterCount();
  /**
   * <code>repeated .Parameter parameter = 5;</code>
   */
  java.util.List<? extends gen.grpc.hospital.examinations.ParameterOrBuilder> 
      getParameterOrBuilderList();
  /**
   * <code>repeated .Parameter parameter = 5;</code>
   */
  gen.grpc.hospital.examinations.ParameterOrBuilder getParameterOrBuilder(
      int index);
}
