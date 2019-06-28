package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConstructorGenricClassRefDemo
 * @date 2019/6/28 17:10
 * @Copyright
 */
public class ConstructorGenricClassRefDemo {
  public static void main(String[] args) {
    ConstructorGenricFunc<Integer> genricFunc = ConstructorGenricClass<Integer>::new;
    ConstructorGenricClass<Integer> genricClass = genricFunc.func(100);
    System.out.println(genricClass.getVal());
  }
}
