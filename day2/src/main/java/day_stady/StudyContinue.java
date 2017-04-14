package day_stady;

/**
 * Created by liuhaoran1 on 2017/4/12.
 */
public class StudyContinue {
    public static void main(String[] args){
        for (int i =100;i<=150;i++){
            if (i % 3 != 0){
                System.out.println(i + "\tinto 3 won't 10 go");
                continue;
            }
            else
                System.out.println(i);
        }
    }
}
