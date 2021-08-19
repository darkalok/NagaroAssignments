package Session12;

import java.util.Scanner;

public class Arrays_Selection_Sort {

    private static void Selection_Sort(long arr[], int n) {
        for (int marker = 0; marker < n - 1; marker++) {
            long minVal = Integer.MAX_VALUE;
            int minInd = -1;

            for (int curr = marker; curr < n; curr++) {
                if (arr[curr] < minVal) {
                    minVal = arr[curr];
                    minInd = curr;
                }
            }

            long temp = arr[marker];
            arr[marker] = arr[minInd];
            arr[minInd] = temp;
//            System.out.println(minVal);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
//        long [] arr = {9, 2, 5, 8, 7};
//        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Selection_Sort(arr, n);


    }
}
