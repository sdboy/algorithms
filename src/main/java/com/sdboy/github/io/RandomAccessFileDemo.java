package com.sdboy.github.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class RandomAccessFileDemo
 * @date 2019/6/6 18:38
 * @Copyright
 */
public class RandomAccessFileDemo {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path, "new.txt");
    RandomAccessFile raf = null;
    try {
      raf = new RandomAccessFile(file, "rw");
      raf.seek(raf.length());
      raf.writeChars("ksdjfksdjfkmvskjdfksdfj");
      raf.seek(3);
      System.out.println("输入内容：" + raf.getFilePointer());
      int c;
      while ((c = raf.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if(raf != null) {
        try {
          raf.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }
    }
  }
}
