package com.sdboy.github.io;

import java.io.*;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class SerializationDemo
 * @date 2019/6/8 10:30
 * @Copyright
 */
public class SerializationDemo {
  public static void main(String[] args) {
    String path = "E:" + File.separator + "video";
    File file = new File(path, "serial");
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
      MyClass obj1 = new MyClass("Hello", -7, 2.7e10);
      System.out.println("obj1: " + obj1);
      oos.writeObject(obj1);
    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    }

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
      MyClass obj2 = (MyClass) ois.readObject();
      System.out.println(obj2.toString());
    }  catch (FileNotFoundException e) {
      System.out.println("file not found exception");
    } catch (IOException e) {
      System.out.println("io exception");
    } catch (Exception e) {
      System.out.println("exception");
    }
  }
}

class MyClass implements Serializable {
  String s;
  int i;
  double d;

  public MyClass(String s, int i, double d) {
    this.s = s;
    this.i = i;
    this.d = d;
  }

  @Override
  public String toString() {
    return "s=" + s + "; i=" + i + "; d=" + d + ";";
  }
}
