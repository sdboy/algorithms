package com.sdboy.github.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class DatagramClientDemo
 * @date 2019/6/23 22:41
 * @Copyright
 */
public class DatagramClientDemo {
  public static void main(String[] args) {
    try {
      DatagramSocket ds = new DatagramSocket(8084);
      byte buf[] = new byte[1024];
      DatagramPacket dp = new DatagramPacket(buf, buf.length);
      ds.receive(dp);
      System.out.println(new String(dp.getData(), 0, dp.getLength()));
      ds.close();
    } catch (SocketException e) {
      System.out.println("socket exception");
    } catch (IOException e) {
      System.out.println("io exception");
    }
  }
}
