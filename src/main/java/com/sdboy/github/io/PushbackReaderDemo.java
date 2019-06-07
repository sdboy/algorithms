package com.sdboy.github.io;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class PushbackReaderDemo
 * @date 2019/6/7 18:56
 * @Copyright
 */
public class PushbackReaderDemo {
  public static void main(String[] args) {
    String s = "if (a == 4) a = 0;\n";
    char buf[] = new char[s.length()];
    char tmp[] = {'a', 'b', 'c'};
    s.getChars(0, s.length(), buf, 0);
    CharArrayReader car = new CharArrayReader(buf);
    // 缓冲区大小，要不小于需要回退的字符串数组长度
    PushbackReader pr = new PushbackReader(car, 3);
    try{
      int c;
      while ((c = pr.read()) != -1) {
        switch (c) {
          case '=':
            c = pr.read();
            if(c == '=') {
              System.out.print(".eq.");
            } else {
              System.out.print("<-");
              pr.unread(tmp);
            }
            break;
          default:
            System.out.print((char) c);
        }
      }
    } catch (IOException e) {
      System.out.println("io exception");
    }
  }
}
