import java.util.Scanner;

/*
 * Created by liuhaoran1 on 2017/5/16.
 */
public class WaterFlower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please input number: ");
        //int a=0;
        //String str =null;
        try {
            int max = scan.nextInt();
            System.out.println("you input number is : "+max);
            for (int n =3;n<=max;n++){
                int sum =0;
                for (int m =n;m>0;m/=10){
                    int v = m%10;
                    sum += v*v*v;
                }
                if (n ==sum){
                    System.out.print(n+" ");
                }
            }
        }
        catch (Exception e){
            System.out.println(e+" invalid input ");
        }
    }
}
