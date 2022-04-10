package imooc.flow;

import java.util.Scanner;

public class ScoreAssess {
  public static void main(String[] args) {
    /*
     * @Author liuyue
     * @Description
     * 成绩大于等于90分，输出“优”
     * 成绩大于等于80分且小于90分，输出“良”
     * 成绩大于等于60分小于80分，输出“中”
     * 成绩小于60分，输出不“不及格”
     * @Date 10:57 2022/4/4
     * @Param [args]
     * @return void
     **/

    System.out.println("请输入成绩：");

    Scanner sc = new Scanner(System.in);

    int score = sc.nextInt();

    if (score >= 90) {
      System.out.println("优");
    } else if (score >= 80) {
      System.out.println("良");
    } else if (score >= 60) {
      System.out.println("中");
    } else {
      System.out.println("不及格");
    }
  }
}
