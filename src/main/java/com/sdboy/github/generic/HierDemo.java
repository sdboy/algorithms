package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class HierDemo
 * @date 2019/8/19 10:31
 * @Copyright
 */
public class HierDemo {
  public static void main(String[] args) {
    Gen2<String , Integer> x = new Gen2<>("value is: ", 99);
    System.out.print(x.getOb());
    System.out.println(x.getOb2());
  }
}

class Gen2<T, V> extends Gen<T> {
  V o2;
  Gen2(T o, V o2) {
    super(o);
    this.o2 = o2;
  }

  V getOb2() {
    return o2;
  }
}
