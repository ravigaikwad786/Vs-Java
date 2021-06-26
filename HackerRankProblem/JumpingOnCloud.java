package HackerRankProblem;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnCloud {
    public static void main(String[] args){
     
        int[] c ={0,0,1,0,0,1,0};
       // 0 0 0 0 1 0      0 0 1 0 0 1 0
        int result = JumpingOnClouds(c);
        System.out.println(result);

      

}

    private static int JumpingOnClouds(int[] c) {
        
        int len=c.length;
        int count=-1;
        for(int i=0;i<len;){

            if( i+2<len && c[i+2]==0){
                i=i+2;
            }
            else{
                i=i+1;
            }
                count++;
        }


        return count;
    }
}
