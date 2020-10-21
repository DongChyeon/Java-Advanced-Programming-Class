class A { int i; }

class B extends A { int j; }

class C extends B { int k; }

public class test {
    public static void main(String[] args) {
        A x = new C();
        System.out.println(x instanceof A);
    }
}
