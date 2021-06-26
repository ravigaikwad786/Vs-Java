package String;

import java.util.Scanner;



public class RemoveSpace {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String inputString= s.nextLine();

        char[] newchar = inputString.toCharArray();
        String strinfwithoutspace="";

for(int i=0; i<newchar.length ; i++){

        if((newchar[i]!=' ')&&(newchar[i]!='\t')){
                strinfwithoutspace= strinfwithoutspace+newchar[i];
        }
}
System.out.println(strinfwithoutspace);
    }
}
