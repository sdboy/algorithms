package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class RawDemo
 * @date 2019/8/19 10:04
 * @Copyright
 */
public class RawDemo {
  public static void main(String[] args) {
    Gen<Integer> iob = new Gen<>(88);
    Gen<String> sob = new Gen<>("generic test");
    Gen raw = new Gen(new Double(98.6));
    double d= (Double) raw.getOb();
    System.out.println("value:  " + d);
//    int i = (Integer) raw.getOb();
    sob = raw;
//    String str = sob.getOb();
    raw = iob;
//    d = (Double) raw.getOb();
  }
}
