import java.util.Scanner;

/**
 * @author liuyue
 */
public class ConditionDemo {
    public static void main(String[] args) {
        for (int i = 1; i <3; i++)
            System.out.println("请输入一个整数：");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + "是偶数");
            } else {
                System.out.println(n + "是奇数");
            }
            //todo : 123

    }
}
