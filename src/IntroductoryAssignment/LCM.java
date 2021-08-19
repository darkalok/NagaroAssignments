package IntroductoryAssignment;

import java.util.Scanner;

public class LCM {
	
	static int GCD(int num1 , int num2) {
		
		   int dividend = 0;
	        int divisor = 0;

	        if(num1 > num2) {
	            dividend = num1;
	            divisor = num2;
	        } else {
	            dividend = num2;
	            divisor = num1;
	        }


	        while(dividend % divisor > 0) {
	            int rem = dividend % divisor;
	            dividend = divisor;
	            //System.out.println(dividend + " " + divisor);
	            divisor = rem;

	        }

//	        System.out.println(divisor);
	        return divisor;
	        
	    }
	

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int num1 =  s.nextInt();
		int num2 =  s.nextInt();
		
		int result = (num1*num2)/GCD(num1,num2);
		System.out.println(result);
		
	}

}
