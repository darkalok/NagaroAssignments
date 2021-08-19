package Session14;

import java.util.Scanner;

public class Lower_triangular_matrix {
    private static boolean check_lower_matrix(int[][] arr, int n) {
        int i = 0;

        while (i < n - 1) {
            int j = i + 1;
            while (j < n) {
                if (arr[i][j] != 0) {
                    return false;
                }
                j++;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of number of row and column
        int n = sc.nextInt();

        // Making a 2D Array
        int[][] arr = new int[n][n];

        //Taking User Input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
        boolean b = check_lower_matrix(arr, n);
        System.out.println(b);
    }
}
