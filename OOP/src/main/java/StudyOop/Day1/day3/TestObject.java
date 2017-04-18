package StudyOop.Day1.day3;

/**
 * Created by liuhaoran1 on 2017/4/18.
 */
public class TestObject {
    public static void main(String[] args){
        Object a = new Object();
        System.out.println(a.toString());
        Object b = new Object();
        System.out.println(b.toString() == a.toString()); //不相等
    }
}
