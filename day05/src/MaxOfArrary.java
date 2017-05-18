public class MaxOfArrary {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100-1);
        }
        //查找数组中最大值
        int max = arr[0];  //假设第一个元素为最大值
        int least = arr[0];  //假设第一个元素为最大值
       for (int j = 1;j<arr.length;j++){ //遍历剩余元素
           if (arr[j] > max){ //若剩余元素大于max值
               max = arr[j];  //把最大值赋值给max
           }
       }
       System.out.println("max = "+max);
        //求最小值
        for (int z = 1;z<arr.length;z++){
            if (arr[z] < least){
                least = arr[z];
            }
        }
        System.out.println("least = "+least);
        //遍历输出元素
//        for (int i=0;i<arr.length;i++){
//            System.out.println(i+"="+arr[i]);
//        }
    }
}
