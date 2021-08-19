package Session13;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Taking input of number of row and column
        int n = s.nextInt();
        int m = s.nextInt();

        // Making a 2D Array
        int[][] arr = new int[n][m];

        //Taking User Input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = s.nextInt();

            }

        }

        int sr = 0;
        int sc = 0;
        int er = n - 1;
        int ec = m - 1;
        int totalElements = n * m;
        int count = 0;
        while (count < totalElements) {
            //row is fixed with value sr
            for (int col = sc; col <= ec && count<totalElements; col++) {
                System.out.print(arr[sr][col] + ", ");
                count++;
            }
            sr++;

            //col is fixed with value ec
            for (int row = sr; row <= er; row++) {
                System.out.print(arr[row][ec] + ", ");
                count++;
            }

            ec--;
            //row is fixed with value er
            for (int col = ec; col >= sc; col--) {
                System.out.print(arr[er][col] + ", ");
                count++;
            }
            er--;

            //col fixed -> sc
            for (int row = er; row >= sr; row--) {
                System.out.print(arr[row][sc] + ", ");
                count++;
            }

            sc++;
        }
        System.out.println("END");
    }
}
