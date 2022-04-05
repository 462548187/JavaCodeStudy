package com.imooc.method;

public class MaxDemo {
  // 求最大值的方法
  public void max(float a, float b) {
    float max = Math.max(a, b);
    System.out.println("两个数" + a + "和" + b + "最大值为：" + max);
  }

  public static void main(String[] args) {
    MaxDemo maxDemo = new MaxDemo();
    float a = 6.8f;
    float b = 8.0f;
    maxDemo.max(a, b);

    maxDemo.max(6.8f, 1.2f);
  }
}
