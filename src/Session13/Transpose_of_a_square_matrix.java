package Session13;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();

        // Making a 2D Array
        int[][] arr = new int[n][n];

        //Taking User Input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
        int[][] out = new int[n][n];
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                int curr = arr[row][col];
                out[col][row] = curr;
            }
        }

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                System.out.print(out[row][col] + " ");
            }
            System.out.println();
        }

    }
}
