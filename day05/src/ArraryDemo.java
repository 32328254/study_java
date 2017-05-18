/*
 * Created by liuhaoran1 on 2017/5/18.
 */
public class ArraryDemo {
    public static void main(String[] args) {
        //数组的定义
//        int[] arr0 = new int[10];
//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr2;
//        arr2 = new int[]{11,2,34,5};
        //给数组元素赋值
        int[] arr = new int[100];
        for (int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        //遍历数组
        for (int j=0;j<arr.length;j++){
            System.out.println("arr"+j+"="+arr[j]);
        }
    }
}
