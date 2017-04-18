package StudyOop.Day1.day2;

import java.util.Scanner;

/**使用构造器创建一个三维坐标
 * Created by liuhaoran1 on 2017/4/16.
 */
class inputValue{
    int i = 1;
    public int value() {
        while (i <= 3) {
            System.out.print("please input "+i+" value:");
            Scanner value = new Scanner(System.in);
            int value1 = value.nextInt();
            System.out.println(value1);
            i++;
            //return value1;
        }
        return 0;
    }
}
public class TestPoint {
    double x,y,z;
    //使用构造器初始化对象属性
    public TestPoint(double _x,double _y,double _z){
        x = _x;
        y = _y;
        z = _z;
    }
    /*
    设置三个坐标的值
    */
    public void setX(double _x){
        x = _x;
    }
    public void setY(double _y){
        y = _y;
    }
    public void setZ(double _z){
        z = _z;
    }
    /*
    接收键盘输入的值,并返回
    */
    public double inputValue(){
        System.out.print("please input value:");
        Scanner value = new Scanner(System.in);
        double value1 = value.nextInt();
        return value1;
    }
    //计算两点之间的距离
    public double distance(TestPoint p){
        double result = Math.sqrt((x - p.x)*(x - p.x)+(y - p.y)*(y - p.y)+(z  - p.z)*(z - p.z));
        return result;
    }

    public static void main(String[] args){
        inputValue aa = new inputValue();
        int b = aa.value();
        //System.out.println("this is b p input: ");
        TestPoint point1 = new TestPoint(1,2,3);
        System.out.println("x = "+ point1.x + "x = "+point1.y + "z = "+point1.z);
        point1.setX(4); //x坐标赋值
        TestPoint point2 = new TestPoint(4,3,4);
        double v = point1.distance(point2);
        System.out.println("two point distance is "+v);

        //调用用户输入方法

        //double ab = point1.inputValue();
        System.out.println("value is "+aa);
    }
}
