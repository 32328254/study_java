/**
 * Created by liuhaoran1 on 2017/5/2.
 */
public class VarDemo {
    public static void main(String[] args){
        int x,y,z;
        x=5;
        y=6;
        z=7;
        x+=--y*z++;
        System.out.println("x="+x+","+"y="+y+","+"z="+z);
    }
}
