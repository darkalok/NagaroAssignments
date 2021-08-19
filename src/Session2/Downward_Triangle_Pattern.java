package Session2;

public class Downward_Triangle_Pattern {
    public static void main(String[] args) {
        int n =6;
        int row =1;
        int nst=n;
        int nsp=0;
        while(row<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }

            nst--;
            nsp++;
            System.out.println();
            row++;

        }
    }
}
