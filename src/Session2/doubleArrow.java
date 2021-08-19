package Session2;

import java.util.Scanner;


 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print(n);
            System.exit(0);
        }
        //For First Time Left Space
        for (int i = 0; i < n - 1; i++) {
            System.out.print("  ");
        }
        //Printing 1 Manually
        System.out.println(1);

        //Top Area
        for (int i = 2; i <= (n + 1) / 2; i++) {
            //Spaces
            for (int j = 1; j <= n - (2 * i - 1); j++) {
                System.out.print("  ");
            }

            //Left
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            //Spaces
            for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                System.out.print("  ");
            }

            //Right
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Bottom
        for (int i = 1; i < (n - 1) / 2; i++) {
            //Spaces
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("  ");
            }

            //Left
            int k = (n - 1) / 2;
            for (int j = (k - i) + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            //Spaces
            for (int j = n / 2 + 1; j >= 2 * i; j--) {
                System.out.print("  ");
            }

            //Right
            for (int j = 1; j <= (k - i) + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            System.out.print("  ");
        }
        System.out.println(1);

    }


}
