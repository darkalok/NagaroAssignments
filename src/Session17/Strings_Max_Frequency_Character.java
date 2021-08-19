package Session17;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {
    private static char max_frequency(String str){
//        char cc;
        int n =str.length();
        int[] freqArr = new int[26];
        for(int i = 0; i < n; i++) {
            char cc = str.charAt(i);
            int index = cc - 'a';
            freqArr[index]++;
        }
        int m = 26;
        int maxFreq=-1;
        int index2=-1;
        for (int j = 0; j < m; j++) {
            if(freqArr[j]>maxFreq){
                maxFreq=freqArr[j];
                index2=j;
            }
        }
        char cc2 = (char)(index2+'a');
        return cc2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char reqChar =max_frequency(str);
        System.out.println(reqChar);

    }
}
