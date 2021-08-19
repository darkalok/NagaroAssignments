package Session17;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String reqStr  ="";

        for (int i = 0; i < n; i++) {
            int cc = str.charAt(i);
            System.out.println(cc);
            char reqChar;

            if(cc%2!=0){
                cc++;
            }else{
                cc--;
            }
            reqChar = (char)cc;
            reqStr = reqStr + reqChar;

        }
        System.out.println(reqStr);
    }
}
