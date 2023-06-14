package Loops;

import java.util.*;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Month in Numeric Value : ");
        int Month = sc.nextInt();
        System.out.println("You entered : ");

        if (Month == 1) {
            System.out.println(Month + " is : " + "January");
        } else if (Month == 2) {
            System.out.println(Month + " is : " + "February");
        } else if (Month == 3) {
            System.out.println(Month + " is : " + "March");
        } else if (Month == 4) {
            System.out.println(Month + " is : " + "April");
        } else if (Month == 5) {
            System.out.println(Month + " is : " + "May");
        } else if (Month == 6) {
            System.out.println(Month + " is : " + "June");
        } else if (Month == 7) {
            System.out.println(Month + " is : " + "July");
        } else if (Month == 8) {
            System.out.println(Month + " is : " + "August");
        } else if (Month == 9) {
            System.out.println(Month + " is : " + "September");
        } else if (Month == 10) {
            System.out.println(Month + " is : " + "October");
        } else if (Month == 11) {
            System.out.println(Month + " is : " + "November");
        } else if (Month == 12) {
            System.out.println(Month + " is : " + "December");
        } else {
            System.out.println(Month + " is : " + "Invalid Month");
        }
    }
}
