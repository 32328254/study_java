/**
 * Created by liuhaoran1 on 2017/5/4.
 */
import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input you age: ");
        int age = scan.nextInt();
        System.out.println("you age is: "+age);
        System.out.print("please input price: ");
        double price = scan.nextDouble();
        System.out.println("you input price is: "+price);
    }
}
