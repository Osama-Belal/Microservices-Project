// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trendingMovies.proto

package proto;

public final class TrendingMoviesProto {
  private TrendingMoviesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_getMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_getMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_topTenTrendingMovies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_topTenTrendingMovies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Movie_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024trendingMovies.proto\"\021\n\017getMovieReques" +
      "t\".\n\024topTenTrendingMovies\022\026\n\006movies\030\001 \003(" +
      "\0132\006.Movie\"\031\n\005Movie\022\020\n\010movie_id\030\001 \001(\t2[\n\025" +
      "TrendingMoviesService\022B\n\027getTopTenTrendi" +
      "ngMovies\022\020.getMovieRequest\032\025.topTenTrend" +
      "ingMoviesB\036\n\005protoB\023TrendingMoviesProtoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_getMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_getMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_getMovieRequest_descriptor,
        new java.lang.String[] { });
    internal_static_topTenTrendingMovies_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_topTenTrendingMovies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_topTenTrendingMovies_descriptor,
        new java.lang.String[] { "Movies", });
    internal_static_Movie_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Movie_descriptor,
        new java.lang.String[] { "MovieId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}