package Advanced.Abstract;

/**
 * @Author wuyayan
 * @Date 2022/01/18 17:55:00
 * @Version 1.0
 * @Description TODO
 */
public class AbstractClass {
    public static void main(String[] args) {
        //错误方法
        //Animal animal = new Animal();

        //2.抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
        Cat cat = new Cat();
        cat.eat();
        //输出：
        // 父类构造方法执行！
        //子类构造方法执行！
        //猫吃鱼


    }
}
