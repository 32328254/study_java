/*数组排序，默认升序排列
* */
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0;i< a.length;i++){
            a[i] = (int)(Math.random()*100);
        }
        long time1 = System.currentTimeMillis();
        Arrays.sort(a); //升序排序
        long time2 = System.currentTimeMillis();
        for (int x = a.length-1 ;x >= 0;x--){
            System.out.println(a[x]);
        }
        System.out.println("use time "+(time2 - time1));
    }
}
