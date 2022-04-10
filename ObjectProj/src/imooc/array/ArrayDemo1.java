package imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {
  public static void main(String[] args) {

    // 求整型数组的累加和
    // 定义整型的数组
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < a.length; i++) {
      System.out.print("请输入第" + (i + 1) + "个元素：");
      a[i] = sc.nextInt();
    }
    System.out.print("数组元素为：");

    //    for (int i = 0; i < a.length; i++) {
    //      System.out.print(a[i] + " ");
    //    }

    // 增强型for循环
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();

    int sum = 0;
    //        for (int i = 0; i < a.length; i++){
    //            sum += a[i];
    //        }

    // 增强型for循环
    for (int n : a) {
      sum += n;
    }
    System.out.println("sum=" + sum);
  }
}
