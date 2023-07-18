package FxnPractice;

import java.util.Scanner;

public class Factorial {

    public static void printFactorial(int n) {
        int fac = 1;
        for(int i = n; i>=1; i--) {
           fac = fac * i;  
        }
        System.out.println("Factorial of number "+ n +" is : " + fac);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value to find its Factorial : ");

        int n = sc.nextInt();
        printFactorial(n);
        
    }
    
}
