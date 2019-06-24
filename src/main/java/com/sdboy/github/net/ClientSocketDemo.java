package com.sdboy.github.net;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ClientSocketDemo
 * @date 2019/6/23 18:40
 * @Copyright
 */
public class ClientSocketDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    char buf[] = new char[str.length()];
    str.getChars(0, str.length(), buf, 0);
    try {
      Socket socket = new Socket("127.0.0.1", 9999);
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream();
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
      bw.write(buf);
      bw.flush();
      socket.shutdownOutput();
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      int c;
      while ((c = br.read()) != -1) {
        System.out.print((char) c);
      }
      bw.close();
      br.close();
      socket.close();
    } catch (IOException e) {
      System.out.println("io exception");
    }
  }
}
