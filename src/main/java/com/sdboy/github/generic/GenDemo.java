package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenDemo
 * @date 2019/6/29 9:01
 * @Copyright
 */
public class GenDemo {
  public static void main(String[] args) {
    Gen<Integer> iOb;
    iOb = new Gen<>(88);
    iOb.showType();
    int v = iOb.getOb();
    System.out.println("value: " + v);
    System.out.println();
    Gen<String> strOb = new Gen<>("generics test");
    strOb.showType();
    String str = strOb.getOb();
    System.out.println("value: " + str)  ;
  }
}

class Gen<T> {
  T ob;
  Gen(T o) {
    ob = o;
  }

  T getOb() {
    return ob;
  }

  void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}
