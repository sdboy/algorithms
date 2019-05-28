package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class CurrentThreadDemo
 * @date 2019/5/27 9:01
 * @Copyright
 */
public class CurrentThreadDemo {
  public static void main(String [] args) {
    Thread t = Thread.currentThread();
    System.out.println("Current Thread: " + t);
    t.setName("My Thread");
    System.out.println("After name change: " + t);
    try{
      for(int n = 5; n > 0; n--) {
        System.out.println(n);
        Thread.sleep(1000);
      }
    }catch (InterruptedException e) {
      System.out.println("main thread interrupted");
    }
  }
}
