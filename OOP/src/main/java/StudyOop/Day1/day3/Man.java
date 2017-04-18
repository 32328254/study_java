package StudyOop.Day1.day3;

/**
 * Created by liuhaoran1 on 2017/4/18.
 */
public class Man {
    private boolean man;
    private String name; //定义属性为私有
    private String id;
    public static int cc;  //定义静态变量为公有
    public static final int MAX_SPEED = 120;  //定义常量问公有
    public void setMan(boolean man){  //boolean 类型
        this.man = man;
    }
    public boolean isMan(){  //boolean类型get方法是is
        return man;
    }
    public String getName(){  //设置get方法，属性首字母大写
        return name;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){   //设置set方法，属性首字母大写
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
}
