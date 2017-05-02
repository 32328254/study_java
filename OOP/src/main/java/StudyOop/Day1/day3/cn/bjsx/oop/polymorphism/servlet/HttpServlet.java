package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.servlet;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public class HttpServlet {
    public void service(){
        System.out.println("HttpServlet.service()");
        this.doGet(); //调用子类
    }

    public void doGet(){
        System.out.println("HttpServlet.doGet()");
    }
}
