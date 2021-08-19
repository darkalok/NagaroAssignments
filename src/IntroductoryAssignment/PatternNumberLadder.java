package IntroductoryAssignment;

import java.util.Scanner;

public class PatternNumberLadder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int count=1;
        for( int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }

    }
}
