package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class LambdaDemo2
 * @date 2019/6/25 13:07
 * @Copyright
 */
public class LambdaDemo2 {
  public static void main(String[] args) {
    NumericTest isEven = (n) -> (n % 2) == 0;
    if(isEven.test(10)) {
      System.out.println("10 is even");
    }
    if(!isEven.test(9)) {
      System.out.println("9 is not even");
    }
    NumericTest isNonNeg = (n) -> n >= 0;
    if(isNonNeg.test(29)) {
      System.out.println("29 >= 0");
    }
    if(!isNonNeg.test(-2)) {
      System.out.println("-2 < 0");
    }

  }
}
