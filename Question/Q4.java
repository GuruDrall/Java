package Question;

import java.util.Scanner;

public class Q4 {

    public static int productInput(int a) {
        int sum = 0;
        int mod;
        // ! first method
        // for (int i = a; i>0 ; i=i/10) {
        // mod = i % 10;
        // sum = sum + mod;
        // }
        // return sum;

        // ! Second Method
        while (a != 0) {
            mod = a % 10;
            sum = sum + mod;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        int sum = productInput(a);
        System.out.println("Sum of all numbers in " + a + " is : " + +sum);

    }

}
