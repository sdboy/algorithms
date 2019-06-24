package com.sdboy.github.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class InetAddressTest
 * @date 2019/6/23 8:16
 * @Copyright
 */
public class InetAddressTest {
  public static void main(String[] args) {
    try {
      InetAddress address = InetAddress.getLocalHost();
      System.out.println(address);

      address = InetAddress.getByName("www.HerbSchildt.com");
      System.out.println(address);
      System.out.println(address.getHostAddress());
      System.out.println(address.getHostName());
      byte ip[] = address.getAddress();
      for(int i = 0; i < ip.length; i++) {
        int num = (ip[i] < 0 ? 256 + ip[i] : ip[i]);
        System.out.println(num);
      }

      InetAddress bd[] = InetAddress.getAllByName("www.baidu.com");
      for(int i = 0; i < bd.length; i++) {
        System.out.println(bd[i]);
      }
      String str = "216.92.65.4";
      String[] ipStr = str.split("\\.");
      byte ipBuf[] = new byte[4];
      for(int i = 0; i < ipStr.length; i++) {
        ipBuf[i] = (byte) (Integer.parseInt(ipStr[i])&0xff);
      }
      address = InetAddress.getByAddress("www.HerbSchildt.com", ipBuf);
      System.out.println(address);
    } catch (UnknownHostException e) {
      System.out.println("unknown host exception");
    }

  }
}
