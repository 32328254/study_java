package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.MyInterface;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public class Test implements MyInterface {

    @Override
    public void test01() {
        int  x = MyInterface.MAX_SPEED;
        String y = MyInterface.MAX_GREAD;
        System.out.println("x= "+x+"\n"+"y= "+y);
    }

    @Override
    public void test02(int a, int b) {
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        Test v = new Test();
        v.test01();
        v.test02(3,4);
    }
}
