package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class MethodRefDemo
 * @date 2019/6/27 17:11
 * @Copyright
 */
public class MethodRefDemo {
  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String[] args) {
    String inStr = "lambdas add power to Java";
    String outStr;
    outStr = stringOp(MyStringDemo::strReverse, inStr);
    System.out.println("original string: " + inStr);
    System.out.println("String reversed: " + outStr);
    outStr = stringOp(MethodRefDemo::removeSpace, inStr);
    System.out.println(outStr);
    StringFunc sf = MethodRefDemo::removeSpace;

    System.out.println(sf.func("sds sds sds"));
  }

  static String removeSpace(String str) {
    String result = "";
    int i;
    for(i = 0; i < str.length(); i++) {
      if(str.charAt(i) != ' ') {
        result += str.charAt(i);
      }
    }
    return result;
  }
}

class MyStringDemo {
  static String strReverse(String str) {
    String result = "";
    int i;
    for(i = str.length() - 1; i >= 0; i--) {
      result += str.charAt(i);
    }
    return result;
  }
}
