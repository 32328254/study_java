package StudyOop.Day1.day1;

import java.util.Scanner;

/**@author xiaorenzhe
 * @version 0.1.0
 * return name
 * Created by liuhaoran1 on 2017/4/15.
 */
public class TestStudent {
    //定义静态数据
    String name;
    int id;
    int age;
    String gender;

    //定义动态行为
    public void  Study(String sname){
        System.out.println("sname value is :"+sname);
        if (sname == "a"){
            System.out.println(sname + " study java");
        }
        else if (sname == "b") {
            System.out.println(sname + " study kong fu");
        }
        else {
            System.out.println(sname + " don't like study everything");
        }
    }
    public void Money(){
        System.out.println(name + " say 'gave me money money money'");
    }
    public static String Input(){
        Scanner s = new Scanner(System.in);
        System.out.print("please input name: ");
        String sanme = s.next();
        return sanme;
    }
    public static void main(String[] args){
        TestStudent come = new TestStudent();
        come.name = come.Input();
        //come.Money();
        //begin.Study("小忍者");
        //come.name = "a";
        come.Study(come.name);
    }
}
