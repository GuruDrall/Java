package Question;

import java.util.Scanner;

public class Calculate {

    public static float calculate(int a, int b, char c) {
        float temp;
        System.out.println("1");
        if (c == '+') {
            temp = (float) a + b;
            return temp;
        }
        System.out.println("2");
        if (c == '-') {
            temp = (float) a - b;
            return temp;
        }
        System.out.println("3");
        if (c == '/') {
            temp = (float) a / b;
            return temp;
        }
        System.out.println("4");
        if (c == '*') {
            temp = (float) a * b;
            return temp;
        }
        System.out.println("5");
        System.out.println("Invalid entry");
        return 0.0f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value : ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd value : ");
        int b = sc.nextInt();

        System.out.println("Enter \n* for Multiply \n/ for divide \n+ for sum \n- for minus :");
        char c = sc.next().charAt(0);

        System.out.println(calculate(a, b, c));
    }
}
