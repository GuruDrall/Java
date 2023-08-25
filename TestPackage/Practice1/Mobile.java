package TestPackage.Practice1;

public class Mobile {

    public Mobile() {

    }

    protected int price;
    public String color;

    public void printInfo() {
        System.out.println(price + " " + color);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

// public class Apple extends Mobile {

// int p = price + 20000;
// String c = "Light" + " " + color;

// void msg() {
// System.out.println("California");
// }
// }

// public class Samsung extends Mobile {

// }

// public static void main(String[] args) {

// Mobile m1 = new Mobile();
// m1.color = "Red";
// m1.setPrice(10000);
// m1.printInfo();
// Main1 mn1 = new Main1();
// Samsung s1 = mn1.new Samsung();
// s1.color = "Black";
// s1.setPrice(30000);
// s1.printInfo();
// }
