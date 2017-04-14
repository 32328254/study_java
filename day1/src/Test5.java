/**
 * Created by liuhaoran1 on 2017/4/12.
 */
/*
* 输出1-1000之间能被5整除的数，且每行输出3个。
* */
public class Test5 {
    public static void main(String[] args){
        int i;
        int number = 0;
        for (i=0;i<=1000;i++){
            if (i % 5 == 0){
                System.out.print(i+"\t"); //不换行打印能被5整除的数
            }
            if(i % 15 == 0 ){
                System.out.println(); //每三个数字换行
            }
        }
    }
}
