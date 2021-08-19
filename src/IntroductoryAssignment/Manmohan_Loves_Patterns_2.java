package IntroductoryAssignment;

import java.util.Scanner;

public class Manmohan_Loves_Patterns_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int num = 1;
//        int temp = row;

        while (row <= n) {   //outer loop
            int cnum=1;
            if(row==1){
                System.out.print("1");
            }else{
                while(cnum<=num){
                    if(cnum==1 || cnum==num) {
                        System.out.print(row-1);
                    }else{

                        System.out.print("0");

                    }
                    cnum++;
                }
            }


            row++;
            num++;
            System.out.println();
        }
    }
}
