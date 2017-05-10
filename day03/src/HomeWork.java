import java.util.Scanner;

/**
 * Created by liuhaoran1 on 2017/5/10.
 *三个数字从小到大排列
 */

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please input number a :");
        int a = scan.nextInt();
        System.out.print("please input number b :");
        int b = scan.nextInt();
        System.out.print("please input number c :");
        int c = scan.nextInt();

        if (a > b){
            int t = a;
            a = b;
            b = t;
        }
        if (a > c){
            int t = a;
            a = c;
            c = t;
        }
        if (b > c){
            int t = b;
            b = c;
            c = t;
        }
        System.out.println("a="+a+","+"b="+b+","+"c="+c);
    }
}
