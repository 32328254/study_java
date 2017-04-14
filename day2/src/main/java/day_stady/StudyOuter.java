package day_stady;

/**
 * Created by liuhaoran1 on 2017/4/12.
 */
public class StudyOuter {
    public static void main(String[] args) {
        int count = 0;
        outer:  //goto的形式
        for (int i = 100; i <= 150; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    continue outer;  //跳转会goto
                }
                System.out.print(i + "\t");
            }
        }
    }
}
