/**
 * Created by liuhaoran1 on 2017/5/3.
 */
public class ForNumber {
    public static void main(String[] args){
        for (int i=0;i<=11;i++){
            System.out.print("/data"+i+"/hadoop/tmp"+",");
        }
        System.out.println();
        for (int j=0;j<=11;j++){
            System.out.print("/data"+j+"/hadoop/namedir"+",");
        }
        System.out.println();
        for (int z=0;z<=11;z++){
            System.out.print("/data"+z+"/hadoop/data"+",");
        }
        System.out.println();
        for (int a=0;a<=11;a++){
            System.out.print("/data"+a+"/hadoop/data0"+",");
        }
        System.out.println();
        for (int b=0;b<=11;b++){
            System.out.print("/data"+b+"/hadoop/name0"+",");
        }
        System.out.println();
        for (int b=0;b<=11;b++){
            System.out.print("/data"+b+"/hadoop/yarn-local"+",");
        }
        System.out.println();
        for (int c=0;c<=11;c++){
            System.out.print("'/data"+c+"',");
        }
    }
}
