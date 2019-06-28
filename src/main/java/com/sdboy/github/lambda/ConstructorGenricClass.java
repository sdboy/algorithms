package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConstructorGenricClass
 * @date 2019/6/28 17:07
 * @Copyright
 */
public class ConstructorGenricClass<T> {
  private T val;
  ConstructorGenricClass(T val) {
    this.val = val;
  }

  ConstructorGenricClass() {
    val = null;
  }

  T getVal() {
    return val;
  }
}
