package IntroductoryAssignment;

import java.util.Scanner;

public class LargestoFFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		int arr[] = new int[5];
		int index = 0;
		int largest =  arr[0];
		while(index<arr.length) {
			arr[index]= s.nextInt();
			
		}
		s.close();
		index = 1;
		while(index<arr.length) {
			if(arr[index]>largest) {
				largest= arr[index];	
						
			}
			index++;
		}
		System.out.println(largest);

	}

}
