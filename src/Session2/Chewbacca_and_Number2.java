package Session2;

import java.util.Scanner;

public class Chewbacca_and_Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long mult = 1;
        int numofdigits=0;
        int count2=0;
        long optNUm = 0;

        //count number of digits in a number
        while(num>0){
            num/=10;
            numofdigits++;
        }
        while (num > 0) {
            int digit =(int)num % 10;
            int k = 9 - digit;
            ++count2;
            if(count2==numofdigits){
                if(k==0){
                    digit=9;
                }

            }
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
