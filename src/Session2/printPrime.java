package Session2;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        if (n < 2) {
            System.out.println(0);
            System.exit(0);
        }
        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}

