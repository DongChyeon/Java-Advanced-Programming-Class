package dankook.sw.dongchyeon;

public class ExceptionExample {
    public static void test1() {
        test2(null);
    }
    public static void test2(String message) {
        System.out.println(message.toUpperCase());
    }
}
