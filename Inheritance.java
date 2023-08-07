import javax.sound.sampled.SourceDataLine;

class Parent1 {
    String a = "Parent1's a";
    int b = 4;

    void printInfo() {
        System.out.println("================================================================");
        System.out.println("Print Fxn of Parent Class : a, b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
    }
}

class Child1 extends Parent1 {
    String c = "Child1's c";
    int d = 5;

    void printInfo() {
        System.out.println("Print Fxn of Child1 Class : c, d");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println();
    }
}

class Child2 extends Child1 {

    void printInfo() {

    }
}

class Child3 extends Child1 {

}

public class Inheritance {

    public static void main(String[] args) {
        System.out.println("Main Class");
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        Parent1 p2 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        p.printInfo();
        c.printInfo();
        p2.a = "p2'a";
        p2.printInfo();
        System.out.println("======C2======");
        c2.printInfo();
        System.out.println("======C3======");
        c3.printInfo();

        // System.out.println(p.a);

    }
}
