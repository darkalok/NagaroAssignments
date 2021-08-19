package session10;

import java.util.*;

public class Arrays_Linear_Search_parameterised_fun {

    private static int find_m(int arr[], int m) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            if (arr[j] == m) {
                return j;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int x = find_m(arr, m);
        System.out.println(x);
    }
}
