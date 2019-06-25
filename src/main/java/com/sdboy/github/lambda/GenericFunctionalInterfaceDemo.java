package com.sdboy.github.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenericFunctionalInterfaceDemo
 * @date 2019/6/25 17:50
 * @Copyright
 */
public class GenericFunctionalInterfaceDemo {
  public static void main(String[] args) {
    SomeFunc<String> reverse = (String str) -> {
      String result = "";
      int i;
      for(i = str.length() - 1; i >= 0; i--) {
        result += str.charAt(i);
      }
      return result;
    };
    System.out.println(reverse.func("werty"));
    SomeFunc<Integer> factorial = (n) -> {
      int result = 1;
      for(int i = 1; i <= n; i++) {
        result = i * result;
      }
      return result;
    };
    System.out.println(factorial.func(3));
    SomeFunc<List<String>> list = (lst) -> {
      List<String> strings = new ArrayList<>();
      for(String str : lst) {
        strings.add(str);
      }
      return strings;
    };
  }
}
