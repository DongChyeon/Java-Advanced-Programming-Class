package dankook.sw.donghyeon;

public class ConsoleApp {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        System.out.println(a1.toString());  // 타입 + 주소 기반 정수
        System.out.println(a1.hashCode());  // 객체의 내용을 정수로 맵핑

        SavingAccount s1 = new SavingAccount(200000, 0.05);
        s1.deposit(1000);
        s1.generateInterest();
        System.out.println(s1.getBalance());

        Account a2 = new SavingAccount(300000, 0.02);
        System.out.println(a2.toString());

//        SavingAccount s2 = (SavingAccount) a1;
//        s2.generateInterest();

        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
