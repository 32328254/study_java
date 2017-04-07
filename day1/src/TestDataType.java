/**
 * Created by liuhaoran1 on 2017/4/6.
 */
public class TestDataType {
    public static void main(String[] args){
        int a = 0;
        byte b = 1;
        long c = 1000000000000000000L;
        float d = 3.15F;
        double e = 3.1415639;
        char f = 'a';
        int g = f + 2;
        char c5 = (char)g; //强制转换
        for (int i = 0;i<=10;i++){
            System.out.println(i);
            char temp = (char)(f+i);
            System.out.println(temp);
        }
        String str = "sdfsdfsfdsdf"; //字符串
        boolean s = true;   //boolean 类型
        if (s){
            System.out.println("true");
        }
        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(c5);
    }
}
