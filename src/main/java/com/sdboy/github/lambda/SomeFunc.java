package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class SomeFunc
 * @date 2019/6/25 17:49
 * @Copyright
 */
public interface SomeFunc<T> {
  T func(T t);
}
