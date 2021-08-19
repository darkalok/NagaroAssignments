package Session2;
import java.util.*;
public class Pattern_InvertedHourGlass {
        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int nst = 1;
            int nsp = 2*n-1;
            int row = 1;

            while(row<=2*n+1) {

                int num=n;

                for(int cst=1; cst<=nst; cst=cst+1){
                    System.out.print(num + " ");
                    num=num-1;
                }

                for(int csp=1; csp<=nsp; csp=csp+1)
                    System.out.print("  ");
                if(row==n+1){
                    num=num+1;
                    for(int cst=2; cst<=nst; cst=cst+1){
                        num=num+1;
                        System.out.print(num + " ");
                    }
                }else{
                    for(int cst=1; cst<=nst; cst=cst+1){
                        num=num+1;
                        System.out.print(num + " ");
                    }
                }

                System.out.println("  ");

                if(row<=n){
                    nsp=nsp-2;
                    nst++;
                } else {
                    nsp=nsp+2;
                    nst--;
                }
                row++;
            }

        }
    }

