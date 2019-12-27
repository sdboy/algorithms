package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class HierDemo3
 * @date 2019/8/19 10:56
 * @Copyright
 */
public class HierDemo3 {
  public static void main(String[] args) {
    Gen<Integer> iOb = new Gen<>(88);
    Gen4<Integer> iOb2 = new Gen4<>(99);
    Gen4<String> strOb2 = new Gen4<>("generics test");
    if(iOb2 instanceof Gen4<?>) {
      System.out.println("iOb2 is instance of Gen4");
    }

    if(iOb2 instanceof Gen<?>) {
      System.out.println("iOb2 is instance of Gen");
    }

    System.out.println();
    if(strOb2 instanceof Gen4<?>) {
      System.out.println("strOb2 is instance Gen4");
    }

    if(strOb2 instanceof Gen<?>) {
      System.out.println("strOb2 is instance Gen");
    }
    System.out.println();

    if(iOb instanceof Gen4<?>) {
      System.out.println("iOb is instance of Gen4");
    }
    if(iOb instanceof Gen<?>) {
      System.out.println("iOb is instance of Gen");
    }
  }
}

class Gen4<T> extends Gen<T> {
  Gen4(T o) {
    super(o);
  }
}
