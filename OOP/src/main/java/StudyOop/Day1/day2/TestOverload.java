package StudyOop.Day1.day2;

/**构造方法的重载
 * Created by liuhaoran1 on 2017/4/17.
 */
public class TestOverload {
    public static void main(String[] args){
       myMath a = new myMath();
       int result1 = a.sum(3,5);
       int result2 = a.sum(4,5,6);
       double result3 = a.sum(3,4);
       System.out.println(result1);
    }
}
class myMath{
    //模板
    public int sum(int c,int a){
        return c+a;
    }
    //顺序不同
    public int sum(int c,double a){
        return (int)a+c;
    }
    //参数的类型不同
    public int sum(double a,int b){
        return (int)(a+b);
    }
    //参数的个数不同
    public int sum(int a,int b,int d){
        return a+b;
    }
}
