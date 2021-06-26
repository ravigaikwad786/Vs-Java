package HackerRankProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValaey {


        public static int countingValleys(int steps, String path) {
            
           int valleyCounter=0; int altitude=0;
           int n=steps;
    
            for(int i=0;i<n;i++){
             char ch = path.charAt(i);
                if(ch=='U'){
                    altitude++;
                    if(altitude==0){
                        valleyCounter++;
                    }
                }
                else{
                    altitude--;
                }
    
            }
            
            return valleyCounter;
        }
    
 
    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}