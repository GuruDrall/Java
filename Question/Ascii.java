package Question;

public class Ascii {

    public static void printAscii(char a) {

        int b = a;

        System.out.println("ASCII value of " + b + " is : " + a);
    }

    public static void main(String[] args) {
        char a = 0;
        for (int i = 0; i <= 255; i++) {
            printAscii(a);
            a++;

        }

    }
}
