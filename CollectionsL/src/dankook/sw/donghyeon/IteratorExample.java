package dankook.sw.donghyeon;

import java.awt.*;
import java.util.Iterator;

public class IteratorExample implements Iterator<Point> {
    private Point[] ptData;
    private int index = 0;
    private int size;

    public IteratorExample() {
        ptData = new Point[4];
        ptData[0] = new Point(1,2);
        ptData[1] = new Point(2,3);
        ptData[2] = new Point(3,4);
        ptData[3] = new Point(4,5);
        size = 4;
    }

    @Override
    public boolean hasNext() {
        if (index < size) return true;
        else return false;
    }

    @Override
    public Point next() {
        return ptData[index++];
    }

    public static void main(String[] args) {
        IteratorExample example = new IteratorExample();
        while (example.hasNext()) {
            System.out.println(example.next());
        }
    }
}
