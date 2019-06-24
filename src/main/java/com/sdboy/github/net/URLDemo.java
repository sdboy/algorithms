package com.sdboy.github.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class URLDemo
 * @date 2019/6/23 9:50
 * @Copyright
 */
public class URLDemo {
  public static void main(String[] args) throws MalformedURLException {
    URL hp = new URL("http://www.HerbSchildt.com/WhatiNew");
    System.out.println("protocol: " + hp.getProtocol());
    System.out.println("port: " + hp.getPort());
    System.out.println("host: " + hp.getHost());
    System.out.println("file: " + hp.getFile());
    System.out.println("ext: " + hp.toExternalForm());
  }
}
