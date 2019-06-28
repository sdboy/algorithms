package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConstructorGenricFunc
 * @date 2019/6/28 17:09
 * @Copyright
 */
public interface ConstructorGenricFunc<T> {
  ConstructorGenricClass<T> func(T t);
}
