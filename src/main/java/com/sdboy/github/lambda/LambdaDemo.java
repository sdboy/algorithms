package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class LambdaDemo
 * @date 2019/6/24 17:30
 * @Copyright
 */
public class LambdaDemo {
  public static void main(String[] args) {
    MyNumber number;
    number = () -> 2.45;
    System.out.println(number.getValue());
    number = () -> Math.random() * 100;
    System.out.println(number.getValue());
//    number = () -> "23434.2343";
  }
}
