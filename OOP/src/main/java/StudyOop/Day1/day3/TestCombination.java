package StudyOop.Day1.day3;

/**测试组合
 * Created by liuhaoran1 on 2017/4/18.
 */
public class TestCombination {
    String eye;
    public void run(){
        System.out.println("run!!");
    }
    public void eat(){
        System.out.println("eat!!");
    }
    public void sleep(){
        System.out.println("zzzzzz~");
    }
}
class TestCombination1{
    TestCombination a = new TestCombination(); //组合
    public void taisheng(){
        a.eat();
        System.out.println("taisheng");
    }
    public static void main(String[] args){
        TestCombination1 b = new TestCombination1();
        b.taisheng();
        b.a.sleep();//调用TestCombination类中的sleep方法
    }
}
