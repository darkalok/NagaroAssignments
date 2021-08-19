package session10;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {
    private static void actualReverse(int n, int[] arr) {
        // TODO Auto-generated method stub

        int h1 = 0, h2 = n - 1;// two hands/pointers

        while (h1 < h2) {// h1 == h2, h1 > h2 -> stop
            int temp = arr[h1];
            arr[h1] = arr[h2];
            arr[h2] = temp;
            h1++;
            h2--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        actualReverse(n, arr);

    }
}
