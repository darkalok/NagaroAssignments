package IntroductoryAssignment;

import java.util.Scanner;

public class REvisingQuadratric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        
       
        int x=b*b-4*a*c;
        
        if(x<0) {
        	System.out.println("Imaginery");
        }else if(x==0) {
        	System.out.println("Real and equal");
        	int root = -b/2*a;
        	System.out.println(root);
        	System.out.println(root);
        	
        	
        }else {
        	System.out.println("Real and Distinct");
        	 int root1= (-b + (int)Math.sqrt(x))/2*a;
             int root2 = (-b - (int)Math.sqrt(x))/2*a;
             
             System.out.print(root1 + " ");
             System.out.print(root2);
             
        }
        
   
	}

}
