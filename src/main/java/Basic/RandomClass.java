package Basic;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author : wuyayan
 * @Date : Created in 21:22 2021/12/21
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class RandomClass {
    public static void main(String[] args) {
//        Random random = new Random();
//        int num = random.nextInt();
//        System.out.println("随机数是："+num);

        //随机数  左闭右开区间
        /*
        Random random1 = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random1.nextInt(99);
            System.out.println(num);
        }
        */


        //随意赋值
//        int n = 5;
//        Random r = new Random();
//
//        for (int i = 0; i < 10; i++) {
//        int result = r.nextInt(n) + 1;
//        System.out.println(result);
//        }

        /**
         * 猜数字
         * 数字0-100之间，猜个数字
         * 二分法查找
         */
        Random random = new Random();
        //生成的数字
        int r = random.nextInt(100) + 1;
        //输入数字
//        int i1 = 0;

        //当输入数字和生成数字不相等时，反复循环
//        while (true){
//            System.out.println("请输入数字：");
//            int i1 = new Scanner(System.in).nextInt();
//            if(i>i1){
//            System.out.println("数字小于所猜数字");
//            }else if(i<i1){
//            System.out.println("数字大于所猜数字");
//            }else {
//            System.out.println("你猜中了，该数字为："+i1);
//            break;
//            }
////            findNum(i1,i);
//        }

        //猜十次，没成功就是输了。
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入数字：");
            int inputInt = new Scanner(System.in).nextInt();
            if(r>inputInt){
            System.out.println("数字小于所猜数字");
            }else if(r<inputInt){
            System.out.println("数字大于所猜数字");
            }else {
            System.out.println("你猜中了，该数字为："+inputInt);
            break;
            }
        }
        System.out.println("你输了！");
    }
//    public static void findNum(int i1,int i){
//        //判断i1大于还是小于i
//        if(i>i1){
//            System.out.println("数字小于所猜数字");
//        }else if(i<i1){
//            System.out.println("数字大于所猜数字");
//        }else {
//            System.out.println("你猜中了，该数字为："+i1);
//        }
//    }
}
