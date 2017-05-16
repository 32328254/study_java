/**
 * Created by liuhaoran1 on 2017/5/16.
 */
public class Number {
    public static void main(String[] args) {
        long sum = 0;
        long num = 0;
        int i =1;
        for (;i<=5;i++){
            num = num*10+9;
            sum =sum+num;
            System.out.println("num="+num);
        }
        System.out.println("sum is : "+sum);
    }
}
