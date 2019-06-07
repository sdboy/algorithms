package com.sdboy.github.io;

import java.io.File;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileList
 * @date 2019/5/29 9:45
 * @Copyright
 */
public class FileList {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path);
    if(file.isDirectory()) {
      System.out.println("directory of " + path);
      String s[] = file.list();
      for (int i = 0; i < s.length; i++) {
        File f = new File(path + File.separator + s[i]);
        if(f.isDirectory()) {
          System.out.println(f.getName() + " is a directory");
        } else {
          System.out.println(f.getName() + " is a file");
        }
      }
    } else {
      System.out.println(file.getName() + " is not a directory");
    }
  }
}
