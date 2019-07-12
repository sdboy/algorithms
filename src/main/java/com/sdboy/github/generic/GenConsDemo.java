package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenConsDemo
 * @date 2019/7/12 22:33
 * @Copyright
 */
public class GenConsDemo {
  public static void main(String[] args) {
    GenCons test = new GenCons(100);
    GenCons test2 = new GenCons(123.5F);
    test.showval();
    test2.showval();
  }
}

class GenCons {
  private double val;

  <T extends Number> GenCons(T arg) {
    val = arg.doubleValue();
  }

  void showval() {
    System.out.println("val: " + val);
  }
}
