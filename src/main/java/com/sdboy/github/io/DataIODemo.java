package com.sdboy.github.io;

import java.io.*;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class DataIODemo
 * @date 2019/6/6 17:41
 * @Copyright
 */
public class DataIODemo {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path, "new.txt");
    FileOutputStream fos = null;
    DataOutputStream dout = null;
    FileInputStream fis = null;
    DataInputStream din = null;
    try {
      fos = new FileOutputStream(file);
      dout = new DataOutputStream(fos);
      dout.writeDouble(98.7878);
      dout.writeInt(879879);
      dout.writeBoolean(true);
      dout.writeChar('s');
//      dout.writeChars("ssssssss");
      dout.writeByte(100);
      fis = new FileInputStream(file);
      din = new DataInputStream(fis);
      double d = din.readDouble();
      int i = din.readInt();
      boolean b = din.readBoolean();
      char c = din.readChar();
      byte bt = din.readByte();
      System.out.println("Here are the values: " + d + " " + i + " " + b + " " + c + " " + bt);
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if(dout != null) {
        try {
          dout.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }

      if(din != null) {
        try {
          din.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }

      if(fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }

      if(fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }
    }
  }
}
