package Loops;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Month in Numeric Value : ");
        int a = sc.nextInt();

        System.out.println("You entered " + a);
        if (a == 1) {
            System.out.println(a + " is : " + "January");
        } else {
            if (a == 2) {
                System.out.println(a + " is : " + "February");
            } else {
                if (a == 3) {
                    System.out.println(a + " is : " + "March");
                } else {
                    if (a == 4) {
                        System.out.println(a + " is : " + "April");
                    } else {
                        if (a == 5) {
                            System.out.println(a + " is : " + "May");
                        } else {
                            if (a == 6) {
                                System.out.println(a + " is : " + "June");
                            } else {
                                if (a == 7) {
                                    System.out.println(a + " is : " + "July");
                                } else {
                                    if (a == 8) {
                                        System.out.println(a + " is : " + "August");
                                    } else {
                                        if (a == 9) {
                                            System.out.println(a + " is : " + "September");
                                        } else {
                                            if (a == 10) {
                                                System.out.println(a + " is : " + "October");
                                            } else {
                                                if (a == 11) {
                                                    System.out.println(a + " is : " + "November");
                                                } else {
                                                    if (a == 12) {
                                                        System.out.println(a + " is : " + "December");
                                                    } else {
                                                        System.out.println(a + " is : " + "Invalid enter");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}