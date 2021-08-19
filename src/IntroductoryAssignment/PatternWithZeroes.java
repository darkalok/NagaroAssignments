package IntroductoryAssignment;

import java.util.Scanner;

public class PatternWithZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int num = 1;
//        int temp = row;

        while (row <= n) {   //outer loop

            int cnum=1;
            while(cnum<=num){
                if(cnum==1 || cnum==num) {
                    System.out.print(row + "\t");
                }else{
                    System.out.print("0" + "\t");
                }
                cnum++;
            }
            row++;
            num++;
            System.out.println();
        }
    }
}
