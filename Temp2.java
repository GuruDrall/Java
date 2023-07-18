import java.util.Random;

public class Temp2 {
    public static void main(String[] args) {
        int[][][] threeDArray = new int[3][4][6];
        Random random = new Random();

        // Filling the array with random values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    threeDArray[i][j][k] = random.nextInt(100); // Generates random values between 0 and 99
                }
            }
        }

        // Printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}