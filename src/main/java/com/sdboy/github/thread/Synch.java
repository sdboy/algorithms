package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class Synch
 * @date 2019/5/28 6:39
 * @Copyright
 */
public class Synch {
  public static void main(String[] args) {
    CallMe c1 = new CallMe();
    Caller caller1 = new Caller(c1, "one");
    Caller caller2 = new Caller(c1, "two");
    Caller caller3 = new Caller(c1, "three");
    try{
      caller1.t.join();
      caller2.t.join();
      caller3.t.join();
    }catch (InterruptedException e) {
      System.out.println("interrupted");
    }
  }
}

class CallMe {
  synchronized void call(String msg) {
    System.out.print("[" + msg);
    try{
      Thread.sleep(1000);
    }catch (InterruptedException e) {
      System.out.println("interrupted");
    }
    System.out.println("]");
  }
}

class Caller implements Runnable {
  String msg;
  CallMe target;
  Thread t;
  public Caller(CallMe targ, String s) {
    target = targ;
    msg = s;
    t = new Thread(this);
    t.start();
    System.out.println("ssss");
  }
  public void run() {
    target.call(msg);
//    synchronized (target) {
//      target.call(msg);
//    }
  }
}
