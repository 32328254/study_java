/**
 * Created by liuhaoran1 on 2017/5/4.
 */
import java.util.Scanner;
/*
 *创建类age，接收用户输入的年龄age（int）,并输出
 */
public class Age {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input age: ");
        int age = scan.nextInt();
        System.out.println("you age is: "+age);

        /*三目

        int a=5,b=8;
        int max = a > b ? 1:2;
        System.out.println("three mu is :"+max);
             * */
        
    }
}
