package IntroductoryAssignment;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
//        int n = 5;
//        int row = 1;
        int n = 5;
        int row = 1;
        int nst = 0;
        int nsp = n ;

        while(row <= n) {

            //space
            int csp = 1;
            while(csp <= nsp) {
                System.out.print(csp);
                csp++;
            }
            //star
            int cst = 1;
            while(cst <= nst) {
                System.out.print("*\t");
                cst++;
            }

            nsp--;
            nst+=2;
            System.out.println();
            row++;
        }
    }
}
