/*
数组的copy方法
 */
public class ArraryCopy {
    public static void main(String[] args) {
        //定义数组的长度为100
        int[] arr = new int[100];
        int[] arr1 = new int[100];
        //给数组随机赋值
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            //System.out.println(arr[i]);
        }
        //把arr数组中从第0个元素开始复制到arr1的数组中去，复制50个元素
        System.arraycopy(arr,0,arr1,0,50);  //数组的复制
        //输出
        for (int j =0;j<50;j++) {
            System.out.println(j+"="+arr1[j]);
           }
    }
}
