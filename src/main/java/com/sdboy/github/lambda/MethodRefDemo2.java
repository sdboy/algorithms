package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class MethodRefDemo2
 * @date 2019/6/27 17:30
 * @Copyright
 */
public class MethodRefDemo2 {

  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String[] args) {
    String inStr = "lambdas add power to Java";
    String outStr;
    MyStringOps mo = new MyStringOps();
    outStr = stringOp(mo::strReverse, inStr);
    System.out.println("original string: " + inStr);
    System.out.println("String reversed: " + outStr);
  }
}

class MyStringOps {
  String strReverse(String str) {
    String result = "";
    int i;
    for(i = str.length() - 1; i >= 0; i--) {
      result += str.charAt(i);
    }
    return result;
  }
}
