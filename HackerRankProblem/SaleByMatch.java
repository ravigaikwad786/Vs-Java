package HackerRankProblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class SaleByMatch {
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

        int result = sockMerchant(n, ar);

            System.out.println(result);
        scanner.close();
    }

     static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            int el=ar[i];
            if(set.contains(el)){
                set.remove(el);
                count++;
            }
            else{
                set.add(el);
            }

        }
        return count;

       

}
}