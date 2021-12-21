package Basic;

/**
 * @Author : wuyayan
 * @Date : Created in 22:24 2021/12/20
 * @Description :  To Do
 * @Version : V1.0.0
 **/
public class Person {
    String name ;
    public void showName(){
        System.out.println(this.name);
    }

    private String age;
    private String toYum;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getToYum() {
        return toYum;
    }

    public void setToYum(String toYum) {
        this.toYum = toYum;
    }

    public Person(String age, String toYum) {
        this.age = age;
        this.toYum = toYum;
    }
}
