package HackerRankProblem;


import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
   
    
    
    public static void main(String[] args) throws IOException {
    
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    long n = scanner.nextLong();
   

    long result = repeatedString(s, n);

    System.out.println(result);
    scanner.close();
}

    private static long repeatedString(String s, long n) {
        int strlen = s.length();
        long q=0; long r=0;
        q=n/strlen;
        r=n%strlen;
        
        long partialstrlen = (r==0) ? 0:r ;

        long acount = q * getLetterCount(s , s.length()) + getLetterCount(s ,partialstrlen);
        
        return acount;
    }

    private static long getLetterCount(String s, long strLenth) {
        long count=0;
        for(int i=0;i<strLenth;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
}
