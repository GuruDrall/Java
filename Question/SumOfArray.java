package Question;

public class SumOfArray {
    // ! For 1D array
    public static int sumOfArr(int arr[]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // ! For 2D array
    public static int sumOfArr(int arr[][]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    // ! For 3D array
    public static int sumOfArr(int arr[][][]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    sum = sum + arr[i][j][k];

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 25, 35, 57 };
        int arr1[][] = { { 2, 3, 4 }, { 5, 6, 7 } };
        int arr2[][][] = { { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } }, { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } } };
        int sum = sumOfArr(arr);
        int sum1 = sumOfArr(arr1);
        int sum2 = sumOfArr(arr2);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
