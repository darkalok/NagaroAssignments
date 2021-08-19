package Session17;

import java.util.Scanner;

public class Strings_String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s+ " ";
        char prev = s.charAt(0);
        int count = 1;
        String str="";
        for(int curr=1; curr<s.length(); curr++){
            char cc = s.charAt(curr);
            if(cc==prev){
                count++;
            }else{
                if(count==1){
                    str=str+prev;
                }else{
                    str=str+prev+count;
                }
                prev=cc;
                count=1;
            }
        }
        System.out.println(str);
    }
}
