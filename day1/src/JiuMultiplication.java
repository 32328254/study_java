/**
 * Created by liuhaoran1 on 2017/4/12.
 */
public class JiuMultiplication {
    public static void main(String[] args){
        for (int i = 1;i<=9;i++ ) {
            //System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
