package StudyOop.Day1.day3;

/**
 * Created by liuhaoran1 on 2017/4/17.
 */
public class TestExtends {
        String eye;
        public void run(){
            System.out.println("run!!");
        }
        public void eat(){
            System.out.println("eat!!");
        }
        public void sleep(){
            System.out.println("zzzzzz~");
        }
    }

class Mannal extends TestExtends{   //继承
    public void taisheng(){
        this.eat();
        this.run();
        System.out.println("taisheng");
    }
    public void eat(){   //重写
        System.out.println("this is override");
    }
}
