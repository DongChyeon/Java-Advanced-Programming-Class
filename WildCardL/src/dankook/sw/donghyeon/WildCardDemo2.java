package dankook.sw.donghyeon;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends A {}

public class WildCardDemo2 {
    public static void main(String[] args) {
        A a = new B();
        A a2 = new C();

        List<A> listA = new ArrayList<>();
        insertElements(listA);
        List<Object> listObject = new ArrayList<>();
        insertElements(listObject);
        processElements(listA);
        processElements2(listA);
    }

    public static void processElements(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }

    public static void processElements2(List<? extends A> elements) {
        for (A a : elements) {
            System.out.println(a);
        }
    }

    public static void insertElements(List<? super A> list) {
        list.add(new A());
        list.add(new B());
        list.add(new C());
    }
}
