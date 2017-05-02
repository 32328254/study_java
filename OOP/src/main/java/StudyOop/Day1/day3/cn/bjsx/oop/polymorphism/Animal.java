package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism;

/**
 * Created by liuhaoran1 on 2017/4/18.
 */
public class Animal {
    String str;
    public void vice(){
        System.out.println("default vice");
    }
}

class Cat extends Animal{   //继承Animal这个类
    public void vice(){     //vice方法重写
        System.out.println("喵~");
    }
}

class Dog extends Animal{
    public void vice(){
        System.out.println("汪~");
    }
    public void lookDoor(){
        System.out.println("look Door");
    }
}

class Pig extends Animal{
    public void vice(){
        System.out.println("哼~");
    }
}

