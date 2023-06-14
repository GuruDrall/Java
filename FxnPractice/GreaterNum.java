package FxnPractice;

import java.util.Scanner;

public class GreaterNum {

    public static void findGreaterNumber(int a, int b) {

        if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is greater than " + b);
        }
        return;
    }

    public static void main(String[] args) {

        // ! 3. Write a function which takes in 2 numbers and returns the greater of
        // those two.

        Scanner sc = new Scanner(System.in);
        System.out.println("Going to find the greater number");
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();

        System.out.println("Enter second Number : ");
        int b = sc.nextInt();

        findGreaterNumber(a, b);

    }
}