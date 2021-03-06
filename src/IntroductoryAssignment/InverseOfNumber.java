package IntroductoryAssignment;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 32145;
        int invNum = 0;

        //logic
        int place = 1;
        while(num > 0) {
            int digit = num % 10; //5
            //System.out.println(place + " " + digit);

            int invPlace = digit;
            int invDigit = place;

            invNum = (int) (invNum + invDigit * Math.pow(10, invPlace - 1));
            //System.out.println(invPlace + " " + invDigit);

            num = num/10;
            place++;
        }

        System.out.println(invNum);
    }
}
