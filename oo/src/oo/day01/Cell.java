package oo.day01;

/*
 * Created by liu on 11/06/2017.
 */
public class Cell {
    int row;//行
    int col;//列
    public void drop(){ //自由下落1的方法
        row++;

    }
    public void moveLeft(int n){ //左移方法
        col -= n;
    }
    String getCellInfo(){   //获取行列
        return row+","+col;
    }
}
