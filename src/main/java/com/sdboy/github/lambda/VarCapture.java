package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class VarCapture
 * @date 2019/6/27 16:41
 * @Copyright
 */
public class VarCapture {
  public int s = 3;
  public static void main(String[] args) {
    VarCapture varCapture = new VarCapture();
    varCapture.func(3);
  }
  public void func(int a) {
    int num = a;
//    num++;
    MyFunc myLambda = (n) -> {
      int v = num + n;
      s += 4;
//      num ++;
      System.out.println(this.getClass().toString());
      return v;
    };
    System.out.println(myLambda.func(2));
  }
}
