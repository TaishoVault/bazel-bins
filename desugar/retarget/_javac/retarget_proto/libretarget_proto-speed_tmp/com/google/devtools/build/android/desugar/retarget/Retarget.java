// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/tools/android/java/com/google/devtools/build/android/desugar/retarget/retarget.proto

package com.google.devtools.build.android.desugar.retarget;

public final class Retarget {
  private Retarget() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_android_desugar_MethodInvocations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_android_desugar_MethodInvocations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_android_desugar_MethodInvocationReplacement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_android_desugar_MethodInvocationReplacement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nXsrc/tools/android/java/com/google/devt" +
      "ools/build/android/desugar/retarget/reta" +
      "rget.proto\022\017android.desugar\032dsrc/tools/a" +
      "ndroid/java/com/google/devtools/build/an" +
      "droid/desugar/langmodel/desugar_method_a" +
      "ttr.proto\"W\n\021MethodInvocations\022B\n\014replac" +
      "ements\030\001 \003(\0132,.android.desugar.MethodInv" +
      "ocationReplacement\"\337\001\n\033MethodInvocationR" +
      "eplacement\0221\n\006source\030\001 \001(\0132!.android.des" +
      "ugar.MethodInvocation\0226\n\013destination\030\002 \001" +
      "(\0132!.android.desugar.MethodInvocation\0220\n" +
      "\005range\030\003 \003(\0162!.android.desugar.Replaceme" +
      "ntRange\022#\n\033auto_deduce_opcode_and_desc\030\004" +
      " \001(\010*\235\001\n\020ReplacementRange\022\007\n\003ALL\020\000\022\"\n\036RE" +
      "PLACE_CALLS_TO_LONG_UNSIGNED\020\001\022\'\n#REPLAC" +
      "E_CALLS_TO_PRIMITIVE_WRAPPERS\020\002\022\026\n\022DESUG" +
      "AR_JAVA8_LIBS\020\003\022\033\n\027DESUGAR_JAVA8_CORE_LI" +
      "BS\020\004B6\n2com.google.devtools.build.androi" +
      "d.desugar.retargetP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.devtools.build.android.desugar.langmodel.DesugarMethodAttr.getDescriptor(),
        });
    internal_static_android_desugar_MethodInvocations_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_android_desugar_MethodInvocations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_android_desugar_MethodInvocations_descriptor,
        new java.lang.String[] { "Replacements", });
    internal_static_android_desugar_MethodInvocationReplacement_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_android_desugar_MethodInvocationReplacement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_android_desugar_MethodInvocationReplacement_descriptor,
        new java.lang.String[] { "Source", "Destination", "Range", "AutoDeduceOpcodeAndDesc", });
    com.google.devtools.build.android.desugar.langmodel.DesugarMethodAttr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
