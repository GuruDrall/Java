package Collection;

import java.util.Stack;

class Pen {
    int tip;
    String color;
}

public class Collection {
    public static void main(String[] args) {
        Pen p = new Pen();
        Pen p2 = new Pen();
        Pen p3 = new Pen();

        p.tip = 1;
        p2.tip = 2;
        p3.tip = 3;

        p.color = "Blue";
        p2.color = "Red";
        p3.color = "Green";

        Stack<Pen> stack = new Stack<Pen>();
        stack.push(p);
        stack.push(p2);
        stack.push(p3);

        System.out.println(stack);
        Pen ref = stack.peek();
        System.out.println(ref.p + " " + ref.p2);

    }
}
