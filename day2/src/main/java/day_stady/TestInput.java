package day_stady;

import java.util.Scanner;

/**学习Scanner类的使用，如何接受键盘输入的值
 * @author 小忍者
 * Created by on 2017/4/15.
 * @version 0.1.0
 */
public class TestInput {
    public static void Sum01(){
        Scanner s = new Scanner(System.in); //构造器，System.in 接受键盘的输入
        System.out.print("please input frist number:");
        long a = s.nextLong();  //当程序遇到next()方法时会阻塞，等待输入
        System.out.print("please input second number:");
        long b = s.nextInt();
        long sum = a + b;
        System.out.println("sum is :"+sum);
        Input(); //调用Input方法
    }
    public static void Input(){
        Scanner y = new Scanner(System.in);
        System.out.print("please input:");
        String z = y.next();
        System.out.println("you input is:"+z);
    }
    public static void main(String[] args){
        Sum01();
    }
}
