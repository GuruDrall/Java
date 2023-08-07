package FxnPractice;

import java.util.Scanner;

public class Average {
    public static void PrintAverage(Double a, Double b, Double c) {

        double avg = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + " and " + c + " is :---> " + avg);
        return;
    }

    public static void main(String[] args) {

        // ! 1. Enter 3 numbers from the user & make a function to print their average.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number ");
        double a = sc.nextDouble();

        System.out.println("Enter 2nd Number ");
        double b = sc.nextDouble();

        System.out.println("Enter 3rd Number ");
        double c = sc.nextDouble();

        PrintAverage(a, b, c);
    }
}
