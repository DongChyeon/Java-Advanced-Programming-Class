package dankook.sw.donghyeon;

import java.util.Scanner;

public class main {

    public static class MyInteger {
        public int val;

        public MyInteger(int v) {
            val = v;
        }

        @Override
        public String toString() {
            return "MyInteger{" +
                    "val=" + val +
                    '}';
        }
    }

    public static void increaseInt(Integer n) {
        n += 1;
    }

    public static void increaseMyInt(MyInteger mInt) {
        mInt.val += 1;
    }

    public static boolean isInteger(String s) {
        try {
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        Integer n1 = Integer.valueOf(10);
//        System.out.println(n1);
//        increaseInt(n1);
//        System.out.println(n1);
//
//        MyInteger n2 = new MyInteger(100);
//        System.out.println(n2);
//        increaseMyInt(n2);
//        System.out.println(n2);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = 0;
        String s = sc.nextLine();
        while (!isInteger(s)) {
            System.out.print("잘못된 정수 포맷!!. 정수 다시 입력 : ");
            s = sc.nextLine();
        }
        n = Integer.parseInt(s);
        System.out.println(n);
    }
}
