package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class LambdaDemo3
 * @date 2019/6/25 13:18
 * @Copyright
 */
public class LambdaDemo3 {
  public static void main(String[] args) {
    NumericTest2 isFactor = (n, d) -> (n % d) == 0;
    if(isFactor.test(9, 3)) {
      System.out.println("3 is factor of 9");
    }
    if(!isFactor.test(10, 3)) {
      System.out.println("3 is not factor of 10");
    }
  }
}
