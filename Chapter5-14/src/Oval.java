public class Oval implements Shape {
    int width;
    int height;

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return width * height * PI;
    }
}
