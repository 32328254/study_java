package StudyOop.Day1.day3;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by liuhaoran1 on 2017/4/18.
 */
public final class TestFinal {         //final修饰类则说明这个类不能被继承
    public static void main(String[] args){
        final int a = 0;   //a是常量
        System.out.println(a);
    }
}

class  Animal{
    public final void run(){   //final 加到方法前面，意味着该方法不能被子类重写！
        System.out.println("run run run!!!");
    }
    public void sleep(){
        System.out.println("zzzzzzzzz");
    }
}
class Brid extends Animal{
    public void sleep(){
        System.out.println();
    }
    //错误用法，因为父类定义run方法为final，所以子类不能重写run方法
   /* public void run(){
       System.out.println("错误用法");
    }
    */
}