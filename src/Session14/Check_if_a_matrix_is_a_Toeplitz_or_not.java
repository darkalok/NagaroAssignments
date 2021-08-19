package Session14;

import java.util.Scanner;

public class Check_if_a_matrix_is_a_Toeplitz_or_not {
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
        int i = 0;
        int j = 0;
//        while(){
//            if(arr[i][j]!=arr[i+1][j+1]){
//                System.out.println(false);
//                break;
//
//            }
//            i++;
//            j++;
//        }

    }
}
