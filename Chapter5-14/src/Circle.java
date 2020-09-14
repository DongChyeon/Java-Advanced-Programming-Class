import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Circle implements Shape {
    int radius;
    double area;

    public Circle(int radius) {
        this.radius = radius;
        area = radius * radius * PI;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return area;
    }
}
