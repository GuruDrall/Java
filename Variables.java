import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        // 1. Try to declare meaningful variables of each type.
        // Eg - a variable named age should be a numeric type (int or float) not byte.
        System.out.println("1st - Variables");
        System.out.println("Do you want to display Variables type and values? \n Enter : y or n");
        Scanner sc = new Scanner(System.in);
        char a = 'y';
        char b = 'n';
        char c;
        c = sc.next().charAt(0);
        if (c == b) {
            System.out.println("Ok lets move to next solution");

        } else if (c == a) {

            byte marks = 67; // marks from 0 to 100
            System.out.println("Byte : Marks in Maths = " + marks);

            short amount30k = 20_000; // Amount less then 30K
            System.out.println("Short : Amount less then 30K = " + amount30k);

            int amount2m = 2_00_00_00_000; // Amount less then 2M
            System.out.println(" Int : Amount less then 2M = " + amount2m);

            long phoneNum = 99_99_99_99_99l;
            System.out.println("Long : Your Phone Number is = " + phoneNum);

            float avg = 87.34f;
            System.out.println("Float : Average marks of all ur sub is = " + avg);

            double pi = 3.14159265359;
            System.out.println("Double : Value of Pi is = " + pi);

            boolean t = true;
            boolean f = false;
            System.out.println("Boolean : " + t + " " + f);

        } else {
            System.out.println("Invalid Entry");
        }

        // 2. Make a program that takes the radius of a circle as input,
        // calculates its radius and area and prints it as output to the user.

        System.out.println();
        System.out.println("2nd - Calculate area of Circle");

        System.out.println("Enter radius to find out the area of circle : ");
        int radius = sc.nextInt();
        System.out.print("\033[H\033[2J");
        double pi = 3.14159265359;

        double area = pi * (radius * radius);

        System.out.println("Radius of circle is : " + radius);
        System.out.println("Formula of Area = Pi* Square of radius of Circle");
        System.out.println("Area of circle whose radius is " + radius + " = " + area);

        // ? 3. Make a program that prints the table of a number that is input by the
        // ?user.
        // ?(HINT - You will have to write 10 lines for this but as we proceed in the
        // ?course you will be
        // ?studying about ‘LOOPS’ that will simplify your work A LOT!)

        System.out.println();
        System.out.println("3rd - Dispaly Table using input value");
        System.out.println();
        System.out.println("Enter any num to get table for the same : ");

        int val = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println("You entered : " + val);
        System.out.println(val * 1);
        System.out.println(val * 2);
        System.out.println(val * 3);
        System.out.println(val * 4);
        System.out.println(val * 5);
        System.out.println(val * 6);
        System.out.println(val * 7);
        System.out.println(val * 8);
        System.out.println(val * 9);
        System.out.println(val * 10);

    }
}
