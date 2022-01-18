package Advanced.Abstract;

/**
 * @Author wuyayan
 * @Date 2022/01/18 17:49:00
 * @Version 1.0
 * @Description TODO
 */
//抽象方法所在的类，必须是抽象类才行，在class之前协商abstract即可。
public abstract class Animal {

    //public void eat(){
    //    System.out.println("吃鱼");
    //}
    //抽象方法：加上abstract关键字，去掉大括号，直接分号结束。
    public abstract void eat();

    public Animal(){
        System.out.println("父类构造方法执行！");
    }
}
