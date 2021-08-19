package session10;

import java.util.Scanner;

public class Arrays_Linear_Search {

    private static int find_m() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int j = 0; j < n; j++) {
            if (arr[j] == m) {
                return j;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int x = find_m();
        System.out.println(x);


    }
}
