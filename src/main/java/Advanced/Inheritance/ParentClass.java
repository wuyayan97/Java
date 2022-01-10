package Advanced.Inheritance;

/**
 * @Author wuyayan
 * @Date 2022/01/08 17:31:00
 * @Version 1.0
 * @Description 父类
 */
public class ParentClass {
    public void method(){
        System.out.println("这是父类！");
    }

    int num = 10;

    public void methodP(){
        System.out.println(num);
    }

    public void methodParent(){
        System.out.println("父类执行");
    }

    public void methodClone(){
        System.out.println("父类方法重名！");
    }

}
