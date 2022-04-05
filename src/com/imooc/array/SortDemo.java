package com.imooc.array;

public class SortDemo {
  public static void main(String[] args) {
    // 冒泡排序
    int[] a = {34, 53, 12, 32, 56, 17};
    System.out.println("排序前的数组元素为：");
    for (int n : a) {
      System.out.print(n + " ");
    }
    System.out.println();

    int tmp;
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
        }
      }
    }
    System.out.println("排序后的数组元素为：");
    for (int n : a) {
      System.out.print(n + " ");
    }
  }
}
