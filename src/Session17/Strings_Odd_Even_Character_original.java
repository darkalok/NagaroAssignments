package Session17;

import java.util.Scanner;

public class Strings_Odd_Even_Character_original {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String reqStr  ="";

        for (int i = 0; i < n; i++) {
            int cc = str.charAt(i);
            System.out.println(cc);
            char reqChar;
             if(cc==97){
                 cc=97;
             }else{
                 if(i%2!=0){//odd
                     cc++;
                 }else{//even
                     cc--;
                 }
             }

            reqChar = (char)cc;
            reqStr = reqStr + reqChar;

        }
        System.out.println(reqStr);
    }
}
