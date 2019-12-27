package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class HierDemo2
 * @date 2019/8/19 10:40
 * @Copyright
 */
public class HierDemo2 {
  public static void main(String[] args) {
    Gen3<String> w = new Gen3<>("hello", 47);
    System.out.print(w.getOb() + " ");
    System.out.println(w.getNum());
  }
}

class NonGen {
  int num;
  NonGen(int num) {
    this.num  = num;
  }

  int getNum() {
    return num;
  }
}

class Gen3<T> extends NonGen {
  T ob;
  Gen3(T o, int i) {
    super(i);
    ob = o;
  }

  T getOb() {
    return ob;
  }
}
