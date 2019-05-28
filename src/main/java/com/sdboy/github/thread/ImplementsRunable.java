package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ThreadDemo
 * @date 2019/5/28 5:26
 * @Copyright
 */
public class ImplementsRunable {
  public static void main(String args[]){
    new NewThread();

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

class NewThread  implements Runnable {
  Thread t;

  NewThread() {
    t = new Thread(this, "Demo thread");
    System.out.println("Child thread: " + t);
    t.start();
  }

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
