package FxnPractice;

import java.util.Scanner;

public class PrimeNum {

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i * i < n; i++) {
            System.out.println("Checking for Prime number: " + n + " % " + i + " = " + (n % i));
            if (n % i == 0) {
                System.out.println("Not prime : " + n + " % " + i + " = " + (n % i));

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean prime = checkPrime(n);

        if (prime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }

}
