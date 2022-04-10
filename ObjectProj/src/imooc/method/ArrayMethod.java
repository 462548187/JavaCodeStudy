package imooc.method;

public class ArrayMethod {
  // 打印输出数组元素的值
  public void printArray(int[] array) {
    for (int j : array) {
      System.out.print(j + "  ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] array = {12, 34, 34, 56, 23};
    ArrayMethod am = new ArrayMethod();
    am.printArray(array);
  }
}
