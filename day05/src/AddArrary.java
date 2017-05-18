//实现数组的扩容
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
public class AddArrary {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<5;i++){
            a[i] = (int)(Math.random()*100);
        }
//        for (int j=0;j<5;j++){
//            System.out.println(a[j]);
//        }
        //System.out.println("============");
       //int[] a1 = Arrays.copyOf(a,a.length+1);
        a = Arrays.copyOf(a,a.length+5);
        //System.out.println(a);
        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
