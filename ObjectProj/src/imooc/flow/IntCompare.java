package imooc.flow;

import java.util.Scanner;

public class IntCompare {
  public static void main(String[] args) {
    /*
     * @Author liuyue
     * @Description 比较两个整型数的大小
     * @Date 11:20 2022/4/4
     * @Param [args]
     * @return void
     **/
    System.out.println("请输入一个整型数：");
    Scanner sc1 = new Scanner(System.in);
    int num1 = sc1.nextInt();
    System.out.println("请输入另一个整型数：");
    Scanner sc2 = new Scanner(System.in);
    int num2 = sc2.nextInt();

    if (num1 != num2) {
      if (num1 > num2) {
        System.out.println(num1 + "大于" + num2);
      } else {
        System.out.println(num1 + "小于" + num2);
      }
    } else {
      System.out.println(num1 + "等于" + num2);
    }
  }
}
