package Oops;

interface Mammals { // interface used to achieve total abstraction and all methods are public.,
                    // abstract and without implementation.
    int eyes = 2; // final, static, public.
    int ears = 2;

    void eat();

    void walk();
}

interface Teeth {
    int teeth = 32;

    void chew();

}

class Human implements Mammals, Teeth {
    int eyes = 4;

    public void eat() {
        System.out.println("Eat veg and non veg");
    }

    public void walk() {
        System.out.println("Walks on 2 legs");
    }

    public void chew() {
        System.out.println("Chew with teeths");
    }
}

class Animal implements Mammals {

    public void eat() {
        System.out.println("Eat veg and non veg");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }

}

public class InterfacePractice {
    public static void main(String[] args) {
        // Human.eyes = 4; // bcos interface variables are final, static, public.
        // System.out.println(Human.eyes);
        Human h1 = new Human();
        h1.eyes = 5; // only accessable when declared in class.
        System.out.println(h1.eyes + " " + Teeth.teeth); // we can use h1.teeth also instead of Teeth.teeth.
    }
}
