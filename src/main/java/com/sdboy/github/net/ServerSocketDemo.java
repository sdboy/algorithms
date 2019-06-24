package com.sdboy.github.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class ServerSocketDemo
 * @date 2019/6/23 18:40
 * @Copyright
 */
public class ServerSocketDemo {
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(9999);
      Socket socket = ss.accept();
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
      int c;
      while ((c = br.read()) != -1) {
        System.out.print((char) c);
      }
      String str = "success";
      char ms[] = new char[str.length()];
      str.getChars(0,str.length(), ms, 0);
      bw.write(ms);
      bw.flush();
      br.close();
      bw.close();
      socket.close();
      ss.close();
    } catch (IOException e) {
      System.out.println("io exception");
    }

  }
}
