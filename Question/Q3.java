package Question;

import java.util.Scanner;

public class Q3 {

  public static char askForQuit() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Press q to Quit or any other key to enter value ");
    char ch = sc.next().charAt(0);
    return ch;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    float avg = 0.0f;
    int prod = 1;

    char ch1 = askForQuit();

    while (ch1 != 'q') {
      System.out.println("===Enter number===");
      int a = sc.nextInt();
      sum = sum + a;
      prod = prod * a;
      count++;
      ch1 = askForQuit();
    }

    System.out.println("===========Quit=========");

    avg = (float) sum / count;
    System.out.println("Average of " + count + " numbers are : " + avg);
    System.out.println("Product of all numbers are : " + prod);
  }
}
