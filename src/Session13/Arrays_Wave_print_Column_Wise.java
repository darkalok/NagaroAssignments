package Session13;

import java.util.Scanner;

public class Arrays_Wave_print_Column_Wise {

    //    private static void print_row_wise(int[][]arr)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of number of row and column
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Making a 2D Array
        int[][] arr = new int[n][m];

        //Taking User Input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = sc.nextInt();

            }

        }

//        int n = arr.length;
//        int m = arr[0].length;

        //    Printing the original array
//
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < m; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }

//        System.out.println("------------------------------------");

        for (int col = 0; col < m; col++) {

            // even row, run loop from top to down
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    System.out.print(arr[row][col] + ",");

                }
            } else { //odd row, run loop from right to left
                for (int row = m - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + ",");
                }
            }

//            System.out.println();
        }
        System.out.println("END");
    }
}

