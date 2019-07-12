package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BoundsDemo
 * @date 2019/7/12 17:35
 * @Copyright
 */
public class BoundsDemo {
  public static void main(String[] args) {
    Integer[] inums = { 1, 2, 3, 4, 5};
    Stats<Integer> iob = new Stats<>(inums);
    double v = iob.average();
    System.out.println("iob average is " + v);

    Double[] dnums = { 2.23, 5.2345, 234.234, 343.23, 234.123};
    Stats<Double> dob = new Stats<>(dnums);
    v = dob.average();
    System.out.println("dob average is " + v);
  }
}

class Stats <T extends Number> {
  T[] nums;

  Stats(T[] o) {
    nums = o;
  }

  double average() {
    double sum = 0.0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i].doubleValue();
    }
    return sum / nums.length;
  }

  boolean sameAvg(Stats<?> ob) {
    if(average() == ob.average()) {
      return true;
    }
    return false;
  }
}
