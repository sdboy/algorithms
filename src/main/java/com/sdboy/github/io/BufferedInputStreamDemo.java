package com.sdboy.github.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BufferedInputStreamDemo
 * @date 2019/5/30 9:47
 * @Copyright
 */
public class BufferedInputStreamDemo {
  public static void main(String[] args) {
    String s = "this is a &copy; copyright symbol " +
        "but this is &copy not.\n";
    byte buf[] = s.getBytes();
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    int c;
    boolean marked = false;
    BufferedInputStream f =  new BufferedInputStream(in);
    try {
      while ((c = f.read()) != -1) {
        switch (c) {
          case '&':
            if(!marked) {
              f.mark(6);
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
              f.reset();
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
    } catch (IOException e) {
      System.out.println("io exception");
    }

  }
}
