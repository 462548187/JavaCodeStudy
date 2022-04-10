/**
 * @author liuyue
 */
public class MathDemo {

    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        int result;
        //加法
        result = num1 + num2;
        System.out.println("num1" + "+num2" + "=" + result);
        //字符串连接运算
        System.out.println("" + num1 + num2);
        //减法
        result = num1 - num2;
        System.out.println("num1" + "-num2" + "=" + result);
        //乘法
        result = num1 * num2;
        System.out.println("num1" + "*num2" + "=" + result);
        //除法
        result = num1 / num2;
        System.out.println("num1" + "/num2" + "=" + result);

        int a = 3;
        System.out.println(a+=a*=a);

    }
}
