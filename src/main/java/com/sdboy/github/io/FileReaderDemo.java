package com.sdboy.github.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileReaderDemo
 * @date 2019/6/7 17:45
 * @Copyright
 */
public class FileReaderDemo {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path, "new.txt");
    FileReader fr = null;
    try {
      fr = new FileReader(file);
      int c;
      while ((c = fr.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if(fr != null) {
        try {
          fr.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }
    }
  }
}
