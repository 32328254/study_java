import java.util.Scanner;

//质数：只能被1和它本身整除
public class OnePrimeNumber {
    public static void main(String[] args) {
//        int a = 7 % 2;
//        System.out.println(a);

        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("please input number: ");
        int a = scan.nextInt();
        Long time1 = System.currentTimeMillis();
        //循环2-number是否是质数
        for (int y = 2;y <= a;y++){
            boolean b = false; //默认不是质数
            //判断除了1和它本身之间所有的数是否被整除
            //for (int x = 2; x < y;x++ ){
            //for (int x = 2; x <=y/2;x++){  //优化,元素的一半就能出结果
            for (int x = 2; x<=Math.sqrt(a);x++){ //三次优化,平方
               if (y % x == 0){
                   //是质数
                   b = true;
            }
        }
            if (b == false){
               System.out.print(y+" 是质数.\t");
               sum++;
               //int sum = 0;
                //每10个元素输出一行
               if (sum % 10 == 0 ){
                   System.out.println();
               }
             }
//            else {
//                System.out.print(y+" 不是质数.\t");
//                sum++;
//                //每10个元素输出一行
//                if (sum % 10 == 0){
//                    System.out.println();
//                }
//            }
        }
        Long time2 = System.currentTimeMillis();
        System.out.println("use time "+(time2 - time1));
    }
}
