package Oops;

//* Method overloading - name of the method will be same but function sign must be different.

class Calculate {
    int a;
    int b;
    int c;

    void sum() {
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    void sum(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    void sum(int a, float b) {
        System.out.println(a + b);
    }

}

class Subtract extends Calculate {
    void sum(int a, int b) { // ! This is method overridding.
        System.out.println(a - b);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Calculate c1 = new Calculate();

        c1.sum(2, 4);
        c1.sum(5, 6, 8);
        c1.sum(3, 5.4f);

        Subtract c2 = new Subtract();
        Calculate c3 = new Subtract();

        c2.sum(10, 5);
        c3.sum(10, 5);

    }

}
