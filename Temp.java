import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Int Value : ");
        // int n = sc.nextInt();
        // sc.skip("[\\r\\n]+");

        // System.out.println("Sting value 1: ");
        // String s = sc.next();
        // // sc.skip("[\\r\\n]+");

        // System.out.println("Sting value 2 : ");
        // String s2 = sc.nextLine();

        // System.out.println(n + ", " + s + ", " + s2);

        // int a = 2;
        // int b = a + 1;
        // int fac = b * a;

        // System.out.println("factorial is : " + fac + "\na is :" + a + "\nb is :" +
        // b);

        int a = 2;
        int b = a++;
        int fac = b * a;

        System.out.println("factorial is : " + fac + "\na is :" + a + "\nb is :" + b);

    }
}
