package Session12;

import java.util.Scanner;

public class Arrays_Insertion_Sort {
    private static void insertionSort(long arr[], int n){
        for(int curr = 1; curr < n; curr++) {
            long currCard = arr[curr];
            int prevIndex =  curr - 1;

            while(prevIndex >= 0 && currCard < arr[prevIndex]) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = currCard;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        insertionSort(arr,n);
    }
}
