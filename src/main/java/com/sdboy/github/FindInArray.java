package com.sdboy.github;

/**
 * <p></p>
 *
 * @author JG
 * @version V1.0.0
 * @date 2019/2/27 12:12
 * @see
 */
public class FindInArray {
  public static void main(String[] args) {
    int[][] arr = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
    int num = 39;
    boolean flag = findInArray(arr, num);
    System.out.println(flag);
  }

  public static boolean findInArray(int[][] arr, int num){
    int row = 0;
    int col = arr[row].length -1;
    while (arr[row][col] != num){
      // 目标比元素小
      if(arr[row][col] > num) {
        if(col > 0){
          col--;
        }else {
          return false;
        }
      }else {
        // 未到达右下角
        if(row < arr.length -1 && col < arr[row].length - 1) {
          if(arr[row+1][col] > num && arr[row][col+1] > num){
            return false;
          }else if(arr[row+1][col] > num) {
            col++;
          }else {
            row++;
          }
          // 到达底部
        }else if(row == arr.length -1 && col < arr[row].length - 1) {
          if(arr[row][col+1] > num) {
            return false;
          }else {
            col++;
          }
          // 到达最右边
        }else if(row < arr.length -1 && col == arr[row].length - 1) {
          if(arr[row+1][col] > num) {
            return false;
          }else {
            row++;
          }
        }else {
          return arr[row][col] == num;
        }
      }
    }
    return arr[row][col] == num;
  }
}
