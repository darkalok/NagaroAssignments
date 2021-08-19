package Session14;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {
    public static void arSum(int[] ar1, int[] ar2,int l1, int l2) {
        int m = 0;
        if (l1 > l2) {
            m = l1;
        } else {
            m = l2;
        }
        // size should be m + 1 as to contain carry forward if there is one.
        int[] Sum = new int[m + 1];
        int curr = 0;
        int i = l1 - 1;
        int j = l2 - 1;
        int l = m;
        while (l >= 0) {
            int sum = curr;
            if (i >= 0) {
                sum += ar1[i];
            }
            if (j >= 0) {
                sum += ar2[j];
            }
            int q = sum / 10;
            int r = sum % 10;
            Sum[l] = r;
            curr = q;

            i--;
            j--;
            l--;

        }
        for (i = 0; i <= m; i++) {
            if (i == 0 && Sum[i] == 0)
                continue; // don't print leading zero

            if (curr != 0) {
                System.out.print(curr + ", " + Sum[i] + ", ");
            } else {
                System.out.print(Sum[i] + ", ");
            }
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l1 = s.nextInt();
        int[] ar1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            ar1[i] = s.nextInt();
        }
        int l2 = s.nextInt();
        int[] ar2 = new int[l2];
        for (int i = 0; i < l2; i++) {
            ar2[i] = s.nextInt();
        }
        arSum(ar1, ar2, l1, l2);
    }
}
