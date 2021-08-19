package IntroductoryAssignment;

import java.util.Scanner;

public class Odd_Even_Delhi_Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        int i = 1;
        while(i<=n){
            Scanner sc2 = new Scanner(System.in);
            int digitOfCars = sc2.nextInt();
            while(digitOfCars>0){
                int rem = digitOfCars%10;
                digitOfCars/=10;
                if(rem%2==0){
                    sumEven+=rem;
                }else{
                    sumOdd+=rem;
                }

            }
            if(sumEven%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }if(sumOdd%3==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            i++;

        }
    }
}
