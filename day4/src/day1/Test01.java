package day1;

/**
 * Created by liuhaoran1 on 2017/4/24.
 */
public class Test01 {
    public static void main(String[] args ){
        //数组两种声明格式
        int [] a;
        int b[];
        //创建数组对象
        a = new int[4];
        b = new int[5];
        //初始化（对数组元素的初始化）
        //默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样，数字0，布尔false，char\u0000，引用null
        //动态初始化：
        for (int i=0;i<a.length;i++){
            a[i] = i * 12;
            System.out.println(a[i]);
        }
        //静态初始化
        int c[] = {12,23,34,54,65}; //长度是4.索引范围是[0,3]
        //引用
        Car cars[] = {new Car("ssd"),
                      new Car("dsf")
        };
    }
}
