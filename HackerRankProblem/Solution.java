package HackerRankProblem;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    
        
       
            Scanner scan=new Scanner(System.in);
            int[] colors=new int[101];
            int ans=0;
            int n=scan.nextInt();
           
            int color=scan.nextInt();
            colors[color]++;
           
            for(int i=0;i<n;i++){
               
                if(colors[color]%2 == 0){
                    ans++;
                    colors[color] = 0;
                }
            }
            System.out.println(ans);
        }



    
}

