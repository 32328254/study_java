package TestPackge;

/**
 * Created by liuhaoran1 on 2017/4/14.
 */
public class TestApi {
    /*计算5的阶乘
         */
    public static class TestFactorial {
        public static int Factorial(int n){
            if (n == 1){
                return 1;
            }
            else
            {
                return n * Factorial(n-1);
            }
        }
        public static void main(String[] args){
            int s = Factorial(2);
            System.out.println(s);
        }
    }

    /**
     * Created by liuhaoran1 on 2017/4/14.
     */
    public static class TestRecursion {
        static  int a = 0;
        public static void test1(){ //定义方法1
            a++;
            System.out.println("TestRecursion.test1()"+"."+a);
            //test2();
            //test3();
            if (a < 10){
             test1();  //递归调用
            }
            else {
               System.out.println("over");
            }
        }
        public static void test2(){ //定义方法2
            System.out.println("TestRecursion.test3()");
        }
        public static void test3(){  //定义方法3
            System.out.println("TestRecursion.test3()");
        }
        public static void main(String[] args){
            test1();
        }
    }
}
