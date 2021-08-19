package Session2;

 class Pattern7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 5;
        int row = 1;
        int nst = n;
        int nsp=n-1;

        while(row <= n) {

            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }


            int cst = 1;
            while(cst <= nst) {
                if(row == 1 || cst == 1 || row == n || cst == n) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }

                cst++;
            }
            nsp--;
            System.out.println();
            row++;
        }
    }

}
