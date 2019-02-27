package com.sdboy.github;

/**
 * <p></p>
 *
 * @author JG
 * @version V1.0.0
 * @date 2019/2/27 12:15
 * @see
 */
public class RepeatNum {
  public static void main(String[] args) {
    int[] arr = {1,2,3,3,4,1};
    int a = getNum(arr);
    System.out.println(a);
  }

  public static int getNum(int[] arr) {
    if(arr == null || arr.length < 1) {
      return -1;
    }
    int len = arr.length;
    for(int i = 0; i < len; i++) {
      while (arr[i] != i) {
        if(arr[i] == arr[arr[i]]) {
          return arr[i];
        }
        swap(arr, i, arr[i]);
      }
    }
    return -1;
  }

  public static void swap(int[] arr, int i, int j) {
    int t;
    t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
