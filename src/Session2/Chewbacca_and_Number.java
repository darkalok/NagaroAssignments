package Session2;

import java.util.Scanner;

public class Chewbacca_and_Number<num> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mult = 1;
        int optNUm = 0;
        while (num > 0) {
            int digit = num % 10;
            int k = 9 - digit;
            if(k<digit){
                digit=k;
            }
            optNUm += digit * mult;
            mult *= 10;
            num/=10;


        }
        System.out.println(optNUm);


    }
}
