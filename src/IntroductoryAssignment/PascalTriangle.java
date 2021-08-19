package IntroductoryAssignment;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.pow(11,7));
        int row = 1;
        int mult = 1;
        while(row <=n)

        {
            //number print
            //System.out.println(mult);
            if(row==1){
                System.out.print(mult);
            }else{
                int temp = reverseNumber(mult);
                while(temp>0){
                   int digit = temp%10;
                    System.out.print(digit  + "\t");
                   temp = temp/10;
                }
            }
            mult *= 11;
            row++;
            System.out.println();
        }
    }

    private static int reverseNumber(int mult){
        int revNum = 0;
        int rem;
        while(mult > 0) {
            rem = mult % 10;
            mult /= 10;
            revNum = revNum*10 + rem;
        }
        return revNum;
    }

}
