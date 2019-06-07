package com.sdboy.github.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BufferedReaderDemo
 * @date 2019/6/7 18:37
 * @Copyright
 */
public class BufferedReaderDemo {
  public static void main(String[] args) {
    String s = "this is a &copy; copyright symbol " +
        "but this is &copy not.\n";
    char buf[] = new char[s.length()];
    s.getChars(0, s.length(), buf, 0);
    CharArrayReader car = new CharArrayReader(buf);
    BufferedReader br = null;
    int c;
    boolean marked = false;
    try {
      br = new BufferedReader(car);
      while ((c = br.read()) != -1) {
        switch (c) {
          case '&':
            if(!marked) {
              br.mark(6);
              marked = true;
            } else {
              marked = false;
            }
            break;
          case ';':
            if(marked) {
              marked = false;
              System.out.print("(c)");
            } else {
              System.out.print((char) c);
            }
            break;
          case ' ':
            if(marked) {
              marked = false;
              br.reset();
              System.out.print("&");
            } else {
              System.out.print((char) c);
            }
            break;
          default:
            if(!marked) {
              System.out.print((char) c);
            }
            break;
        }
      }
      br.close();
    } catch (IOException e) {
      System.out.println("io exception");
    }

  }
}
