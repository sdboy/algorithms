package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class InstanceFunc
 * @date 2019/6/28 17:19
 * @Copyright
 */
public interface InstanceFunc<R, T> {
  R func(T t);
}
