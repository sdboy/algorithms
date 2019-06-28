package com.sdboy.github.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class UseMethodRef
 * @date 2019/6/28 16:28
 * @Copyright
 */
public class UseMethodRef {
  static int compareMc(MyClass a, MyClass b) {
    return a.getVal() - b.getVal();
  }

  public static void main(String[] args) {
    ArrayList<MyClass> al = new ArrayList<>();
    al.add(new MyClass(1));
    al.add(new MyClass(4));
    al.add(new MyClass(2));
    al.add(new MyClass(9));
    al.add(new MyClass(3));
    al.add(new MyClass(7));
    MyClass maxValObj = Collections.max(al, UseMethodRef::compareMc);
    System.out.println("maximum value is: " + maxValObj.getVal());
  }
}
