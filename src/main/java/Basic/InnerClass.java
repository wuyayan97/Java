package Basic;

import java.util.Scanner;

/**
 * @Author : wuyayan
 * @Date : Created in 22:21 2021/12/20
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class InnerClass {
    public static void main(String[] args) {
//        Person one = new Person();
//        one.name = "高圆圆";
//
//        new Person().name="赵又廷";
//        new Person().showName();

//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

        methodParam(new Scanner(System.in));

        Scanner sc  = returnScanner();
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner returnScanner(){
        return new Scanner(System.in);
    }


}
