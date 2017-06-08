package oo.day01;

import java.util.zip.ZipInputStream;

/*
 * Created by liu on 08/06/2017.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student zhangsan = new Student();
        zhangsan.name = "zs";
        zhangsan.age = 18;
        zhangsan.address = "hebei";
zhangsan.sayHi();
zhangsan.study();
    }
}
