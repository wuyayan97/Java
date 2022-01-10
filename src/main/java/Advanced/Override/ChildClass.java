package Advanced.Override;

/**
 * @Author : wuyayan
 * @Date : Created in 20:51 2022/1/10
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class ChildClass extends ParentClass{

    @Override
    public void method(){
//        super();
        //错误写法，只有子类构造方法，才能调用父类构造方法。
    }

    public ChildClass(){
        //super();
        //有个默认的。
        //当加了个有参构造以后
        super(20);
        System.out.println("子类构造方法");
    }

}
