/**
 * Created by liuhaoran1 on 2017/4/12.
 */
public class Test_For {
    public static void main(String[] args) {
        int i;
        int EvenSum = 0;  //偶数和
        int OddSum = 0;  //奇数和
        for (i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                EvenSum +=i;
            }
            else {
                OddSum+=i;
            }
        }
        System.out.println("EVENT Sum is:"+EvenSum);
        System.out.println("Odd Sum is:"+OddSum);
    }
}
    /*
        sum = 0;
        i = 1;
        while (i<=100){
            System.out.println(i);
            i+=3;
            sum+=i;
        }
        System.out.println("for sum number is :"+sum);
        System.out.println("while done");
    }
}
*/