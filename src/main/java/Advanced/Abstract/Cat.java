package Advanced.Abstract;

/**
 * @Author wuyayan
 * @Date 2022/01/18 17:55:00
 * @Version 1.0
 * @Description TODO
 */
public class Cat extends Animal{
//1.不能直接创建new抽象类对象;
//2.必须用一个子类来继承抽象父类；
//3.子类必须覆盖重写抽象父类中所有的抽象方法。
//覆盖重写（实现）：子类去掉抽象方法中的abstract关键字，然后补上方法体和括号。
        @Override
        public  void eat(){
            System.out.println("猫吃鱼");
        };

        public Cat(){
            //super();父类构造方法
            System.out.println("子类构造方法执行！");
        }
}
