/**
 * Created by liuhaoran1 on 2017/5/4.
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input year: ");
        int year = scan.nextInt();
        System.out.println("you input year is :"+year);
        //调用ScoreLevel类
       /*
        ScoreLevel a = new ScoreLevel();
        a.Score();
        CommandBySwitch b = new CommandBySwitch();
        b.command();
        */
    }
}
class ScoreLevel {
    public void Score(){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input ScoreLevel: ");
        double score = scan.nextDouble();
        System.out.println("you input  ScoreLevel is :"+score);
    }
}

class CommandBySwitch {
    public void command(){
        Scanner scana = new Scanner(System.in);
        System.out.print("please input command: ");
        double sss = scana.nextInt();
        System.out.println("you input  ScoreLevel is :"+sss);
    }
}