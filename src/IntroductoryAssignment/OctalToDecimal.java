package IntroductoryAssignment;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		//src
		int decimal = s.nextInt();
		int dst = 8;  
		int src = 10;
		int res=0;
		int pow = 1;
		int rem = 0;
		while(decimal>0) {
			rem = decimal%dst;  // source getting divided by destination base and storing into rem
			decimal/=dst;
			int num = rem*pow;
			res = res + num;
			pow*=10;
		}
		
		System.out.println(res);
		
		

	}

}
