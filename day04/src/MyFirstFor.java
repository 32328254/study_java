import java.net.SocketPermission;

/*
 * Created by liu on 14/05/2017.
 */
public class MyFirstFor {
    public static void main(String[] args) {
        int age = 1;
        while (age <= 100){
            System.out.println(age+" have money");
            age++;
        }
        System.out.println("game over");
    }
}
