package StudyOop.Day1.day2;

/**
 * Created by liuhaoran1 on 2017/4/17.
 */
public class TestThis {
    String name;
    int id;

    public TestThis(){
        System.out.println("构造一个对象");
    }

    public TestThis(String name,int id){
        this(); //通过this调用其他构造方法，必须位于第一句。
        this.name = name;
        this.id = id;
    }

    public void study(){
        this.name = "sss";          //this 使用于方法内，指代当前对象
        System.out.println(name + "stduy");
    }

    public void sayHello(String sname){
        System.out.println(name + "to"+sname+"sayhello");
    }
}

