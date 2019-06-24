package com.sdboy.github.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class Whois
 * @date 2019/6/23 8:49
 * @Copyright
 */
public class Whois {
  public static void main(String[] args) {
    int c;
    try {
      Socket s = new Socket("whois.internic.net", 43);
      InputStream in = s.getInputStream();
      OutputStream out = s.getOutputStream();
      String str = (args.length == 0 ? "creative.com" : args[0]) + "\n";
      byte buf[] = str.getBytes();
      out.write(buf);
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
      s.close();
    } catch (UnknownHostException e) {
      System.out.println("unknown host exception");
    } catch (IOException e) {
      System.out.println("io exception");
    }

  }
}
