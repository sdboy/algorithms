package com.sdboy.github.net;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class DatagramServerDemo
 * @date 2019/6/23 22:42
 * @Copyright
 */
public class DatagramServerDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    byte[] buf = str.getBytes();
    try {
      DatagramSocket ds = new DatagramSocket(8083);
      ds.send(new DatagramPacket(buf, str.length(), InetAddress.getLocalHost(), 8084));
      ds.close();
    } catch (SocketException e) {
      System.out.println("socket exception");
    } catch (UnknownHostException e) {
      System.out.println("unknown host exception");
    } catch (IOException e) {
      System.out.println("io exception");
    }
  }
}
