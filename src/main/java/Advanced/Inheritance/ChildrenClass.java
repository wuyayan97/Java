package Advanced.Inheritance;

/**
 * @Author wuyayan
 * @Date 2022/01/08 17:32:00
 * @Version 1.0
 * @Description 子类
 */
public class ChildrenClass extends ParentClass{
    int num = 20;

    public void methodC(){
        System.out.println(num);
        int num = 30;

        /**
         * 局部变量：直接写
         * 本类的成员变量：this.成员变量名
         * 父类的成员变量：super.成员变量名
         */
        System.out.println(num);// 30 局部变量
        System.out.println(this.num);// 20 本类的成员变量
        System.out.println(super.num);//10 父类的成员变量
    }

    public void methodChild(){
        System.out.println("子类对象");
    }

    public void methodClone(){
        System.out.println("子类方法重名！");
    }
}
