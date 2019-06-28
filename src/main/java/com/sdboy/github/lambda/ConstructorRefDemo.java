package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConstructorRefDemo
 * @date 2019/6/28 16:53
 * @Copyright
 */
public class ConstructorRefDemo {
  public static void main(String[] args) {
    ConstruceFun construceFun = ConstructClass::new;
    ConstructClass cc = construceFun.func(100);
    System.out.println(cc.getVal());
  }
}
