package Session2;

import java.util.Scanner;


 class Rough22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5;
        int row = 1;
        int nsp = 0;
        int nst = 2 * n + 1;
        int count = n;
        while (row <= 2 * n + 1) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + " ");
                if (cst <= nst / 2) {
                    count--;
                } else {
                    count++;
                }
            }

            if (row >= n + 1) {
                nsp--;
                nst += 2;
                count = row - n;
            } else {
                nsp++;
                nst -= 2;
                count = n - row;
            }
            row++;
            System.out.println();
        }

    }/* OUTPUT

     */
}