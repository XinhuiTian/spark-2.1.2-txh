package org.apache.spark.graphv.enhanced;
public  class Pregel {
  static public <VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> org.apache.spark.graphv.enhanced.Graph<VD, ED> apply (org.apache.spark.graphv.enhanced.Graph<VD, ED> graph, A initialMsg, int maxIterations, org.apache.spark.graphv.EdgeDirection activeDirection, boolean needActive, boolean edgeFilter, scala.Function2<java.lang.Object, VD, VD> initialFunc, scala.Function3<java.lang.Object, VD, A, VD> vFunc, scala.Function1<org.apache.spark.graphv.enhanced.GraphVEdgeTriplet<VD, ED>, scala.collection.Iterator<scala.Tuple2<java.lang.Object, A>>> sendMsg, scala.Function2<A, A, A> mergeMsg, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2, scala.reflect.ClassTag<A> evidence$3)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}