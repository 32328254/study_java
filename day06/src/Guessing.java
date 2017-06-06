/*
 * Created by liu on 01/06/2017.
 */
public class Guessing {
    public static void main(String[] args) {
        char[] chs = generate();
        System.out.println(chs);
    }

    //定义对比的方法
    public static int[] check(char[] chs, char[] input) { //检查字符数组方法
        int[] result = new int[2];
        for (int i = 0; i <= chs.length; i++) {       //循环随机数组
            for (int j = 0; j <= input.length; j++) { //循环
                if (chs[i] == input[j]) { //如果字符相等
                    result[0]++;  //字符个数加一
                    if (i == j) {     //如果位置相等
                        result[1]++; //位置加一
                    }
                    break;
                }
            }
        }
        return result; //返回对比的结果
    }

    //随机生成字符数组
    public static char[] generate() {
        char[] chs = new char[5];
        char[] letters = {'q', 'a', 'z', 'w', 'x', 's', 'e', 'c', 'd', 'r', 'f', 'v', 't', 'g', 'b', 'y', 'h', 'n', 'u', 'j', 'm', 'i', 'k', 'o', 'p', 'l'};
        boolean[] flags = new boolean[letters.length];//生成26字母的下表数组，默认我false
        for (int i = 0; i < chs.length; i++) {
            int index;
            do {
                index = (int) (Math.random() * 25);//随机生成一个0-25的数字
            } while (flags[index] == true);//如果下表为true，则继续循环
            chs[i] = letters[index]; //获取字符
            flags[index] = true; //下表修改为true
        }
        return chs;
    }
}
