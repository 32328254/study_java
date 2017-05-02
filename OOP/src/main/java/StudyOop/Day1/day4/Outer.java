package StudyOop.Day1.day4;

/**
 * Created by liuhaoran1 on 2017/4/23.
 */
public class Outer {
    public static void main(String[] args){
        Face f = new Face();   //先调用外部类
        Face.Nose n = f.new Nose();  //再调用内部类
        n.breath();  //执行内部类的方法
        //调用静态内部类的方法
        Face.Ear e = new Face.Ear();  //直接调用静态内部类
        e.listen();
    }
}
/*
 *定义一个外部类Face,再Face类里面在定义一个内部类Nose，在定义一个方法
 */
class Face{
    String type;
    class Nose{    //非静态内部类
        int a;
        void breath(){
            System.out.println(Face.this.type);  //静态内部类可以直接调用外部属性
            System.out.println(this.a);
            System.out.println("breath");
        }
    }
    //静态内部类
    static class Ear{
        void listen(){
            System.out.println("listening");
        }
    }

}