package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class SimpGen
 * @date 2019/7/12 17:21
 * @Copyright
 */
public class SimpGen {
  public static void main(String[] args) {
    TwoGen<Integer, String> tgObj = new TwoGen<>(88, "generics");
    tgObj.showType();
    int v = tgObj.getObj1();
    System.out.println("value: " + v);
    String str = tgObj.getObj2();
    System.out.println("value: " + str);

  }
}

class TwoGen<T, V> {
  T obj1;
  V obj2;

  TwoGen (T obj1, V obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
  }

  void showType() {
    System.out.println("type of T is " + obj1.getClass().getName());
    System.out.println("type of V is " + obj2.getClass().getName());
  }

  T getObj1() {
    return obj1;
  }

  V getObj2() {
    return obj2;
  }

}
