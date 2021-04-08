package com.sdboy.github.loop;

/**
 * @author jiaoguang
 * @version V1.0.0
 * @class BreakContinue
 * @date 2021/4/8 17:18
 * @Copyright
 */
public class BreakContinue {
  public static void main(String[] args) {
//    breakTest();
//    continueTest();
//    breakLabel();
    continueLabel();
  }

  public static void breakTest() {
    for(int i = 0; i < 5; i++) {
      int j = 0;
      while (j < 4) {
        if(j == 3) {
          break;
        }
        System.out.println("j = " + j);
        j++;
      }
      System.out.println("i = " + i);
      System.out.println("finish");
    }
  }

  public static void continueTest() {
    for(int i = 0; i < 5; i++) {
      int j = 0;
      while (j < 4) {
        j++;
        if(j == 3) {
          continue;
        }
        System.out.println("j = " + j);
      }
      System.out.println("i = " + i);
      System.out.println("finish");
    }
  }

  public static void breakLabel() {
    outer:
    for(int i = 0; i < 5; i++) {
      int j = 0;
      while (j < 4) {
        if(j == 3) {
          break outer;
        }
        System.out.println("j = " + j);
        j++;
      }
      System.out.println("i = " + i);
      System.out.println("finish");
    }
  }

  public static void continueLabel() {
    outer:
    for(int i = 0; i < 5; i++) {
      int j = 0;
      while (j < 4) {
        j++;
        if(j == 3) {
          continue outer;
        }
        System.out.println("j = " + j);
      }
      System.out.println("i = " + i);
      System.out.println("finish");
    }
  }
}
