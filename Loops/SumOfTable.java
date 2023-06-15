package Loops;

public class SumOfTable {

    public static void main(String[] args) {
        int sum = 0;
        // for (int i = 1; i <= 10; i++) {

        // sum = sum + (i * 7);

        // }
        // System.out.println(sum);
        // }

        // for (int i = 1; i <= 100; i++) {
        // sum = sum + i;

        // }

        // System.out.println(sum);

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                sum = sum + i * j;
            }

        }
        System.out.println(sum);
    }

}