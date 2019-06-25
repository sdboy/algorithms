package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BlockLambdaDemo2
 * @date 2019/6/25 14:13
 * @Copyright
 */
public class BlockLambdaDemo2 {
  public static void main(String[] args) {
    NumericFun2 reverse = (str) -> {
      String result = "";
      int i;
      for(i = str.length() -1; i >= 0; i--) {
        result += str.charAt(i);
      }
      return result;
    };
    System.out.println(reverse.func("23456"));
    System.out.println(reverse.func("wer"));
  }
}
