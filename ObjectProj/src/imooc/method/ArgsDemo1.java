package imooc.method;

public class ArgsDemo1 {
  // 查找
  public void search(int n, int... a) {
    boolean flag = false;
    for (int i : a) {
      if (n == i) {
        flag = true;
        break;
      }
    }
    if (flag) {
      System.out.println(n + "找到了!");
    } else {
      System.out.println(n + "没找到！");
    }
  }

  public static void main(String[] args) {
    ArgsDemo1 ad = new ArgsDemo1();
    ad.search(3, 4, 5, 6, 7, 9);

    int[] a = {1, 2, 3, 46, 7, 8};
    ad.search(3, a);
  }
}
