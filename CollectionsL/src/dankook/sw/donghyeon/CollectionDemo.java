package dankook.sw.donghyeon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Point implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        return (this.x + this.y) - (o.x + o.y);
    }
}

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(7);
        iList.add(3);
        iList.add(10);
        System.out.println("iList의 크기 = " + iList.size());
        for (int i : iList) {
            System.out.println(i);
        }

        Collections.sort(iList);
        System.out.println("iList의 크기 = " + iList.size());
        for (int i : iList) {
            System.out.println(i);
        }

        ArrayList<Point> pList = new ArrayList<>();
        pList.add(new Point(1, 3));
        pList.add(new Point(3, 1));
        pList.add(new Point(-1, 0));
        for (Point i : pList) {
            System.out.println(i);
        }

        Collections.sort(pList);
        for (Point i : pList) {
            System.out.println(i);
        }

        Iterator<Point> iterator = pList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
