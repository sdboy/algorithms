package com.sdboy.github.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class DirFileFilter
 * @date 2019/5/29 19:58
 * @Copyright
 */
public class DirFileFilter {
  public static void main(String[] args) {
    FileFilterExt fileFilterExt = new FileFilterExt("txt");
    FilenameFilterExt filenameFilterExt = new FilenameFilterExt("txt");
    String path = "E:" + File.separator + "video";
    File file = new File(path);
    String s[] = file.list(filenameFilterExt);
    for(int i = 0; i < s.length; i++) {
      System.out.println("file result: " + s[i]);
    }

    File files[] = file.listFiles(fileFilterExt);

    for(File f : files) {
      System.out.println(f.getName());
    }
  }
}

class FileFilterExt implements FileFilter {
  private String ext;

  FileFilterExt(String ext) {
    this.ext = "." + ext;
  }
  public boolean accept(File pathname) {
    return pathname.getName().endsWith(ext) && pathname.isFile();
  }
}

class FilenameFilterExt implements FilenameFilter {
  private String ext;

  FilenameFilterExt(String ext) {
    this.ext = "." + ext;
  }

  public boolean accept(File dir, String name) {
    File file = new File(dir, name);
    return name.endsWith(ext) && file.isFile();
  }
}
