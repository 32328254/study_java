import java.util.Scanner;

/*
 * Created by liu on 11/05/2017.
 */
public class TestSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please input you salary: ");
        double salary = scan.nextDouble();
        double taxsalary = salary - 3500;
        double tax =0;
        if (taxsalary <= 0){
            tax = 0;
            System.out.println("dont tax");
        }else if (taxsalary <= 1500){
            tax = taxsalary * 0.03 -0;
        }else if (taxsalary <=4500){
            tax = taxsalary * 0.1 - 105;
        }else if (taxsalary <= 9000){
            tax = taxsalary * 0.2 - 555;
        }else
            tax = taxsalary * 0.25 - 1005;
        System.out.println("tax= "+tax);
    }
}
