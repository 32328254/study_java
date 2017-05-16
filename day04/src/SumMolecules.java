import java.util.Scanner;

/**
 * Created by liuhaoran1 on 2017/5/16.
 */
public class SumMolecules {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please input number: ");
        try {
            double sum=0;
            int number = scan.nextInt();
            for (double i=1;i<=number;i++){
                sum = sum + 1.0/i;
            }
            System.out.println("sum = "+sum);
        }
        catch (Exception e){
            System.out.println(e+" invalid input!");
        }


    }
}
