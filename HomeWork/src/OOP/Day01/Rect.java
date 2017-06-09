package OOP.Day01;/*
 * Created by liuhaoran1 on 2017/6/9.
 */
//定义rect大小
public class Rect {
    int x;
    int y;
    int width;
    int height;
    //定义修改位置方法
    public void setLocation(int x1,int y1){
        x = x1;
        y = y1;
    }
    //定义修改大小方法
    public void setSize(int w,int h){
        width = w;
        height = h;
    }
    //输出对象的文本描述，方便调试
    public String toString(){
        return "x = "+x+","+" y = "+y+", "+"width="+width+", "+"height="+height;
    }
}
