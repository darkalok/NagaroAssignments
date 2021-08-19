package IntroductoryAssignment;//import java.util.Scanner;

public class SumoFDigits {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            Scanner sc =  new Scanner(System.in);
		int x =sumOfDigits(545);
		System.out.println(x);
            
	}

}
