package session10;

import java.util.Scanner;

public class Inverse_of_an_array {
    private static void inverse(int arr[], int n){
        int [] inv = new int [n];
        int i = 0;
        while(i<n){
            int v = arr[i];
            inv[v] = i;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.println(inv[j]);

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        inverse(arr,n);
    }
}
