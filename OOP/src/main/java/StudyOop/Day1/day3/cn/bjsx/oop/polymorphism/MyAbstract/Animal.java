package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.MyAbstract;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public abstract class Animal {  //abstract定义抽象类
    public abstract void run();  //abstract定义抽象方法，方法只声明，不实现

}
class Cat extends Animal{
    public void run(){
        System.out.println("Cat run....");
    }
}
class Dog extends Animal{
    public void run(){
        System.out.println("Dog run....");
    }
}
