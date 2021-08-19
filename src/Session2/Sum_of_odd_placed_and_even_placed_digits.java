package Session2;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int oddSum=0;
        int evenSum=0;
        while(num>0){
            int rem = num%10;
            ++count;
            if(count%2==0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            num/=10;

        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
