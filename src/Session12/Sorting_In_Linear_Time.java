package Session12;

import java.util.Scanner;

public class Sorting_In_Linear_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // According to your code:

        // Let say arr = 1 0 0 1 0 1
        // whel l = 0 and r = 5, it will do l++ and r--
        // l becomes 1 and r becomes 4. But 1 at index 5 have to be swapped to first 0 from left side, which is not happening
        // Your output is: 1 0 0 1 0 1
        // But output should be 0 0 0 1 1 1.

        // I have corrected your code. Have a look

        int l = 0;
        int r = n - 1;
        while (l < r) {

                if (arr[r] == 0 && arr[l] == 1) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
                if (arr[l] == 0) {
                    l++;
                }
                if (arr[r] == 1) {
                    r--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

