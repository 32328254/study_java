import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by liuhaoran1 on 2017/4/10.
 */
public class TestCase {
    public static void main(String[] args){
        char c1 = 'a';  //定义a
        int rand = (int)(26*Math.random());  //随机生成26字母，并转化成int
        System.out.println("#######################");
        System.out.println("random number is "+rand);
        System.out.println("#######################");
        char c2 = (char)(c1+rand);  //获得字符串
        System.out.println("random number is "+c2);
        switch (c2){  //利用case的穿透
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("this is vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("this is semivowel");
                break;
            default:
                System.out.println("this is consonant");
                break;
        }
    }
}
