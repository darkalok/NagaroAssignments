package Session17;

import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str="";
        int prev =0;
        int curr =1;
        while(curr<s.length()){
            char prevChar =s.charAt(prev);
            char currChar = s.charAt(curr);
            int diff = currChar-prevChar;
            if(str.equals("")){
                str=str+ prevChar+diff+currChar;
            }else{
                str=str+diff+currChar;
            }
            prev++;
            curr++;

        }
        System.out.println(str);
    }
}
