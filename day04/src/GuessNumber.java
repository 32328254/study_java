import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Random;
import java.util.Scanner;

/*
 * Created by liu on 14/05/2017.
 */
public class GuessNumber {
    public static void main(String[] args) {

        while (true){
            //让用户输入一个整数
            Scanner scan = new Scanner(System.in);
            System.out.print("please input number: ");
            int number = scan.nextInt();
            //随机生成一个整数
            Random rand = new Random();
            int a = rand.nextInt(10);
            System.out.println("random number is "+a);
            //判断用户是否想退出
            if (number==0){
                System.out.println("bye bye");
                break;
             //判断用户是否猜大了
            }else if (number > a){
                System.out.println("guess bigeer...");
            }
            //判断用户是否猜小了
            else if (number < a){
                System.out.println("guess small...");
            }
            //判断用户是否猜正确了
            else if (number == a){
                System.out.println("very good,you guess right!!!  can you still playing?<100:playing,other number:quit>");
                Scanner s = new Scanner(System.in);
                int i = s.nextInt();
                //int i = 100;
                if (i == 100){
                    System.out.println("that good,let me playing agen");
                    //return;
                }else {
                    System.out.println("bye bye");
                    break;
                }
            }
        }
    }
}