import java.io.*;

/**
 * Created by liuhaoran1 on 2017/5/8.
 */
public class ReadAndwriteFile {
    //创建一个读文件的方法
    public static String readFileByLines(String fileName){
        File file = new File(fileName);
        BufferedReader reader = null;
        String tempString = null;
        try {
            //System.out.println("以行为单位读取文件内容,一次读一行: ");
            reader = new BufferedReader(new FileReader(file));
            int line = 0;
            //一次读取一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null){
                //显示行号
                //System.out.println("line "+line+": " +tempString);
                System.out.println(tempString);
                return tempString;
//                line++;
            }
            for (int j=0;j<5;j++){
                System.out.println(reader.readLine());
            }
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
            return e.getMessage();
        }
        finally {
            if (reader == null){
                try {
                    reader.close();
                    return "close";
                }
                catch (IOException  e1){
                    return e1.getMessage();
                }
            }
        }
        return  tempString;
}
    //以追加的方式写文件
public static void appendMethodB(String writefilename,String content){
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示追加形式写文件
            FileWriter writer = new FileWriter(writefilename,true);
            System.out.println("!!!!!=-"+content);
            writer.write(content);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
public static void main(String[] args){

    String readfileName = "C:\\Users\\Administrator\\Desktop\\message\\messages";
        String f = readFileByLines(readfileName);
        System.out.println("ffff"+f);
        //String content = f;
        //appendMethodB("C:\\Users\\Administrator\\Desktop\\message\\test.txt",content);
    }
}
