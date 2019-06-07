package com.sdboy.github.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileOutputStreamDemo
 * @date 2019/5/30 9:05
 * @Copyright
 */
public class FileOutputStreamDemo {
  public static void main(String[] args) {
    String source = "now is the time for all good men\n"
        + " to come to the aid fo their country\n"
        + " end pay their due taxes.";
    byte buf[] = source.getBytes();
    FileOutputStream fos1 = null;
    FileOutputStream fos2 = null;
    FileOutputStream fos3 = null;
    String path = "E:" + File.separator + "video";
    try {
      fos1 = new FileOutputStream(new File(path, "f1.txt"));
      fos2 = new FileOutputStream(new File(path, "f2.txt"));
      fos3 = new FileOutputStream(new File(path, "f3.txt"));
      for (int i = 0; i < buf.length; i+=2) {
        fos1.write(buf[i]);
      }
      fos2.write(buf);
      fos3.write(buf, buf.length - buf.length/4, buf.length/4);
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      try {
        if(fos1 != null) {
          fos1.close();
        }
      } catch (IOException e) {
        System.out.println("io exception");
      }

      try {
        if(fos2 != null) {
          fos2.close();
        }
      } catch (IOException e) {
        System.out.println("io exception");
      }

      try {
        if(fos3 != null) {
          fos3.close();
        }
      } catch (IOException e) {
        System.out.println("io exception");
      }
    }
  }
}
