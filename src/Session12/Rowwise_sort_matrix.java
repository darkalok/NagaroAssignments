package Session12;

import java.util.Scanner;

public class Rowwise_sort_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of number of row and column
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Making a 2D Array
        int[][] arr = new int[r][c];

        //Taking User Input
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                arr[row][col] = sc.nextInt();

            }

        }

    }
}
