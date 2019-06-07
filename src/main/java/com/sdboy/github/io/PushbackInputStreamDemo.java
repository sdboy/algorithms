package com.sdboy.github.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class PushbackInputStreamDemo
 * @date 2019/5/30 10:47
 * @Copyright
 */
public class PushbackInputStreamDemo {
  public static void main(String[] args) {
    String s = "if (a == 4) a = 0;\n";
    byte buf[] = s.getBytes();
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    PushbackInputStream pis = new PushbackInputStream(in);
    int c;
    try {
      while ((c = pis.read()) != -1) {
        switch (c) {
          case '=':
            if((c = pis.read()) == '=') {
              System.out.print(".eq.");
            } else {
              System.out.print("<-");
              pis.unread(c);
            }
            break;
          default:
            System.out.print((char) c);
            break;
        }
      }
    } catch (IOException e){
      System.out.println("io exception");
    }
  }
}
