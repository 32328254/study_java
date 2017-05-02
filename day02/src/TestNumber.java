import java.util.Random;
import java.util.Scanner;

/**
 * Created by liuhaoran1 on 2017/5/2.
 */
public class TestNumber {
    public static void main(String[] args){
        Random r = new Random();
        int r1 = r.nextInt(10);
        int r2 = r.nextInt(10);
        //System.out.println(r1);
        //System.out.println(r2);
        int number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("pleae input number 1: ");
        number1 = scanner.nextInt();
        System.out.print("pleae input number 2: ");
        number2 = scanner.nextInt();
        int number3 = number1+number2;
        int number4 = r1+r2;
        if (number3 == number4 ){
            System.out.print("good");
        }
        else
        System.out.print("agent");
    }
}
