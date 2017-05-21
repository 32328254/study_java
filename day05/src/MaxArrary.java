/*
 * Created by liu on 20/05/2017.
 */
import java.util.Arrays;
public class MaxArrary {
    public static void main(String[] args) {
        //数组a中随机生成n个元素
        int[] a = new int[5];
        for (int i = 0;i < a.length;i++){
            a[i] = (int)(Math.random()*100);
        }
       for(int j = 0;j<a.length;j++){
            System.out.println(a[j]);
        }
        //查找数组元素中最大的值
        int max =0;
        max = a[0];
        for (int x = 1;x<a.length;x++){
            if (max < a[x]){
                max = a[x];
            }
        }
        System.out.println("max = "+max);
        //最大元素放在最后数组元素的下个位置
        a = Arrays.copyOf(a,a.length+1);
        //System.out.println(a.length);
        a[a.length-1] = max;
        System.out.println(a[a.length-1]);
    }

}
