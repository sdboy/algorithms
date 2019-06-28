package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class InstanceFactoryDemo
 * @date 2019/6/28 17:20
 * @Copyright
 */
public class InstanceFactoryDemo {
  static <R, T> R instanceFactory(InstanceFunc<R, T> f, T v) {
    return f.func(v);
  }

  public static void main(String[] args) {
    InstanceFunc<ConstructClass, Integer> intInstance = ConstructClass::new;
    ConstructClass cc = intInstance.func(5);
    System.out.println(cc.getVal());
    InstanceFunc<ConstructorGenricClass<Integer>, Integer> genricInstance = ConstructorGenricClass<Integer>::new;
    ConstructorGenricClass<Integer> genricClass = genricInstance.func(9);
    System.out.println(genricClass.getVal());
    InstanceFunc<ConstructorGenricClass<String>, String> strInstance = ConstructorGenricClass<String>::new;
    ConstructorGenricClass<String> strClass = strInstance.func("23232434");
    System.out.println(strClass.getVal());
  }
}
