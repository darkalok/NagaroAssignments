package session10;

import java.util.Scanner;

public class Arrays_Max_Value_In_Array {

    private static int maxVal(int[] arr, int n) {
        // TODO Auto-generated method stub

        int maxValue = Integer.MIN_VALUE; //

        for (int k = 0; k < n; k++) {//[0, 2] -> {1, 2, 3}
            if (arr[k] > maxValue) {
                maxValue = arr[k];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=maxVal(arr,n);
        System.out.println(max);
    }
}
