package TestPackge;
/**
 *
 */

/**
 * Created by liuhaoran1 on 2017/4/14.
 */
public class TestMethodAdd {
    /*
    public static int add(int a,int b){  //定义一个int类型的方法， add为方法名，a，b为形参
        int sum = 0;
        sum = a + b;
        return sum;  //返回值，两个作用，返回值，结束方法的运行
    }
    */
    public static void asd(int x, int y, int z) {
        for (int i = 1; i <= x; i++) {
            if (i % y == 0) {
                System.out.print(i + "\t");
            }
            if (i % (z * y) == 0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        //int s = add(3,5);   //调用add方法
        //System.out.println(s);
        asd(1000000000,6,3);
    }
}
