package IntroductoryAssignment;

import java.util.*;
 class Main {
	
	static int sumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
		
		//extracting digit
		int digit = num % 10;
		
		 sum = sum + digit;
		
		//reduce number
		num = num / 10;
	}
		return sum;
	
}

	
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);
       long x=sc.nextLong();
       long y=x;
       long sum=0,pum=0;
       for(int i=2;i<=y;i++)
       {
           while(y%i==0)
           {
               sum = sum + sumOfDigits(i);
               y=y/i;
           }
       }
        while(x>0)
       {
           long rem=x%10;
           pum=pum+rem;
           x=x/10;
       }
       if(sum==pum)
       {
           System.out.print("1");
       }
       else
       {
           System.out.print("0");
       }
    }
}