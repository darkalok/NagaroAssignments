package Session17;

import java.util.Scanner;

public class Strings_isPalindrome {
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

        public static void main(String args[]) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            boolean ans = isPalindrome(str);
            System.out.println(ans);
        }
    }


