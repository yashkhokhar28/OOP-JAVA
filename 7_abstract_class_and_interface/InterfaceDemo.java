interface A {
    int a = 5;

    void A();
}

interface A1 extends A {
    int a1 = 6;

    void A1();
}

interface A2 extends A {
    int a2 = 7;

    void A2();
}

interface A12 extends A1, A2 {
    int a12 = 8;

    void A12();
}

class B implements A12 {

    @Override
    public void A1() {
        System.out.println("Method A : " + a1);
    }

    @Override
    public void A2() {
        System.out.println("Method A2 : " + a2);
    }

    @Override
    public void A12() {
        System.out.println("Method A12 : " + a12);
    }

    @Override
    public void A() {
        System.out.println("Method A : " + a);
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        B b1 = new B();
        b1.A();
        b1.A1();
        b1.A12();
        b1.A2();
    }
}
