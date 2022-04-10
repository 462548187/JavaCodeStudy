package imooc.array;

public class ArrayDemo {
  public static void main(String[] args) {
    // 声明一个整型数组
    int[] intArray;

    // 声明一个字符串类型数组
    String[] strArray;

    // 创建数组
    intArray = new int[5];
    strArray = new String[10];

    // 声明数组的同时进行创建
    float[] floatArray = new float[4];

    // 初始化数组
    char[] ch = {'a', 'b', 'c', 'd'};
    System.out.println("ch数组的长度为：" + ch.length);
    System.out.println("inArray数组的第2个元素为：" + intArray[1]);
    System.out.println("strArray数组的地5个元素为：" + strArray[4]);
    System.out.println("floatArray数组的最后1个元素为：" + floatArray[floatArray.length - 1]);

    // 定义一个长度为 3 的字符串数组，并赋值初始值
    String[] hobbys = {"sports", "game", "movie"};
    System.out.println("循环输出数组中元素的值：");

    // 使用循环遍历数组中的元素
    for (String n : hobbys) {
      System.out.println(n);
    }
  }
}
