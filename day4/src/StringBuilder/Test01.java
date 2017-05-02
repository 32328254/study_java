package StringBuilder;

/**
 * Created by liuhaoran1 on 2017/4/27.
 */
public class Test01 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(32);  //可变字符串
        StringBuilder sb2 = new StringBuilder("abcd");
        sb2.append("edf");
        sb1.append(true).append(321).append("dsfdf");
        System.out.println(sb+"\n"+sb1+"\n"+sb2+"\n");
        StringBuilder gh = new StringBuilder("a");
        for (int i = 0; i<=10;i++){
            gh.append(i);   //数组扩容，当容量不够时，用新创建出来的数组copy老的数组
            System.out.println(i+":"+gh);
        }
        //gh.delete(0,2);  //顾头不顾尾
        System.out.println(gh);
        gh.replace(0,5,"er");  //替换
        System.out.println(gh);
        gh.insert(1,"sasda");  //插入
        System.out.println(gh);
        gh.reverse();      //翻转
        System.out.println(gh);
        gh.delete(0,2);   //删除
        System.out.println(gh);
        gh.indexOf("se");
        System.out.println(gh);
    }
}
