package StudyOop.Day1.day3.My.Call.Back;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.awt.*;

/**
 * Created by liuhaoran1 on 2017/4/21.
 */
public class MyFrame {
    public void paint(){
        System.out.println("把自己窗口画出来");
    }
}
class GameFrame01 extends MyFrame{
    @Override
    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("painting window");
    }
}
class GameFrame02 extends MyFrame{
    public void paint(){
        System.out.println("GameFrame02.paint()");
    }
}