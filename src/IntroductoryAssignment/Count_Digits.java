package IntroductoryAssignment;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int count=0;
        while(num>0){
            int rem = num%10;
            if(digit==rem){
                count++;
            }
            num/=10;

        }
        System.out.println(count);
    }
}
