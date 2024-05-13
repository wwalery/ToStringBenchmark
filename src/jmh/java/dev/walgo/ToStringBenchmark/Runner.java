package dev.walgo.ToStringBenchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class Runner {

  @Benchmark
  public void toString_Simple() {
    Data data = new Data();
    data.toString_Simple();
  }

  
  @Benchmark
  public void toString_Objects() {
    Data data = new Data();
    data.toString_Objects();
  }


  @Benchmark
  public void toString_StringBuilder() {
    Data data = new Data();
    data.toString_StringBuilder();
  }


  @Benchmark
  public void toString_Guava() {
    Data data = new Data();
    data.toString_Guava();
  }

  @Benchmark
  public void toString_Apache() {
    Data data = new Data();
    data.toString_Apache();
  }
  
  @Benchmark
  public void toString_ApacheReflection() {
    Data data = new Data();
    data.toString_ApacheReflection();
  }
  
  @Benchmark
  public void toString_ApacheReflectionBuilder() {
    Data data = new Data();
    data.toString_ApacheReflectionBuilder();
  }

  
//    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
//    }
}
