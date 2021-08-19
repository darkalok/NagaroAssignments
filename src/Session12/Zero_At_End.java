package Session12;

import java.util.Scanner;

public class Zero_At_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (arr[l] == 0 && arr[r] != 0) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }
            if (arr[l] == 0 && arr[r] == 0) {
                r--;
            }


        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


//        for (int l = 0, r=n-1; l<r; ) {
//            if (arr[l] == 0 && arr[r]!=0) {
//                int temp=arr[r];
//                arr[r]=arr[l];
//                arr[l]=temp;
//            }
//        }

    }
}
