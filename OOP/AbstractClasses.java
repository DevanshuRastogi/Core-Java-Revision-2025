
abstract class A {

    public void method1() {
        System.out.println("Method 1 ");
    }

    abstract void method2();

    abstract void method3();
}

class B extends A {
    void method2() {
        System.out.println("Method 2 ");
    }

    void method3() {
        System.out.println("Method 3 ");
    }
}

public class AbstractClasses {

    public static void main(String[] args) {

        A a = new B();
        a.method1();
        a.method2();
        a.method3();

        System.out.println();
        B b = new B();
        b.method1();
        b.method2();
        b.method3();
    }
}
