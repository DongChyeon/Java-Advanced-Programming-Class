package dankook.sw.donghyeon;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("임영웅", "lim@dankook.ac.kr");
        ArrayList<Student> sList = new ArrayList<>();
        sList.add(s);
        Student s2 = new Student("장민호", "chang@gmail.com");
        sList.add(s2);
        Collections.sort(sList);
        System.out.println(Utils.genericMax(s, s2));
    }
}
