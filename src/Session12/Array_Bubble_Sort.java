package Session12;

import java.util.Scanner;

public class Array_Bubble_Sort {
    private static void bubbleSort(long arr[], int n){
        for(int cp = 1; cp <= n - 1; cp++) { //1, 2, 3

            for(int curr = 0; curr <= n - cp - 1; curr++) {
                if(arr[curr] > arr[curr + 1]) {
                    long temp = arr[curr];
                    arr[curr] = arr[curr + 1];
                    arr[curr + 1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        bubbleSort(arr,n);
    }
}
