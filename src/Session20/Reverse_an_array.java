package Session20;

import java.util.Scanner;

public class Reverse_an_array {
    private static int[] reverseArray(int[] arr, int si, int ei){
        if(si>ei){
            return arr;
        }
        // Swapping logic
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;

        // Calling the function with lo+1 & hi-1
        reverseArray(arr,si+1,ei-1);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int si = 0;
        int ei = n-1;
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        arr= reverseArray(arr,si,ei);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
