package Basic;

/**
 * @Author : wuyayan
 * @Date : Created in 22:22 2021/12/21
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class ObjectArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("ni","wo");
        Person two = new Person("ni","wo");
        Person three = new Person("ni","wo");

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getToYum());
    }
}
