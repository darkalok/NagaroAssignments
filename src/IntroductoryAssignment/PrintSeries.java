package IntroductoryAssignment;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i=1;
        int count =1;
//        int n;
//        boolean b = (3i+2)%n2 !=0;
        while(count<=n1){
            if((3*i+2)%n2 !=0){
                System.out.println(3*i+2);
                count++;

            }
            i++;
        }
    }
}
