package Session14;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    private static void print_upper_matrix(int[][] arr, int r, int c) {
        int i = 1;

        while (i < r) {
            int j = 0;
            while (j < i) {
                arr[i][j] = 0;
                j++;
            }
            i++;
        }

        //Printing 2D Array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }

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
        //Printing 2D Array before calling function
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        print_upper_matrix(arr,r,c);

    }
}
