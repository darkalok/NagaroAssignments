package Session13;

import java.util.Scanner;

public class debamnjanspiral {
    public static void spiralRow(int arr[][]){
        int minRow=0;
        int minCol=0;
        int maxRow=arr.length-1;
        int maxCol=arr[0].length-1;
        int ele=arr.length*arr[0].length;
        int count=0;
        while(count<ele){
            //print first row
            //col will increase
            for(int c=minCol;c<=maxCol && count<ele;c++){
                System.out.print(arr[minRow][c]+", ");
                count++;
            }
            minRow++;
            //print rightmost col
            //row will change
            for(int r=minRow;r<=maxRow && count<ele;r++){
                System.out.print(arr[r][maxCol]+", ");
                count++;
            }
            maxCol--;
            //down row
            //col will change
            for(int c=maxCol;c>=minCol && count<ele;c--){
                System.out.print(arr[maxRow][c]+", ");
                count++;
            }
            maxRow--;
            //1st col
            for(int r=maxRow;r>=minRow && count<ele;r--){
                System.out.print(arr[r][minCol]+", ");
                count++;
            }
            minCol++;
        }
    }

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
        spiralRow(arr);
    }
}

