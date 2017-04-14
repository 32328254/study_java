import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuhaoran1 on 2017/4/10.
 */
public class TestDate {
    public static void main(String[] args){
        long time = Long.parseLong("1491815712000");
        Date date = new Date(time);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        System.out.println(str);
    }
}
