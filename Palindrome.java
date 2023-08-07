import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any work to check if it is palindrome or not :");
        String input = sc.nextLine();
        boolean b = false;

        for (int i = 0, j = input.length() - 1; i <= j; i++, j--) {
            if (input.charAt(i) == (input.charAt(j))) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        if (b == true) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not Palindrome");
        }
    }
}
