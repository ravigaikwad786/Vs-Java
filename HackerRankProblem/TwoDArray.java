package HackerRankProblem;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = s.nextLine().split(" ");
           

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
    }

    private static int hourglassSum(int[][] arr) {
        return 5;
    }
}
