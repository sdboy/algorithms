package com.sdboy.github.io;

import java.io.*;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class FileCopy
 * @date 2019/6/7 10:21
 * @Copyright
 */
public class FileCopy {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File src = new File(path, "mmall.sql");
    File dest = new File(path, "mmallbak.sql");
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
      fis = new FileInputStream(src);
      bis = new BufferedInputStream(fis);
      fos = new FileOutputStream(dest);
      bos = new BufferedOutputStream(fos);
      byte buf[] = new byte[4096];
      int readByte;
      while ((readByte = bis.read(buf)) > 0) {
        bos.write(buf, 0, readByte);
        bos.flush();
      }

    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      if(bis != null) {
        try {
          bis.close();
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

      if(bos != null) {
        try {
          bos.close();
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
