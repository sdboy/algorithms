package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ExtendThread
 * @date 2019/5/28 5:46
 * @Copyright
 */
public class ExtendThread {
  public static void main(String args[]) {
    new ChildThread();
    try{
      for (int i = 5; i > 0; i--){
        System.out.println("Main thread: " + i);
        Thread.sleep(1000);
      }
    }catch (InterruptedException e) {
      System.out.println("main interrupted.");
    }
    System.out.println("main thread exiting.");
  }
}

class ChildThread extends Thread {
  ChildThread() {
    super("Demo thread");
    System.out.println("child thread: " + this);
    start();
  }

  @Override
  public void run() {
    try{
      for (int i = 5; i > 0; i--){
        System.out.println("Child thread: " + i);
        Thread.sleep(500);
      }
    }catch (InterruptedException e) {
      System.out.println("child interrupted.");
    }
    System.out.println("child thread exiting.");
  }
}
