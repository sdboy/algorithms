package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class MultiThreadDemo
 * @date 2019/5/28 6:00
 * @Copyright
 */
public class MultiThreadDemo {
  public static void main(String[] args) {
    LoopThread one = new LoopThread("one");
    LoopThread two = new LoopThread("two");
    LoopThread three = new LoopThread("three");
    System.out.println("one thread is alive: " + one.t.isAlive());
    System.out.println("two thread is alive: " + two.t.isAlive());
    System.out.println("three thread is alive: " + three.t.isAlive());
    try{
      one.t.join();
      two.t.join();
      three.t.join();
    }catch (InterruptedException e) {
      System.out.println("main interrupted");
    }
    System.out.println("one thread is alive: " + one.t.isAlive());
    System.out.println("two thread is alive: " + two.t.isAlive());
    System.out.println("three thread is alive: " + three.t.isAlive());
    System.out.println("main thread exit");
  }
}

class LoopThread implements Runnable {
  private String name;
  Thread t;
  LoopThread(String threadName) {
    name = threadName;
    t = new Thread(this, name);
    System.out.println("new thread: " + t);
    t.start();
  }
  public void run() {
    try{
      for (int i = 5; i > 0; i--){
        System.out.println(name + " thread: " + i);
        Thread.sleep(1000);
      }
    }catch (InterruptedException e) {
      System.out.println(name + " interrupted.");
    }
    System.out.println(name + " thread exiting.");
  }
}