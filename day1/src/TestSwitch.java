/**
 * Created by liuhaoran1 on 2017/4/10.
 */
/*
* 测试switch语句
* */
public class TestSwitch {
public static void main(String[] args){
     int b;
     b = 1 + (int)(6 * Math.random());
     switch (b){  //int类型，或者可以自动转为int的类型(bytes，char，short,枚举)，其中jdk7中可以放置string
         case 6:
             System.out.println("good luckly,number is:"+b);
             break;
         case 5:
             System.out.println("well good,number is:"+b);
             break;
         case 4:
             System.out.println("ordinary,number is:"+b);
             break;
         default:
             System.out.println("bad luckly,number is:"+b);
             break;
     }
   }
}

