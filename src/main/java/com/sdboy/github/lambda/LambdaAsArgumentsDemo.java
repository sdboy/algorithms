package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class LambdaAsArgumentsDemo
 * @date 2019/6/27 15:57
 * @Copyright
 */
public class LambdaAsArgumentsDemo {

  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String[] args) {
    String inStr = "lambdas add power to Java";
    String outStr;
    System.out.println("here is input string: " + inStr);
    outStr = stringOp((str) -> str.toUpperCase(), inStr);
    System.out.println("the string iin uppercase: " + outStr);

    outStr = stringOp((str) -> {
      String result = "";
      int i;
      for(i = 0; i < str.length(); i++) {
        if(str.charAt(i) != ' ') {
          result += str.charAt(i);
        }
      }
      return result;
    }, inStr);
    System.out.println("the string with spaces removed: " + outStr);

    StringFunc reverse = (str) -> {
      String result = "";
      int i;
      for(i = str.length() - 1; i >= 0; i--) {
        result += str.charAt(i);
      }
      return result;
    };
    System.out.println("the string reversed: " + stringOp(reverse, inStr));
  }
}
