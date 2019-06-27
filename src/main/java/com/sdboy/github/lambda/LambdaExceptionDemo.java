package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class LambdaExceptionDemo
 * @date 2019/6/27 16:25
 * @Copyright
 */
public class LambdaExceptionDemo {
  public static void main(String[] args) throws EmptyArrayException {
    double[] value = {1.0, 2.0, 3.0, 4.0};
    DoubleNumericArrayFunc average = (n) -> {
      double sum = 0;
      if(n.length == 0) {
        throw new EmptyArrayException();
      }
      for(int i = 0; i < n.length; i++) {
        sum += n[i];
      }
      return sum;
    };

    System.out.println("the average is " + average.func(value));
    System.out.println("the average is " + average.func(new double[0]));
  }
}
