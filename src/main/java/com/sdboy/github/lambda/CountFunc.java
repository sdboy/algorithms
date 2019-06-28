package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class CountFunc
 * @date 2019/6/27 17:36
 * @Copyright
 */
public interface CountFunc<T> {
  // 第一个参数为引用方法的实例

  /**
   * <p></p>
   * @method func
   * @author jiaoguang
   * @date 2019/6/27 19:56
   * @param v1 指定类型的任意实例
   * @param v2 引用方法的参数
   * @return boolean
   * @since V1.0.0
   * @version V1.0.0
   */
  boolean func(T v1, T v2);
}
