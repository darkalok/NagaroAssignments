package session10;

import java.util.*;

public class Arrays_Target_Sum_Pairs {
    private static void targetSum(int n, int[] arr, int target) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println(Math.min(arr[j], arr[i]) + " and " + Math.max(arr[j], arr[i]));
                }
            }

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        targetSum(n, arr, target);

    }
}