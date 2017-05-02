package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.MyInterface;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public interface MyInterface {    //interface 接口
    //接口中只有常量和抽象方法
    public static final String MAX_GREAD = "BOSS";  //public static final 接口中常量定义，可以忽略
    int MAX_SPEED = 120;
    public abstract void test01();
    public abstract void test02(int a, int b);
}
