package dankook.sw.donghyeon;

public class MyVector<T> {
    private T[] items;
    private int count;

    public MyVector() {
        items = (T[]) new Object[10];
        count = 0;
    }

    private void add(T val) {
        items[count] = val;
        count++;
    }

    public T get(int index) {
        return items[index];
    }

    public static void main(String[] args) {
        MyVector<Integer> iV = new MyVector<>();
        iV.add(1);
        iV.add(10);
        System.out.println(iV.get(1));
    }
}
