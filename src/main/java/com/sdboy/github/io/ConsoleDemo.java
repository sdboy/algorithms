package com.sdboy.github.io;

import java.io.Console;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ConsoleDeom
 * @date 2019/6/7 19:16
 * @Copyright
 */
public class ConsoleDemo {
  public static void main(String[] args) {
    String s;
    Console con;
    // 在ide中返回null，在cmd窗口中正常
    con = System.console();
    if(con == null) {
      return;
    }
    s = con.readLine("this is read: ");
    con.printf("here is your string: %s\n", s);
  }
}
