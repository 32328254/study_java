import javafx.scene.control.SortEvent;

import java.util.Scanner;

/*
 * Created by liu on 10/05/2017.
 */
public class Score {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please input you score: " +
                "");
        double myScore = scan.nextDouble();
        if (myScore >= 90){
            System.out.println("Score is A,very good");
        }else if (myScore >=80 && myScore <90){
            System.out.println("Score is B,very well");
        }else if (myScore >=70 && myScore <80){
            System.out.println("Score is C,ok");
        }else if (myScore >=60 && myScore<70){
            System.out.println("Score is D,pass");
        }else {
            System.out.println("not pass,you are lowers");

        }
    }
}
