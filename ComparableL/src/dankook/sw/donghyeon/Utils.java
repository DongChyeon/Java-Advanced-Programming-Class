package dankook.sw.donghyeon;

public class Utils {
    public static void displayElement(int val) {
        System.out.println(val);
    }

    public static <T extends Number> void displayGenericElement(T val) {
        System.out.println(val);
    }

    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public static <T extends Comparable<T>> T genericMax(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static void main(String[] args) {
        displayElement(1);
        displayGenericElement(3.14);
    }
}
