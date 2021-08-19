package IntroductoryAssignment;

import java.util.Scanner;

public class LargestoFThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s =  new Scanner(System.in);
		int num1 =  s.nextInt();
		int num2 =  s.nextInt();
		int num3 =  s.nextInt();
		int res=(num1>num2)?num1:num2;
	     res = (res>num3)?res:num3;
	     System.out.println(res);


	}

}
