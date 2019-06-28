package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ArrayCreatorDemo
 * @date 2019/6/28 17:42
 * @Copyright
 */
public class ArrayCreatorDemo {
  public static void main(String[] args) {
    MyArrayCreator<MyClass[]> myc = MyClass[]::new;
    MyClass[] mc = myc.func(2);
    mc[0] = new MyClass(1);
    mc[1] = new MyClass(2);
  }
}
