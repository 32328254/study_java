package StudyOop.Day1.day2;

import StudyOop.Day1.Student;

/**
 * Created by liuhaoran1 on 2017/4/17.
 */
public class TestStatic0 {
    //静态数据
    String name;
    int age;
    int id;
    String gender;
    static int ss;
    //动态的行为
    public static void printss(){
        System.out.println(ss);
    }
    public void stduy(){
        System.out.println(name + " write java");
    }
    public void sayhello(String sname){
        System.out.println(name+" towards "+sname+" say hello");
    }
}
