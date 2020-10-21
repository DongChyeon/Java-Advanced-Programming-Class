package dankook.sw.donghyeon;

public class BadNumberException extends Exception {
    public BadNumberException() {
        super("Divide by zero");
    }

    public BadNumberException(String s) {
        super(s);
    }
}
