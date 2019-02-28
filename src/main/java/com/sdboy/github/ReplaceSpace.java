package com.sdboy.github;

/**
 * <p></p>
 *
 * @author JG
 * @version V1.0.0
 * @date 2019/2/28 10:50
 * @see
 */
public class ReplaceSpace {
  public static void main(String[] args){
    StringBuilder str = new StringBuilder("2343434343434 sdfsdf2 2343434");
    System.out.println(replaceChar(str));
  }

  public static String replaceChar(StringBuilder str) {
    int p1 = str.length() - 1;
    for(int i = 0; i <= p1; i++) {
      if(str.charAt(i) == ' '){
        str.append("  ");
      }
    }
    int p2 = str.length() - 1;
    while (p1 >= 0 && p2 > p1) {
      char c = str.charAt(p1--);
      if(c == ' '){
        str.setCharAt(p2--, '0');
        str.setCharAt(p2--, '2');
        str.setCharAt(p2--, '%');
      }else{
        str.setCharAt(p2--, c);
      }
    }
    return str.toString();
  }
}
