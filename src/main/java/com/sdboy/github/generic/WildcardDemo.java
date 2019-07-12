package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class WildcardDemo
 * @date 2019/7/12 17:50
 * @Copyright
 */
public class WildcardDemo {
  public static void main(String[] args) {
    Integer[] inums = { 1, 2, 3, 4, 5};
    Stats<Integer> iob = new Stats<>(inums);
    double v = iob.average();
    System.out.println("iob average is " + v);

    Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5};
    Stats<Double> dob = new Stats<>(dnums);
    v = dob.average();
    System.out.println("dob average is " + v);

    System.out.print("averages of iob and dob ");
    if(iob.sameAvg(dob)) {
      System.out.println("are the same.");
    } else {
      System.out.println("differ.");
    }
  }
}
