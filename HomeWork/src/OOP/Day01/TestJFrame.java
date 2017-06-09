package OOP.Day01;
/*
 * Created by liuhaoran1 on 2017/6/9.
 */
import javax.swing.JFrame;
import java.awt.*;

public class TestJFrame {
    public static void testSizeAndLocation() {
       JFrame frame = new JFrame();
       frame.setSize(500, 600);
       frame.setTitle("TestFrame");
       frame.setLocation(450, 100);
       frame.setVisible(true); //在桌面显示一个窗口使用setVisible(true)方法，如果参数是false就是关闭窗口对象
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       System.out.println("program closed");
    }
    public static void testSizeAndCenter(){ //窗口中心方法
        JFrame frame = new JFrame();
        frame.setSize(500,600);
        frame.setTitle("TestFrameCenter");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //获取屏幕大小width,height
        frame.setLocation((screen.width - frame.getWidth())/2,(screen.height - frame.getHeight())/2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    testSizeAndLocation();
    testSizeAndCenter();
    }
}
