/*
*九九乘法表
**/
public class WhileDemo {
    public static void main(String[] args) {
        for (int i=0;i<=9;i++){
            for (int j=0;j<=i;j++){
                System.out.print(i+" * "+j+"= "+i*j+"\t");
            }
            System.out.println();
        }
    }
}
