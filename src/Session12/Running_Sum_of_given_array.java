package Session12;

import java.util.Scanner;

public class Running_Sum_of_given_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            System.out.print(sum + " ");

        }
    }
}
