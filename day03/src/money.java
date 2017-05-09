import java.util.Scanner;

/**
 * Created by liu on 09/05/2017.
 */
public class money {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("please input price: ");
        double price = s.nextDouble();
        System.out.print("please input number: ");
        double number = s.nextDouble();
        System.out.print("please input total: ");
        double moneys = s.nextDouble();
        //计算总金额
        double total = price * number;
        if (total > 800){
            total = total * 0.8;
        }
        if (moneys > total){
            double banlance = moneys -total;
            System.out.println("total is "+total+"!"+"yu e is "+banlance);
        }else {
            System.out.println("sorry!!! money not enough ");
        }
        //计算余额
        //double banlance = moneys - total;
        //System.out.println("total is "+total+"!"+"yu e is "+banlance);

    }
}
