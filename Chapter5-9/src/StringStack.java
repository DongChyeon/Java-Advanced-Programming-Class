public class StringStack implements Stack {
    private String[] elem;
    private int top;

    public StringStack(int capacity) {
        elem = new String[capacity];
        top = -1;
    }

    @Override
    public int length() {
        return top + 1;
    }

    @Override
    public int capacity() {
        return elem.length;
    }

    @Override
    public String pop() {
        if (top == -1) {
            System.out.println("스택이 비어 있습니다.");
            return null;
        }
        return elem[top--];
    }

    @Override
    public boolean push(String val) {
        if (top == elem.length - 1) {
            return false;
        }
        elem[++top] = val;
        return true;
    }
}
