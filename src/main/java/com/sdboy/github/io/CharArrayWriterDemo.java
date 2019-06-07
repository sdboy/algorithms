package com.sdboy.github.io;

import java.io.*;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class CharArrayWriterDemo
 * @date 2019/6/7 18:23
 * @Copyright
 */
public class CharArrayWriterDemo {
  public static void main(String[] args) {
    String tmp = "5984848484549/7sdfjksjkdjfskdjfsjghkjnsjdhgsdfsgerrrda";
    char c[] = new char[tmp.length()];
    tmp.getChars(0, tmp.length(), c, 0);
    CharArrayWriter caw = new CharArrayWriter();
    try {
      caw.write(c);
    } catch (IOException e) {
      System.out.println("io exception");
    }
    System.out.println(caw.toString());
    String path = "E:" + File.separator + "video";
    File file = new File(path, "new.txt");
    FileWriter fw = null;
    try {
      fw = new FileWriter(file);
      caw.writeTo(fw);
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if( fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }
    }
  }
}
