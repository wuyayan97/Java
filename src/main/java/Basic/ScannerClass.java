package Basic;


import java.util.Scanner;

/**
 * @Author : wuyayan
 * @Date : Created in 21:51 2021/12/20
 * @Description :  Scanner
 * @Version : V1.0.0
 **/
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println("输入的数字是："+num);

//        System.out.println("请输入第一个数字：");
//        int a = scanner.nextInt();
//        System.out.println("请输入第二个数字：");
//        int b = scanner.nextInt();
//        System.out.println("两数和为："+(a+b));

//        键盘输入三个数，找出最大值
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数字：");
        int c = scanner.nextInt();
        System.out.println("三个数中最大值为："+Math.max(Math.max(a,b),c));
    }
}
