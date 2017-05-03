/**
 * Created by liuhaoran1 on 2017/5/2.
 */
public class DataTyoeDemo {
    public static void main(String[] args){
//        double a = 3.0;
//        double b = 2.9;
//        System.out.println(a-b);
//        double d = 6.0;
//        double e = 4.9;
//        System.out.println(d-e);
//        int a = 250;
//        System.out.println("5/2="+5/2);
//        System.out.println("2/5="+2/5);
//        //int b = 10000000000;
//        int c = 2147483647;
//        c=c+1;
//        System.out.println(c);
//        //Long d = 10000000000;
//        Long e = 10000000000L;
//        Long f = 1000000000*2*10L;
//        System.out.println(f);
//        Long g = 1000000000*3*10L;
//        System.out.println(g);
//        Long h = 1000000000L*3*10;
//        System.out.println(h);
//        Long i = System.currentTimeMillis();
//        System.out.println(i);
//        //float j = 3.14;
//        float k,l;
//        k= (float) 6.0;
//        l= (float) 4.9;
//        System.out.println(k-l);

        /*boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println('2'+'2');//char类型转化首先把char类型转换成int再计算
        System.out.println('2'+2);
        */
        int a = 250;
        long b = a;
        int c = (int) b;
        long d = 250;
        float e = 250;
        System.out.println(e);
        long f = 10000000000L;
        int g = (int) f;
        System.out.println(g);
        float h = (float) 25.98;
        int i = (int) h;
        System.out.println(i);
        byte b1 = 5;
        byte b2 = 6;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);


    }
}
