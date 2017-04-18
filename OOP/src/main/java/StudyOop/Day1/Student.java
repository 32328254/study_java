package StudyOop.Day1;

/**
 * Created by liuhaoran1 on 2017/4/15.
 */
public class Student {   //定义Student类
    //静态数据
    String name;
    int age;
    int id;
    String gender;
    //动态的行为
    public void stduy(){
        System.out.println(name + " write java");
    }
    public void sayhello(String sname){
        System.out.println(name+" towards "+sname+" say hello");
    }
    public static void main(String[] args){
        Student s1 = new Student();  //初始化一个类
        s1.name = "小忍者"; //调用类的属性
        s1.stduy();  //调用类的方法
        s1.sayhello("teacher");
    }
}
