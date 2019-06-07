package com.sdboy.github.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileInputStreamDemo
 * @date 2019/5/30 8:07
 * @Copyright
 */
public class FileInputStreamDemo {
  public static void main(String[] args) {
    int size;
    FileInputStream fis = null;
    try {
      String path  = "E:" + File.separator + "video";
      File file = new File(path, "new.txt");
      fis = new FileInputStream(file);
      System.out.println("total available bytes: " + (size = fis.available()));
      int n = size / 40;
      System.out.println("first " + n + " bytes of the file one read() at a time");
      for (int i = 0; i < n; i++) {
        System.out.print((char) fis.read());
      }
      System.out.println("\nstill available: " + fis.available());
      System.out.println("reading the next " + n + " with one read(b[])");
      byte b[] = new byte[n];
      if(fis.read(b) != n) {
        System.err.println("couldn't read " + n + " bytes");
      }
      System.out.println(new String(b, 0, n));
      System.out.println("\nstill available: " + (size = fis.available()));
      System.out.println("skiping half of remaing bytes with skip()");
      fis.skip(size/2);
      System.out.println("\nstill available: " + fis.available());
      System.out.println("reading " + n/2 + " into the end of array");
      if (fis.read(b, n/2, n/2) != n/2) {
        System.out.println("couldn't read " + n/2 + " bytes");
      }
      System.out.print(new String(b, 0, b.length));
      System.out.println("\nstill available: " + fis.available());
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      try {
        if(fis != null) {
          fis.close();
        }
      } catch (IOException e) {
        System.out.println("io exception");
      }
    }
  }
}
