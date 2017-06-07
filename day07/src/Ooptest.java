import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/*
 * Created by liu on 08/06/2017.
 */
public class Ooptest {
    public static class Emp{  //对数据进行封装
        String name;
        int age;
    }
    public static void printinfo(Emp E){ //方法
        System.out.println("welcome "+E.name);
        System.out.println("you age is "+E.age);
        if (E.age > 18){
            System.out.println(E.name+" you are grow up ");
        }else{
         System.out.println(E.name+" you are baby");
        }
    }
    public static void main(String[] args) {
        Emp e = new Emp();
        //e.age = 25;
        //e.name= "zhangsan";
        //printinfo(e);
        Scanner scan = new Scanner(System.in);
        System.out.print("please input you name: ");
        e.name = scan.next();
        System.out.print("please inout you age: ");
        e.age = scan.nextInt();
        printinfo(e);
    }
}
