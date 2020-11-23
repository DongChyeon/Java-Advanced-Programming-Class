package sw.donghyeon.dankook;

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

public class AnonymousClassDemo {
    public void createClass() {
        Polygon m1 = new Polygon() {
            @Override
            public void display() {
                System.out.println("Inside MyPolygon class");
            }
        };
        m1.display();
    }

    public static void main(String[] args) {
        AnonymousClassDemo anonymousClassDemo = new AnonymousClassDemo();
        anonymousClassDemo.createClass();
    }
}
