package TestPackage.Practice2;

import TestPackage.Practice1.Mobile;

class Laptop {

    int size;
    String company;

    public void printInfo() {
        System.out.println(size + " " + company);
    }

}

class Apple extends Mobile {

    int p = price + 20000;
    String c = "Light" + " " + color;

    void msg() {
        System.out.println("California");
    }
}

// class Apple extends Mobile {

// int p = price + 20000;
// String c = "Light" + " " + color;

// void msg() {
// System.out.println("California");
// }
// }

public class Main2 {

    public static void main(String[] args) {

        // * Create object of laptop
        Laptop l = new Laptop();
        l.size = 14;
        l.company = "Apple";
        l.printInfo();

        // * Create object of Apple Mobile
        Apple a1 = new Apple();
        // a1.price = 50000;
        a1.setPrice(50000);
        a1.msg();
        a1.printInfo();
        // a1.color = "green";
        // a1.printInfo();

    }

}
