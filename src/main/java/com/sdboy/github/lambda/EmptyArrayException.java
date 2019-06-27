package com.sdboy.github.lambda;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class EmptyArrayException
 * @date 2019/6/27 16:23
 * @Copyright
 */
public class EmptyArrayException extends Exception {
  EmptyArrayException() {
    super("Array Empty");
  }
}
