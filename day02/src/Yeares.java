/**
 * Created by liu on 05/05/2017.
 */
import java.util.Scanner;
public class Yeares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("pleaes input years: ");
        int y = scan.nextInt();
        System.out.println("you input year is "+y);
        //boolean z = (y % 4 == 0 && y % 100 != 0) || y %400==0;
        String x = (y % 4 == 0 && y % 100 != 0) || y %400==0?y+" is run year":y+" not is run year";
        System.out.println(x);
    }
}
