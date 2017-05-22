/*
 * Created by liu on 21/05/2017.
 */
//冒泡排序
public class BubbleOfSort {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0 ; i < a.length;i++){
            a[i] = (int)(Math.random()*100);
        }
        long time1 = System.currentTimeMillis();  //记录开始时间
        for (int j = 0;j < a.length-1;j++){       //确定需要排序的轮数
            for (int x = 0;x < a.length-1-j;x++){  //确定每轮需要拍多少次
                if (a[x] > a[x+1]){   //元素的交换
                    int t = a[x];
                    a[x] = a[x+1];
                    a[x+1] = t;
                }
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("use time "+(time2 -time1));
        for (int y = 0; y < a.length;y++){
           System.out.println(a[y]);
        }

    }
}
