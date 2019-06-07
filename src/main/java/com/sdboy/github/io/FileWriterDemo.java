package com.sdboy.github.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileWriterDemo
 * @date 2019/6/7 17:52
 * @Copyright
 */
public class FileWriterDemo {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path, "new1.txt");
    String source = "now is the time for all good men\n"
        + " to come to the aid fo their country\n"
        + " and pay their due taxes.\n"
        + " 这是中文";
    char buf[] = new char[source.length()];
    source.getChars(0, source.length(), buf, 0);
    FileWriter fw = null;
    try {
      fw = new FileWriter(file);
      fw.write(buf);
      fw.flush();
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if(fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          System.out.println("io exception");
        }
      }
    }
  }
}
