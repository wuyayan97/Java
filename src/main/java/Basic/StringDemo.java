package Basic;


import java.util.Scanner;

/**
 * @Author : wuyayan
 * @Date : Created in 21:19 2021/12/22
 * @Description :  java.lang.String类代表字符串
 * @Version : V1.0.0
 **/
public class StringDemo {
    public static void main(String[] args) {

        //第一种：
        String string = new String();
        System.out.println("第一个字符串："+string);

        //第二种
        char[] chars1 = {'a','b','c','d'};
        //这里别导错包
        String charString = new String(chars1);
        System.out.println("第二个字符串："+charString);

        //第三种：
        byte[] bytes = {97,98,99,100};
        String bytesString = new String(bytes);
        System.out.println("第三个字符串："+bytesString);

        //第四种：
        String string1 = "abcd";
        String string2 = "abcd";
        System.out.println("第四个字符串"+string1);

        System.out.println(string1==string2);
        System.out.println(string1==charString);
        System.out.println(string1==bytesString);

        String str = "hello";
        String str1 = "world";
        String str2 = str.concat(str1);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        char ch = "hello".charAt(1);
        System.out.println(ch);

        System.out.println(str.indexOf('e'));

        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,4));
        System.out.println("===================");

        //转化成字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===================");

        //转化成字节数组
        byte[] bytes1 = "abc".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        System.out.println("===================");

        //字符串的内容替换
        String a = "how are you?";
        String b = "how are you?";
        System.out.println(a.replace("o","*"));
        System.out.println(b);
        System.out.println("===================");

        String c = "aaa,er,3r3r,3543t,grewe,rwtwr,trrwgw,ege";
        String[] split = c.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println("===================");
        String d = "xxx.fff.fff.eree.trtrt";
        String[] split1 = d.split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String input = scanner.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] chars2 = input.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if('A' <= chars2[i] && 'Z' >= chars2[i]){
                countUpper++;
            }else if('a' <= chars2[i] && 'z' >= chars2[i]){
                countLower++;
            }else if('0' <= chars2[i] && '9' >= chars2[i]){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母：" +countUpper);
        System.out.println("小写字母：" +countLower);
        System.out.println("数字：" +countNumber);
        System.out.println("其他：" +countOther);




    }
}
