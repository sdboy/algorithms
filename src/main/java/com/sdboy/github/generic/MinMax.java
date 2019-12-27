package com.sdboy.github.generic;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class MinMax
 * @date 2019/8/19 9:07
 * @Copyright
 */
public interface MinMax<T extends Comparable<T>> {
  T min();
  T max();
}
