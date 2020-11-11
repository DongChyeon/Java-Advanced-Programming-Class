import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

// 학번 (      32190473             )  이름 (          김동현            )

// 1. ===============================
// 1.a) MyPoint0 클래스의 구현
class MyPoint3 extends Point implements Comparable<MyPoint3> {
    public MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move3(int x, int y) {
        this.x += x;
        this.y += y;
    }

// 1.b) toString() 메소드의 구현

    @Override
    public String toString() {
        return "MyPoint3[" + x + ", " + y + "]";
    }

// 1.c)

    @Override
    public int compareTo(MyPoint3 object) {
        return Math.abs(this.x) + Math.abs(this.y) - ((Math.abs(object.x) + Math.abs(object.y)));
    }

}
// 2 ===========================================
// 2.d)
class Utils {
    static <T extends MyPoint3> int compare(T val1, T val2) {
        return val1.compareTo(val2);
    }
}
// 3 ======================================
class Order3 {
    private int orderNumber3;
    private String customerName3;
    private String orderDate3;
    private double orderAmount3;
    // 3.a) 다음의 생성자를 문제의 요구대로 수정하세요. 3.b),3.c)는 main에 있음.
    public Order3(String orderNumber, String customerName, String orderDate, String orderAmount) throws NumberFormatException {
        this.orderNumber3 = Integer.parseInt(orderNumber);
        this.customerName3 = customerName;
        this.orderDate3 = orderDate;
        this.orderAmount3 = Double.parseDouble(orderAmount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber3 +
                ", customerName='" + customerName3 + '\'' +
                ", orderDate='" + orderDate3 + '\'' +
                ", orderAmount=" + orderAmount3 +
                '}';
    }
}

// 5 ============================================
class OrderMgt3{
    private List<Order3> orderList3;
    public OrderMgt3(){
        orderList3 = new ArrayList<>();
    }

    // 5.a)
    public boolean getDataFromFile3(String fileName){
        try (FileReader reader = new FileReader(fileName);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                orderList3.add(new Order3(line[0], line[1], line[2], line[3]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    // 5.b)
    public void displayOrders3() {
        Iterator<Order3> iterator = orderList3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


public class 김동현3 {
    public static void main(String[] args) {
// 주의: 1.은 MyPoint0 클래스에서 답하세요.
// 2 =============================================================
// 2.a)
        MyPoint3 p = new MyPoint3(3, -4);
        p.move3(-3, 5);
        System.out.println(p);

// 2.b)
        List<MyPoint3> listP = Arrays.asList(new MyPoint3(-1, 5), new MyPoint3(2, 1), new MyPoint3(4, -1));
        System.out.println(listP);

// 2.c)
        if (listP.get(0).compareTo(listP.get(1)) > 0) {
            System.out.println("크다");
        } else {
            System.out.println("크지 않다");
        }

// 주의: 2.d)는 Utils 클래스에 답하세요.


// 2.e)
        if (Utils.compare(listP.get(0), (listP.get(1))) > 0) {
            System.out.println("크다");
        } else {
            System.out.println("크지 않다");
        }


// 3 =============================================================
// 주의: 3.a)는 Order0 클래스에서 답하세요.
// 3.b)
        Order3 order1 = new Order3("1", "김동현", "2020-10-26", "3");
        System.out.println(order1);

// 3.c)
        try {
            Order3 order2 = new Order3("12d", "김동현", "2020-10-26", "3");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

// 4 ==============================================================
// 4.a)
        /*
        List<T>의 컬렉션 객체에 T 또는 T의 자손 클래스의 컬렉션 객체의 모든 원소들을 추가한다.
         */

// 4.b)
        List<Point> ptrList3 = new ArrayList<>();
        ptrList3.add(new Point(1, 4));
        ptrList3.add(new Point(2, 3));

        Collection<MyPoint3> temp = new ArrayList<>();
        temp.add(new MyPoint3(4, 5));
        temp.add(new MyPoint3(-5, 5));

        ptrList3.addAll(temp);

        for (var e: ptrList3) {
            System.out.println(e);
        }

// 5. ==============================================================
// 5.a) b)는 OrderMgt0 클래스에서 답하시오.
// 5.c) 다음의 코드들은 채점에 필요한 부분으로 변수 명칭과 메소드 명칭만
//    학번의 마지막 번호가 반영되도록 수정하세요. 채점에 필요합니다.
        OrderMgt3 orderMgt = new OrderMgt3();
        if (!orderMgt.getDataFromFile3("orders.csv")) {
            System.out.println("데이터 파일 읽는 과정에서 오류 발생하여 종료합니다.");
            return;
        }
        orderMgt.displayOrders3();
    }

}

