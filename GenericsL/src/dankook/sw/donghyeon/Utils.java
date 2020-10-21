package dankook.sw.donghyeon;

public class Utils {
    public static Integer max(Integer first, Integer second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }
}
