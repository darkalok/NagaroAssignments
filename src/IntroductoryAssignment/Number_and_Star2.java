package IntroductoryAssignment;

import java.util.Scanner;

public class Number_and_Star2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n-1;
        int num = 1;

        while (row <= n) {

            //number print
            int cnum = 1;
            while (cnum <= num) {
                System.out.print(cnum);
                cnum++;
            }
            //star print
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }

            num++;
            nst--;
            System.out.println();
            row++;
        }
    }
}
