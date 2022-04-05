package com.imooc.method;

import java.util.Scanner;

public class ArraySearch {
  // 查找数组元素的方法
  public boolean search(int n, int[] arr) {
    boolean flag = false;
    for (int i : arr) {
      if (i == n) {
        flag = true;
        break;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    int[] arr = {12, 34, 56, 23, 23, 56};
    System.out.print("输入要查找的数：");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArraySearch as = new ArraySearch();
    boolean flag = as.search(n, arr);
    if (flag) {
      System.out.println("找到了！");
    } else {
      System.out.println("没找到！");
    }
  }
}
