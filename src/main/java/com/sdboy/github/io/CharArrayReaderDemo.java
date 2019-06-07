package com.sdboy.github.io;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class CharArrayReaderDemo
 * @date 2019/6/7 18:17
 * @Copyright
 */
public class CharArrayReaderDemo {
  public static void main(String[] args) {
    String tmp = "5984848484549/7sdfjksjkdjfskdjfsjghkjnsjdhgsdfsgerrrda";
    char c[] = new char[tmp.length()];
    tmp.getChars(0, tmp.length(), c, 0);
    int r;
    CharArrayReader car = new CharArrayReader(c);
    try {
      while ((r = car.read()) != -1) {
        System.out.print((char) r);
      }
    } catch (IOException e) {
      System.out.println("io exception");
    }

  }
}
