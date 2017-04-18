package StudyOop.Day1.day1;

/**
 * Created by liuhaoran1 on 2017/4/16.
 */
public class MethodTest {
    //定义加的方法
    public int addSum(int a ,int b,int c){
        int k = a + b +c;
        return k;
    }
    public static void main(String[] args){
        MethodTest number = new MethodTest();
        int i = number.addSum(1,2,3);
        System.out.println(i);
    }
}
