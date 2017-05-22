import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] a = new int [10];
        //随机生成数组的元素
       for (int i = 0;i<a.length;i++){
           a[i] = (int)(Math.random() *100);
       }
       //求最小值
        int min = a[0];
        for (int j = 1;j<a.length;j++){
            if (min > a[j]){
                int t = min;
                min = a[j];
                a[j] = t;
            }
        }
        System.out.println(min);
        int[] b = new int [a.length+1];
        //数组元素复制
        System.arraycopy(a,0,b,1,a.length);
        b[0] = min;
        //数组排序
        Arrays.sort(b);
        for (int x = 0;x<b.length;x++){
            System.out.println(b[x]);
        }
    }
}
