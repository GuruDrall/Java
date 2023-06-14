package FxnPractice;

import java.util.*;

public class Tables {

    public static void printRepeat(int num) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));

        }
        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num to get the table");
        int num = sc.nextInt();
        printRepeat(num);

        System.out.println("Need more tables? y or n?");
        char c = sc.next().charAt(0);

        if (c == 'y' || c == 'Y') {
            main(args);

        } else {
            System.out.println("bye");
        }

    }
}
