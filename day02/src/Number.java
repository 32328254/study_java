import java.util.Scanner;

/**
 * Created by liuhaoran1 on 2017/5/2.
 */
public class Number {  //创建Number类
    public  static void main(String[] args){   //java程序入口main
        Scanner scanner = new Scanner(System.in);   //创建一个Scanner对象
        System.out.print("plase input first name:");
        String name1 = scanner.next();              //接收一个字符
        System.out.print("plase input second name:");
        String name2 = scanner.next();
        System.out.println(name1 + " and " + name2);  //输出
        System.out.print("hello");
    }
}