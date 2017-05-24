public class MethodDemo {
    public static void main(String[] args) {
    Say();  //方法调用
    SayHi("harry");//有参方法调用,类型和
    System.out.println("over");
    }
    //无参无返回值方法
    public static void Say(){
        System.out.println("hello everybody");
    }
    //有参无返回值方法
    public static void SayHi(String name){
        System.out.println("hello,my name is "+name);
    }
    //有参有返回值方法
    public static double getNumber(double a,double b){
        double c = a + b;
        return c;
    }
}
