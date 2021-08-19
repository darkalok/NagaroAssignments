package IntroductoryAssignment;

import java.util.Scanner;

public class Manmohan_Loves_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int num = 1;

        while(row<=n){
            if(row%2!=0){
                int cnum=1;
                while(cnum<=num){
                    System.out.print("1");
                    cnum++;
                }
            }
            if(row%2==0) {
                int cnum2 = 1;
                while (cnum2 <= num) {
                    if (cnum2 == 1 || cnum2 == num) {
                        System.out.print("1");

                }else{
                    System.out.print("0");
                }
                cnum2++;
            }
            }
            row++;
            num++;
            System.out.println();
        }
    }
}
