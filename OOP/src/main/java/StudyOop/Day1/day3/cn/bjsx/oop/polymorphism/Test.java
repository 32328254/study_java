package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism;

/**
 * Created by liuhaoran1 on 2017/4/18.
 */
public class Test {
    public static void testAnimalVoice(Animal c){
        c.vice();
        if (c instanceof Dog){   //如果c是 Dog的对象，就执行写lookDoor方法
            ((Dog) c).lookDoor();
        }
    }
    /*
public static void testAnimalVoice(Cat c){
    c.vice();
}

private static void testAnimalVoice(Cat c) {
    c.vice();
}*/
    public static void main(String[] args){
        Animal a = new Cat();
        testAnimalVoice(a);
        Animal d = new Dog();
        testAnimalVoice(d);
        Animal e = new Pig();
        testAnimalVoice(e);
        //Dog d2 = (Dog)d;      //把Animal(d) 强制转型为Dog方法
        //d2.lookDoor();        //通过Dog方法调用自己lookDor方法
    }
}
