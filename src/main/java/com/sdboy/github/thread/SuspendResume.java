package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class SuspendResume
 * @date 2019/5/28 8:51
 * @Copyright
 */
public class SuspendResume {
  public static void main(String[] args) {
    TaskThread taskThread1 = new TaskThread("one");
    TaskThread taskThread2 = new TaskThread("two");
    try {
      Thread.sleep(1000);
      taskThread1.mysuspend();;
      System.out.println("suspending thread one");
      Thread.sleep(1000);
      taskThread1.myresume();
      System.out.println("resuming thread one");
      taskThread2.mysuspend();;
      System.out.println("suspending thread two");
      Thread.sleep(1000);
      taskThread2.myresume();
      System.out.println("resuming thread two");
    } catch (InterruptedException e) {
      System.out.println("main thread interrupted");
    }

    try {
      System.out.println("waiting for threads to finish");
      taskThread1.t.join();
      taskThread2.t.join();
    } catch (InterruptedException e) {
      System.out.println("main thread interrupted");
    }
    System.out.println("main thread exiting");
  }
}

class TaskThread implements Runnable {
  String name;
  Thread t;
  boolean suspendFlag;

  TaskThread(String threadName) {
    name = threadName;
    t = new Thread(this, threadName);
    System.out.println("new thread: " + t);
    suspendFlag = false;
    t.start();
  }

  public void run() {
    try {
      for (int i = 15; i > 0; i--) {
        System.out.println(name + ":" + i);
        Thread.sleep(200);
        synchronized (this) {
          while (suspendFlag) {
            wait();
          }
        }
      }
    } catch (InterruptedException e) {
      System.out.println(name + " interrupted");
    }
    System.out.println(name + " exiting");
  }

  synchronized void mysuspend() {
    suspendFlag = true;
  }

  synchronized  void myresume() {
    suspendFlag = false;
    notify();
  }
}
