import java.util.Scanner;

/*
 * Created by liuhaoran1 on 2017/5/10.
 */
public class MySwitch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input number: ");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("you input number is 1");
                break;
            case 2:
                System.out.println("you input number is 2");
                break;
            case 3:
                System.out.println("you input number is 3");
                break;
            default:
                System.out.println("you input is "+num);
                break;
        }
    }
}
