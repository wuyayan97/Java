package Advanced.Override.demo;

public class NewPhone extends Phone{

    //定义一个新手机、新增功能


    @Override
    public void show() {
        //把父类的东西直接拿过来用
        super.show();
        //再新建自己需要的东西
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
