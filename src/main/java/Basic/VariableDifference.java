package Basic;

/**
 * @Author : wuyayan
 * @Date : Created in 21:08 2021/12/16
 * @Description :  笔记在Day2
 * @Version : V1.0.0
 **/
public class VariableDifference {
    String name;
    public void methodA(){
        int num = 1;
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){//方法的参数就是局部变量
        //参数在方法被调用的时候，必定会赋值
        System.out.println(param);
    }

    public static void main(String[] args) {
        VariableDifference variableDifference = new VariableDifference();
        variableDifference.methodA();
//        variableDifference.methodB();

        int[] arr = {5,15,20,25};
        System.out.println(getMax(arr));

        This toThis = new This();
        toThis.name = "myName";
        toThis.sayHello("youName");
    }

    private static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }



}
