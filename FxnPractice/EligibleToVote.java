package FxnPractice;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        // ! 5. Write a function that takes in age as input and returns if that person
        // ! is eligible to vote or not.
        // ! A person of age > 18 is eligible to vote.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check for eligible");
        int age = sc.nextInt();

        eligibleAge(age);

    }

    public static void eligibleAge(int age) {

        if (age >= 18) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }
        return;
    }

}
