package com.sdboy.github.net;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class HttpURLDemo
 * @date 2019/6/23 14:46
 * @Copyright
 */
public class HttpURLDemo {
  public static void main(String[] args) throws Exception {
    URL hp = new URL("http://www.baidu.com");
    HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
    System.out.println("request method is: " + hpCon.getRequestMethod());
    System.out.println("response code is: " + hpCon.getResponseCode());
    System.out.println("response message is: " + hpCon.getResponseMessage());
    Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
    Set<String> hdrField = hdrMap.keySet();
    System.out.println("\nhere is header:");
    for(String k : hdrField) {
      System.out.println("Key: " + k + " values: " + hdrMap.get(k));
    }
  }
}
