package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenericMethodRefDemo
 * @date 2019/6/28 15:24
 * @Copyright
 */
public class GenericMethodRefDemo {
  static <T> int myOp(GenericFunc<T> f, T[] vals, T v) {
    return f.func(vals, v);
  }
  public static void main(String[] args) {
    Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
    String[] strs = { "One", "Two", "Three", "Two"};
    int count;
    count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
    System.out.println("vals contains " + count + " 4s");
    count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
    System.out.println("strs contains " + count + " twos");
  }
}

class MyArrayOps {
  static <T> int countMatching(T[] vals, T v) {
    int count = 0;
    for(int i = 0; i < vals.length; i++) {
      if(vals[i] == v) {
        count++;
      }
    }
    return count;
  }
}
