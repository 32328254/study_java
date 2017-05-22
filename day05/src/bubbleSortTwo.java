public class bubbleSortTwo {
    public static void main(String[] args) {
        int[] arry = new int[100];
        //给数组随机赋值
        for (int i = 0; i < arry.length;i++){
            arry[i] = (int)(Math.random() * 100);
        }
        //给数组排序
        long time1 = System.currentTimeMillis();
        for (int x = 0; x < arry.length-1;x++){ //确定排序的轮数
            for(int y = 0;y < arry.length-1-x;y++){ //确定每个数比较的次数
                //比较并排序
                if (arry[y] < arry[y+1]){
                    int t = arry[y];
                    arry[x] = arry[y+1];
                    arry[y+1] = t;
                }
            }
        }
        long time2 = System.currentTimeMillis();
        //输出数组的元素
        for (int j = 0 ;j < arry.length;j++){
            System.out.println(j+" is "+arry[j]);
        }
        System.out.println("use time "+ (time2 - time1));
    }
}
