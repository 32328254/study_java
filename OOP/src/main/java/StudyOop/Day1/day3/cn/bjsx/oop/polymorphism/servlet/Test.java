package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.servlet;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public class Test {
    public static void main(String[] args){
        HttpServlet s = new MyServlet();  //多态
        s.service();
        //s.doGet();
    }
}
