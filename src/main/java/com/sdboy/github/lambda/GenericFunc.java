package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class GenericFunc
 * @date 2019/6/28 15:20
 * @Copyright
 */
public interface GenericFunc<T> {
  int func(T[] vals, T v);
}
