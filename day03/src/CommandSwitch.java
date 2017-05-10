/*
 * Created by liuhaoran1 on 2017/5/10.
 */
import java.util.Scanner;
public class CommandSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please change function (1:all,2:select,0:exit): ");
        int command = scan.nextInt();
        switch (command){
            case 1:
                System.out.println("all");
                break;
            case 2:
                System.out.println("select");
                break;
            case 0:
                System.out.println("bye");
                break;
            default:
                System.out.println("abnormity");
                break;
        }
    }
}
