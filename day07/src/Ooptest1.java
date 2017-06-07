import java.util.Scanner;

/*
 * Created by liu on 08/06/2017.
 */
class test{
    public static class Emp{  //对数据进行封装
        String name;
        int age;
        public void printinfo(){ //方法
            System.out.println("welcome "+name);
            System.out.println("you age is "+age);
            if (age > 18){
                System.out.println(name+" you are grow up ");
            }else{
                System.out.println(name+" you are baby");
            }
        }
    }
}
public class Ooptest1 {
    public static void main(String[] args) {
        test.Emp e = new test.Emp();
        Scanner scan = new Scanner(System.in);
        System.out.print("please input you name: ");
        e.name = scan.next();
        System.out.print("please inout you age: ");
        e.age = scan.nextInt();
        e.printinfo();
    }

}
