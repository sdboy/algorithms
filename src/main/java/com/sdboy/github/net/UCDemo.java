package com.sdboy.github.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class UCDemo
 * @date 2019/6/23 12:29
 * @Copyright
 */
public class UCDemo {
  public static void main(String[] args) throws MalformedURLException, IOException {
    int c;
    URL hp = new URL("http://www.internic.net");
    URLConnection hpCon = hp.openConnection();
    long d = hpCon.getDate();
    if(d == 0) {
      System.out.println("no date information");
    } else {
      System.out.println("date: " + new Date(d));
    }
    System.out.println("Content-Type: " + hpCon.getContentType());
    d = hpCon.getExpiration();
    if(d == 0) {
      System.out.println("no expiration information");
    } else {
      System.out.println("expires: " + new Date(d));
    }
    d = hpCon.getLastModified();
    if(d == 0) {
      System.out.println("no last-modified");
    } else {
      System.out.println("last-modified: " + new Date(d));
    }
    long len = hpCon.getContentLength();
    if(len == -1) {
      System.out.println("content length unavailable");
    } else {
      System.out.println("content length: " + len);
    }
    if(len > 0) {
      System.out.println("====Content====");
      InputStream in = hpCon.getInputStream();
      while((c = in.read()) != -1) {
        System.out.print((char) c);
      }
      in.close();
    } else {
      System.out.println("no content available");
    }
  }
}
