##成员变量和局部变量

###区别

####成员变量
    1.定义的位置：在方法外部，直接写在类中；
    2.作用范围：整个类全部通用；
    3.默认值：有默认值，规则和数组一样；
    4.内存的位置：位于堆内存；
    5.生命周期：随着对象创建而诞生，随着垃圾回收而消失

####局部变量
    1.定义的位置：在方法内部；
    2.作用范围：在方法中才可以使用；
    3.默认值：没有默认值，如果想要使用，必须手动赋值；
    4.内存的位置：位于栈内存；
    5.生命周期：随着方法进栈而诞生，随着方法出栈而消失。
    
###private关键字
    问题描述：定义对象的成员变量时，无法阻止不合理的数值被设置进来。
    解决方案：用priavate关键字将需要被保护的成员变量进行修饰。
    
    一旦使用private进行修饰，本类的可以访问。
    超出本类范围就不可以直接访问了。
    
    在类中添加getter和setter方法。
    对于boolen类型的值，要getter方法要写成isXXX，set方法不变

```
public class Person(){
    String name;
    private int age;
    
    public int setAge(int param){
        if(num<100 && num>=9){
        age = param;
        }else{
        system.out.println("年龄不正确。");
        }
    }

    public int getAge(){
        return age;
    }
}

Public class Demo1(){
    Person person = new Person();
    person.name();
    person.setAge(18);
}


```