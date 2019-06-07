package com.sdboy.github.io;

import java.io.File;
import java.io.IOException;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileDemol
 * @date 2019/5/29 8:48
 * @Copyright
 */
public class FileDemo {
  public static void main(String[] args) throws IOException {
    String path1 = "E:" + File.separator + "video" + File.separator + "io";
    String path2 = "E:" + File.separator + "video";
    File dir = createDir(path2);
    File file = createFile(path2, "new.txt");
    System.out.println("File name: " + file.getName());
    System.out.println("Path: " + file.getPath());
    System.out.println("Abs Path: " + file.getAbsolutePath());
    System.out.println("Parent: " + file.getParent());
    System.out.println(file.exists() ? "exist" : "dose not exist");
    System.out.println(file.canWrite() ? "is writeable" : "is not writeable");
    System.out.println(file.canRead() ? "is readable": "is not readable");
    System.out.println("is " + (file.isDirectory() ? "" : "not a directory"));
    System.out.println(file.isFile() ? "is normal file" : "might be a named pipe");
    System.out.println(file.isAbsolute() ? "is absolute" : "is note absolute");
    System.out.println("file last modified: " + file.lastModified());
    System.out.println("file size: " + file.length() + " bytes");
  }

  public static File createDir(String path) {
    File dir = new File(path);
    if(!dir.exists()) {
      dir.mkdirs();
    }
    return dir;
  }

  public static File createFile(String path, String fileName) throws IOException {
    File file = new File(path, fileName);
    if(!file.exists()) {
      file.createNewFile();
    }
    return file;
  }
}
