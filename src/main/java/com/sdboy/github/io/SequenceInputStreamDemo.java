package com.sdboy.github.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class SequenceInputStreamDemo
 * @date 2019/5/30 11:00
 * @Copyright
 */
public class SequenceInputStreamDemo {
  public static void main(String[] args) {
    int c;
    String path = "E:" + File.separator + "video";
    Vector<String> files = new Vector<String>();
    files.addElement(path + File.separator + "f1.txt");
    files.addElement(path + File.separator + "f2.txt");
    files.addElement(path + File.separator + "f3.txt");
    InputStreamEnumerator ise = new InputStreamEnumerator(files);
    SequenceInputStream in = new SequenceInputStream(ise);

    try (FileInputStream fis1 = new FileInputStream(path + File.separator + "f1.txt");
         FileInputStream fis2 = new FileInputStream(path + File.separator + "f1.txt");
         FileInputStream fis3 = new FileInputStream(path + File.separator + "f1.txt")) {
      ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
      list.add(fis1);
      list.add(fis2);
      list.add(fis3);
      Enumeration<FileInputStream> e = Collections.enumeration(list);
      SequenceInputStream sis = new SequenceInputStream(e);
      while ((c = sis.read()) != -1) {
        System.out.print((char) c);
      }
      while ((c = in.read()) != -1) {
        System.out.print((char) c);
      }
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    } catch (IOException e) {
      System.out.println("io exception");
    } finally {
      try {
        in.close();
      } catch (IOException e) {
        System.out.println("io exception");
      }
    }
  }
}

class InputStreamEnumerator implements Enumeration<FileInputStream> {
  private Enumeration<String> files;

  public InputStreamEnumerator(Vector<String> files) {
    this.files = files.elements();
  }
  /**
   * Tests if this enumeration contains more elements.
   *
   * @return <code>true</code> if and only if this enumeration object
   * contains at least one more element to provide;
   * <code>false</code> otherwise.
   */
  @Override
  public boolean hasMoreElements() {
    return files.hasMoreElements();
  }

  /**
   * Returns the next element of this enumeration if this enumeration
   * object has at least one more element to provide.
   *
   * @return the next element of this enumeration.
   * @throws NoSuchElementException if no more elements exist.
   */
  @Override
  public FileInputStream nextElement() {
    try {
      return new FileInputStream(files.nextElement().toString());
    } catch (IOException e) {
      return null;
    }
  }
}
