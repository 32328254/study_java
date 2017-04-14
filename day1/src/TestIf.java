/**
 * Created by liuhaoran1 on 2017/4/10.
 */
public class TestIf {
    public static void main(String[] args){
        int a;
        double d;
        d = Math.random();
        d=(int)(d*6);
        //System.out.println(d);
        if (d == 6){
            System.out.println("good luckly,number is:"+d);
        }
        else if (d >=4){
            System.out.println("well good,number is:"+d);
        }
        else if (d >=2){
            System.out.println("ordinary,number is:"+d);
        }
        else {
            System.out.println("bad luckly,number is:"+d);
        }
    }
}
