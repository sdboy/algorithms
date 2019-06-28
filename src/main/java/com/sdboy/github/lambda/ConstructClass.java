package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConstructClass
 * @date 2019/6/28 16:50
 * @Copyright
 */
public class ConstructClass {
  private int val;
  ConstructClass(int val) {
    this.val = val;
  }
  ConstructClass() {
    val = 0;
  }
  int getVal() {
    return val;
  }
}
