package Loops;

import java.util.*;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Num for its Table : ");
        int num = sc.nextInt();

        // for loop
        System.out.println("Table using For Loop : ");

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // //while loop
        System.out.println("Table using While Loop : ");
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        // do while loop
        System.out.println("Table using Do While Loop : ");
        int j = 1;
        do {
            System.out.println(num + " x " + j + " = " + (num * j));
            j++;
        } while (j <= 10);
        System.out.println("End");
    }
}