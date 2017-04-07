/**
 * Created by liuhaoran1 on 2017/4/6.
 */
public class TestCast {
    public static void main(String[] args) {
        byte b = 123;
        //byte a = 222;  //超出范围
        char c2 = 'a';
        int i = c2;
        int i2 = 100;
        char c3 = (char)i2; //强制转型
        System.out.println(i);
        System.out.println(b);
        System.out.println(c3);
    }
}
