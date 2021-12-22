package Basic;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author : wuyayan
 * @Date : Created in 19:23 2021/12/22
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        //从jdk1.7开始，右侧的尖括号内可以不写内容。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加一些数据
        list.add("abc");
        System.out.println(list);

        list.add("abcd");
        list.add("abce");
        list.add("abed");
        list.add("abeecd");
        System.out.println(list);

        /**
         * 使用{}括起来集合，使用@符号分割每个元素。
         */
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = new Random().nextInt(33)+1;
            listInt.add(random);
        }
        for (int i = 0; i < listInt.size(); i++) {
            if(i==0){
                System.out.println("{"+listInt.get(i));
            }else if(i==listInt.size()-1){
                System.out.println("@"+listInt.get(i)+"}");
            }else {
                System.out.println("@"+listInt.get(i));
            }
        }

        /**
         * 集合筛选
         * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。要求使用自定义的方法来实现筛选。
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListAll = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(50) + 1;
            arrayListAll.add(random);
            if(random % 2 == 0) {
                arrayList.add(random);
            }
        }
        System.out.println(arrayList);
        System.out.println(arrayListAll);


    }
}
