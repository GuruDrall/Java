import java.util.*;

public class FindOddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println();
        if (n % 2 == 0) {

            System.out.println(n + " is Even Number");
        } else {
            System.out.println(n + " is Odd Number");
        }

    }
}
