package dankook.sw.donghyeon;

public class Main {

    public static void main(String[] args) {
        MyInt n1 = new MyInt("0b1010");
        MyInt n2 = new MyInt("0xA");
        MyInt n3 = n1.add(n2);
        System.out.println(n3.toString(8));

        System.out.println("-------------------");
        MyInt n4 = n3.subtract(n1);
        System.out.println("2진법 : " + n4.toString());
        System.out.println("8진법 : " + n4.toString(8));
        System.out.println("10진법 : " + n4.toString(10));
        System.out.println("16진법 : " + n4.toString(16));
        System.out.println("-------------------");

        MyInt n5 = new MyInt("123");
        System.out.println("2진법 : " + n5.toString(2));
        System.out.println("8진법 : " + n5.toString(8));
        System.out.println("10진법 : " + n5.toString());
        System.out.println("16진법 : " + n5.toString(16));
        System.out.println("-------------------");
    }
}
