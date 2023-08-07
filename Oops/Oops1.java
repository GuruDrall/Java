package Oops;

class Pen {
    int price = 10;
    int tip;
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

public class Oops1 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        System.out.println(p1.price);

    }

}
