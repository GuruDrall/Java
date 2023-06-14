package FxnPractice;

import java.util.Scanner;

public class FindCircumference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle : ");
        double r = sc.nextDouble();

        findCircumference(r);

    }

    public static void findCircumference(Double r) {

        double pi = 3.14;
        double Circumference = 2 * pi * r;

        System.out.println("Circumference of circle whose radius is " + r + " = " + Circumference);
    }
}
