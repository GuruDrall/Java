package Loops;

public class Pattern1 {

    public static void main(String[] args) {

        int n = 5;

        System.out.println();
        System.out.println("Pattern 1");
        System.out.println();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 2");
        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3");
        System.out.println();

        // for (int i = 1; i <= n; i++) {
        // // print space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // print *
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }

        // Alternate method

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 4");
        System.out.println();

        for (int i = 1; i <= n; i++) {

            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print *
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();

            // * 2 space * i=1, space = 5-i = 4
            // * * 1 space ** i=2, space = 5-i = 3
            // * * * 0 space *** i=3, space = 5-i = 2
            // * * * * 0 space **** i=4, space = 5-i = 1
            // * * * * * 0 space ***** i=5, space = 5-i = 0

        }
    }
}
