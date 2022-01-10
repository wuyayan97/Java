package Basic;

import java.util.*;

/**
 * @Author : wuyayan
 * @Date : Created in 21:38 2021/12/23
 * @Description :  多个对象共享同一个数据
 * @Version : V1.0.0
 **/
public class StaticFieldClass {
    public void method(){
        System.out.println("这是一个成员方法");
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }

    public static void main(String[] args) {
        //成员方法必须要new一个对象
        StaticFieldClass staticFieldClass = new StaticFieldClass();
        staticFieldClass.method();

        //可以直接用类.调用
        StaticFieldClass.methodStatic();

//        或者在本类中不需要类名称就能调用
        methodStatic();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        System.out.println(chars);

        for (int length = chars.length; length > 0; length--) {
            System.out.println(chars[length-1]);
        }

    }

    static {
        System.out.println("静态代码块执行！");
    }


}
