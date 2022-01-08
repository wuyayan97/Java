package Advanced.Math;

import java.util.ArrayList;

/**
 * @Author wuyayan
 * @Date 2022/01/08 11:38:00
 * @Version 1.0
 * @Description Math
 */
public class MathClass {
    /**
     *
     * public static double abs(double num):去绝对值
     * public static double ceil(double num):向上取整
     * public static double floor(double num):向下取整
     * public static long round(double num):四舍五入
     */
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14)); //3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-2.5));//2.5
        System.out.println("========================");

        //向上取整
        System.out.println(Math.ceil(3.14)); //4.0
        System.out.println(Math.ceil(0));//0.0
        System.out.println(Math.ceil(-2.5));//-2.0
        System.out.println(Math.ceil(-2.6));//-2.0
        System.out.println("========================");

        //向下取整
        System.out.println(Math.floor(3.14));//3.0
        System.out.println(Math.floor(0));//0
        System.out.println(Math.floor(-2.5));//-3.0
        System.out.println("========================");

        //五舍六入
        System.out.println(Math.round(3.14));//3
        System.out.println(Math.round(0));//0
        System.out.println(Math.round(-2.5));//-2
        System.out.println(Math.round(-2.6));//-3
        System.out.println("========================");

        /**
         * 计算题目在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
         */
        int num;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(num=(int) Math.ceil(-10.8);num<5.9;num++){
            if(Math.abs(num)>6 || Math.abs(num)<2.1){
                arrayList.add(num);
            }
        }
        System.out.println(arrayList);
    }
}
