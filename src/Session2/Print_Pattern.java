package Session2;

import java.util.*;
public class Print_Pattern {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int rows=1;
        int spaces=n/2;
        int stars=1;
        while(rows<=n)
        {
            //work for spaces
            int sp=1;
            while(sp<=spaces)
            {
                System.out.print("  ");
                sp++;
            }
            //work for stars
            int st=1;
            while(st<=stars)
            {
                System.out.print("* ");
                st++;
            }
            //update
            if(rows<=n/2)
            {
                stars+=2;
                spaces-=1;
            }
            else
            {
                stars-=2;
                spaces+=1;
            }
            System.out.print("\n");
            rows++;
        }
    }
}