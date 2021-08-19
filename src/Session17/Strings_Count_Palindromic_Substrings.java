package Session17;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
    private static boolean isPalindrome(String str) {
        // two pointers
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int count=0;
        for (int si = 0; si < n; si++) {
            for (int ei = si + 1; ei <= n; ei++) {
                String pal = str.substring(si, ei);
                //agar pal is actually a palindrome then count++
                if (isPalindrome(pal)) {
//                    System.out.println(pal);
                    count++;
                }

            }
        }
        System.out.println(count);
    }

}


