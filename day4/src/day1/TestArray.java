package day1;

/**
 * Created by liuhaoran1 on 2017/4/23.
 */
public class TestArray {
    public static void main(String[] args){
        int [] a = new int[4];
        //String [] b = new String[4];
        for (int i=0;i<4;i++){
            a[i] = i;
            System.out.println(a[i]);
        }
        double [] b = new double[2];
        Car[] cars = new Car[4];
        cars[0] = new Car("as");
        cars[1] = new Car("re");
        cars[2] = new Car("sd");
        cars[3] = new Car("rr");
        for (int y=0 ;y<=3;y++){
            System.out.println(cars[y]);
            System.out.println(cars[y].name);
        }
        //cars[4] = new Car("efr");
        //cars[5] = new Car("asd");

        /*
        a[0] =0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        */
    }
}
