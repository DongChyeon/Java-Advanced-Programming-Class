package dankook.sw.donghyeon;

public class Test {
    static <T> void genericsDisplay (T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericsDisplay(11);
        genericsDisplay("GeeksForGeeks");
        genericsDisplay(1.0);
    }
}
