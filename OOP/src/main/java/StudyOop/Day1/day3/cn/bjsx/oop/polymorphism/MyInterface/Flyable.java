package StudyOop.Day1.day3.cn.bjsx.oop.polymorphism.MyInterface;

/**
 * Created by liuhaoran1 on 2017/4/19.
 */
public interface Flyable {
    int SPEED = 100;
    int HIGHT = 1;
    public void fly();
}
class Man implements Flyable{
    @Override
    public void fly(){
        System.out.println("人 在 飞");
    }
}
class plane implements Flyable{
    @Override
    public void fly() {
    System.out.println("plane依靠发动机");
    }
}
class  stone implements Flyable{
    public void fly(){
    }
}