package oo.day01;

/*
 * Created by liu on 11/06/2017.
 */
public class CellTest {
    public static void main(String[] args) {
        Cell c = new Cell();
        c.col = 2;
        c.row = 2;
        c.drop();
        c.moveLeft(3);
        System.out.println(c.getCellInfo());
    }
}
