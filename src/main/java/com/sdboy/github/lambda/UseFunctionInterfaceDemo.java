package com.sdboy.github.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class UseFunctionInterfaceDemo
 * @date 2019/6/28 17:51
 * @Copyright
 */
public class UseFunctionInterfaceDemo {
  public static void main(String[] args) {
    Function<Integer, Integer> factorial = (n) -> {
      int result = n;
      return result + 1;
    };
    int b = factorial.apply(5);
    System.out.println(b);

    UnaryOperator<Integer> unaryOperator = (n) -> {
      int result = n;
      return result + 2;
    };
    System.out.println(unaryOperator.apply(2));

  }
}
