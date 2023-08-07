package Oops;

class A {
    int a = 50;
    int b;
    int c;

    void printInfoA() {
        System.out.println(a + " " + b + " " + c);
    }

    int sumA() {
        return (a + b + c);
    }
}

class B extends A {
    int x;
    int y;
    int z;

    void printInfoA() {
        System.out.println("Class B : " + a + " " + b + " " + c);
    }

    void printInfoB() {
        System.out.println(x + " " + y + " " + z);
    }

    int sumB() {
        return (x + y + z);
    }
}

public class InheritancePractice {

    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
        A b2 = new B();

        a1.a = 1;
        a1.b = 2;
        a1.c = 3;
        // a1.printInfo();
        // a1.sum();

        b1.a = 4;
        b1.b = 5;
        b1.c = 6;
        b1.x = 7;
        b1.y = 8;
        b1.z = 9;
        // b1.printInfoA();
        // b1.printInfoB();
        // int sum = b1.sumA() + b1.sumB();
        // System.out.println(sum);

        // b2.a = 11;
        // b2.b = 12;
        // b2.c = 13;
        b2.printInfoA();
        // int sum1 = b2.sumA();
        // System.out.println(sum1);
        // b2.x = 14; can not access x,y,z or we can say that we can not access the
        // properties of class B with Class A type reference object

    }

}
