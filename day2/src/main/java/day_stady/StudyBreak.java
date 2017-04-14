package day_stady;

/**
 * Created by liuhaoran1 on 2017/4/12.
 */
public class StudyBreak {
    public static void main(String[] args){
        int total = 0;
        System.out.println("game begin");
        while (true){
            total ++;
            int i = (int)(100 * Math.random());
            System.out.println(i);
            if (i == 88){
                System.out.println("number is "+ i);
                break;
            }
        }
    }
}
