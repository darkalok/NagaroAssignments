package IntroductoryAssignment;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int revNum = 0;
        int rem;
        while(num > 0) {
            rem = num % 10;
            num /= 10;
            //System.out.print(rem);
            revNum = revNum*10 + rem;
        }
        System.out.println(revNum);

    }
}
