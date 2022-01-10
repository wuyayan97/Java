package Advanced.Inheritance;

/**
 * @Author wuyayan
 * @Date 2022/01/08 17:34:00
 * @Version 1.0
 * @Description 继承示例（父类一处代码，多个子类可以使用）
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        /**
         * 继承DEMO
         */
        ChildrenClass childrenClass = new ChildrenClass();
        //虽然子类中没有method方法，但是可以从父类继承。
        childrenClass.method();


        /**
         * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
         * 直接访问：通过子类对象访问成员变量。
         *          等号左边是谁，就优先用谁，没有则向上找。
         * 间接访问：通过成员方法访问成员变量.
         *          方法属于谁，就优先用谁，没有则向上找。
         */
        //ChildrenClass childrenClass = new ChildrenClass();优先用childrenClass
        System.out.println(childrenClass.num); //20

        //这个方法是子类的，优先用子类的。
        childrenClass.methodC();//20
        //这个方法是在父类中定义的。
        childrenClass.methodP();//10

        System.out.println("===============================================");

        /**
         * 方法继承也是从子类向上找父类，绝不会向下找子类。
         */
        //创建的是谁，就优先用谁
        childrenClass.methodClone();//子类方法重名


    }
}
