package StudyOop.Day1.day3.My.Call.Back;

/**
 * Created by liuhaoran1 on 2017/4/21.
 */
public class PaintFrame {
    public static void drawFrame(MyFrame f){
        System.out.println("start thread");
        System.out.println("add circulation");
        System.out.println("check message");
        f.paint();
        System.out.println("start cache ,add speed");
    }
    public static void main(String[] args){
        drawFrame(new GameFrame01());
        drawFrame(new GameFrame02());
    }
}
