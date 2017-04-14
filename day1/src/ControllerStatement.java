/**
 * Created by liuhaoran1 on 2017/4/7.
 */
/*
控制语句
 */

public class ControllerStatement {
    public static void main(String[] args){
        double d = Math.random(); //随机生成一个数 [0,1)
        int e = 1 + (int)(d*6); //
        System.out.println(d);
        System.out.println(e);
        if (e > 3){
            System.out.println("big number"+e);
        }
        else {
            System.out.println("small number"+e);
        }
    }
}
