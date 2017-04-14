/**
 * Created by liuhaoran1 on 2017/4/10.

public class TestWhile {
    public static void main(String[] args){
        int a = 1;  //初始化
        while (a <= 100){  //条件判断
            System.out.println(a); //循环体
            a++;
        }
    }
}
 */
public class TestWhile {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        do {   //先执行do的语句体
           System.out.println("sum is :"+sum);
           i++;
           System.out.println("i is "+i);
        }
        while (i < 0);{  //注意分号； 判断是否符合循环的条件，此时i=1；不符合循环条件。
            System.out.println("i 循环次数 = "+i);
        }
    }
}