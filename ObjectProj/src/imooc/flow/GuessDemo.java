package imooc.flow;

import java.util.Scanner;

public class GuessDemo {
  public static void main(String[] args) {
    // 设置要猜的值
    //        int number = 32;
    int number = (int) (Math.random() * 10 + 1);
    System.out.println(number);
    int guess;
    System.out.println("游戏：猜一个介于1到10之间的数");
    do {
      System.out.print("请输入您猜测的数：");
      Scanner sc = new Scanner(System.in);
      guess = sc.nextInt();
      if (guess > number) {
        System.out.println("您输入的数太大！");
      } else {
        System.out.println("您输入的数太小");
      }
    } while (number != guess);

    System.out.println("恭喜你，您猜中了！答案为：" + number);
  }
}
