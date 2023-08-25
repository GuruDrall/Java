package Oops;

abstract class Client {
    String name;
    int amount;
    String bankName;

    Client() {

    }

    Client(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    abstract void bankName();

    void atmCard() {

    }
}

class Client1 extends Client {

    Client1() {

    }

    Client1(String name, int amount) {

        this.name = name;
        this.amount = amount;
        this.bankName();
    }

    void bankName() {
        this.bankName = "BOB";
    }

    void printinfo() {
        System.out.println(name + " " + amount + " " + bankName);

    }
}

public class AbstractionPractice {

    public static void main(String[] args) {
        Client1 c1 = new Client1("Sumit", 10000);
        Client1 c2 = new Client1();
        // c1.printinfo();
        System.out.println(c1.bankName);

    }

}
