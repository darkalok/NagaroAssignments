package Session2;//package Session2;
//
//import java.util.Scanner;
//
//public class AlexGoesShopping {
//    Scanner scn = new Scanner(System.in);
//    int n = scn.nextInt();//total items
//    int price[] = new int[n]; //array to store price of n
//                                                              // items
//            for(int i = 0;i<n;i++) {//price for each items
//
//        price[i] = scn.nextInt();
//    }
//
//    int q = scn.nextInt();//number of quaries
//            for(int i = 0;i<q;i++) {
//        int a = scn.nextInt();//taking ip for total money
//        int b = 0;//for storing a value so that we can comapre with next array item
//        int k = scn.nextInt();//taking ip for shopkeeper ans
//        int count = 0;//to store result
//        for (int j = 0; j < price.length; j++) {
//            // we just need to check if we can fully spend our money
//            // by buying current item
//            if (a % price[j] == 0)
//                count++;
//        }
//
//        // if we can buy from atleast k elements, then print yes
//        if (count >= k)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}
//
