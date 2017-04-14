package day_stady;

/**
 * Created by liuhaoran1 on 2017/4/14.
 */
public class TestMethod {
    public static void test01(){
        for (int j = 1;j<=100;j++){
            if (j % 5 == 0){
                System.out.print(j + "\t");
            }
            if (j % (5 * 3) == 0){
                System.out.println();
            }
        }
    }
    public static void test2(){
        int count = 0;
        outer:  //goto的形式
        for (int i = 100; i <= 150; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    continue outer;  //跳转会goto
                }
                System.out.print(i + "\t");
            }
        }
    }
    public static void main(String[] args){
        test01();
        System.out.println("###################");
        test2();
    }
}
