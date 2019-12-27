package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenIFDemo
 * @date 2019/8/19 9:08
 * @Copyright
 */
public class GenIFDemo {
  public static void main(String[] args) {
    Integer inums[] = { 3, 6, 2, 8, 6};
    Character chs[] = {'b', 'r', 'p', 'w'};
    MyClass<Integer> iob = new MyClass<>(inums);
    MyClass<Character> cob = new MyClass<>(chs);
    System.out.println("max value in inums: " + iob.max());
    System.out.println("min value in inums: " + iob.min());
    System.out.println("max value in chs: " + cob.max());
    System.out.println("min value in chs: " + cob.min());
  }
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
  T[] vals;
  MyClass(T[] o) {
    vals = o;
  }

  @Override
  public T min() {
    T v = vals[0];
    for(int i = 1; i < vals.length; i++) {
      if(v.compareTo(vals[i]) > 0) {
        v = vals[i];
      }
    }
    return v;
  }

  @Override
  public T max() {
    T v = vals[0];
    for(int i = 1; i < vals.length; i++) {
      if(v.compareTo(vals[i]) < 0) {
        v = vals[i];
      }
    }
    return v;
  }
}
