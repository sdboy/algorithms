package com.sdboy.github.thread;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class PC
 * @date 2019/5/28 7:13
 * @Copyright
 */
public class PC {
  public static void main(String[] args) {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);
    System.out.println("Press Ctrl + C to stop");
  }
}

class Q {
  int n;
  boolean valueSet = false;
  synchronized int get() {
    while (!valueSet) {
      try{
        wait();
      } catch (InterruptedException e) {
        System.out.println("InterruptedException caught");
      }
    }
    System.out.println("Got: " + n);
    valueSet = false;
    notify();
    return n;
  }

  synchronized void put(int n) {
    while (valueSet) {
      try{
        wait();
      }catch (InterruptedException e) {
        System.out.println("InterruptedException caught");
      }
    }
    this.n = n;
    System.out.println("Put: " + n);
    valueSet = true;
    notify();
  }
}

class Producer implements Runnable {
  Q q;
  Producer(Q q) {
    this.q = q;
    new Thread(this, "Producer").start();
  }
  public void run() {
    int i = 0;
    while (true) {
      q.put(i++);
    }
  }
}

class Consumer implements Runnable {
  Q q;
  Consumer(Q q) {
    this.q = q;
    new Thread(this, "Consumer").start();
  }
  public void run() {
    while (true) {
      q.get();
    }
  }
}
