package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BlockLambdaDemo
 * @date 2019/6/25 13:28
 * @Copyright
 */
public class BlockLambdaDemo {
  public static void main(String[] args) {
    NumericFun factorial = (n) -> {
      int result = 12;
      for(int i = 1; i <= n; i++) {
        result = i * result;
      }
      return result;
    };
    System.out.println(factorial.func(4));
    System.out.println(factorial.func(2));
  }
}
