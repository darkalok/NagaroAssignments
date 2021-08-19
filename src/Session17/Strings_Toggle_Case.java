package Session17;

import java.util.Scanner;

public class Strings_Toggle_Case {
    private static String strings_toggle_case(String s) {
        int l = s.length();
        int i = 0;
        while(i<l){
            char cc = s.charAt(i);

            if(65<=cc && cc>=90){
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        strings_toggle_case(s);

    }
}
