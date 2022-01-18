package Advanced.Override;

/**
 * @Author wuyayan
 * @Date 2022/01/10 18:00:00
 * @Version 1.0
 * @Description 重写Override
 */
public class OverrideClass {
    /**
     * 重写：
     * 概念：在继承关系当中，方法的名称一样，参数列表也一样。
     */

    //重写、重载对比
    //重写(Override)：方法名称一样，参数列表也【一样】（覆盖、覆写）
    //重载(Overload)：方法的名称一样，参数列表【不一样】

    //方法的覆盖重写特点：创建的是子类对象，优先使用子类方法。

    /**
     * 方法覆盖重写的注意事项：
     *1.必须保证父子类之间的方法名称相同，参数相同。
     * @Override 写在方法前面，用来检测是不是正确覆盖重写。
     * 这个注解就算不写，也是正确的。
     *
     * 2.子类方法的返回值必须小于等于父类方法的返回值范围。
     * 提示：Object.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类。
     *
     * 3.子类的方法的权限必须【大于等于】父类方法的权限修饰符
     * 提示：public>protect>(default)空>private
     */

    /**
     * 继承关系中，父子构造方法的访问特点：
     * 1.子类构造方法中，有个默认隐藏的super()调用，所以一定是先调用的父类构造，再调用子类；
     * 2.可以通过super关键字来调用父类的重载构造。
     * 3.super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造。
     */

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        //父类构造方法
        //子类构造方法
//        ===============================
        //当添加了有参构造以后，想要使用有参构造函数，则在子类构造函数中，添加super(参数)
    }
}
