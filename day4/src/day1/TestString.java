package day1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by liuhaoran1 on 2017/4/24.
 */
public class TestString {
    public static void main(String[] args){
        String str = "abcd";
        String str2 = "abcd";
        System.out.println(str.charAt(1));  //查看下标对应的字符
        System.out.println(str.equals(str2));  //比较
        System.out.println(str==str2);

        String str3 ="def";
        String str4 ="def";
        System.out.println(str3.equals(str4));
        System.out.println(str3==str4);
        System.out.println(str.indexOf('a'));     //查看字符对应的下标
        String str5 = "ssss";
        System.out.println(str5.replace("s","a"));   //替换
        String str6 = "adsd,asda,efref,trg,,yht";
        String str6Arrary [] = str6.split(",");  //切割
        for (int i=0;i<str6Arrary.length;i++){
            System.out.println(str6Arrary[i]);
        }
        String str7 = "  sdsd  fsdf    ";
        System.out.println(str7);
        System.out.println(str7.trim());   //去首尾空格
        System.out.println("Abcdbb".lastIndexOf("b"));
        System.out.println("Abcdbb".startsWith("Ab"));  //是否以Ab开头
        System.out.println("Abcdbb".endsWith("bb"));  //是否以bb结尾
        System.out.println("Abcdbb".toLowerCase());    //大写转成小写
        System.out.println("asdasa".toUpperCase());    //小写转成大写
    }
}