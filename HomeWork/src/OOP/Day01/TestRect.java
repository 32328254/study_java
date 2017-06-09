package OOP.Day01;/*
 * Created by liuhaoran1 on 2017/6/9.
 */

//创建测试方法
public class TestRect {
    public static void testNew(){
        Rect r1 = new Rect();
        Rect r2 = new Rect();
        r1.x = 100;
        r1.y = 200;
        r1.width = 50;
        r1.height =60;
        System.out.println(r1);
        r2.x = 300;
        r2.y = 100;
        r2.width = 60;
        r2.height = 80;
        System.out.println(r2);
    }
    public static void testEquals(){
        Rect r1 = new Rect();
        r1.x = 100;
        r1.y = 200;
        System.out.println(r1);


        Rect r2 = new Rect();
        r2.x = 100;
        r2.y = 200;
        System.out.println(r2);
        System.out.println("-----------");
        System.out.println(r1==r2); //不能判断对象属性是否相等

        Rect r3 = new Rect();
        r3.y = 400;
        r3.x = 300;
        System.out.println(r3);
        System.out.println(r1);
    }
    public static void main(String[] args) {
        //testNew();//调用
        testEquals();
    }
}
