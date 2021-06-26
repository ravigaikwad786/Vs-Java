import java.util.Arrays;
import java.util.Scanner;



public class UniqueChar {

    public static void main(String[] args) {
        String string = "vdfg";

        if(isUnique(string)){
            System.out.println("String hava unique Charcter");
        }
        else{
            System.out.println("Not unique");
        }
    }

    private static boolean isUnique(String str) {
        
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int i = str.length();
       System.out.println(i);
       
        return false;
    }


    
  




    
    
    // static boolean isUnique(String str) {
    //    if(str.length()> 128){
    //     return false;
    //     }

    //     boolean[] char_set = new boolean[128];
        
    //     for (int i= 0; i < str.length(); i++) {
    //          int val= str.charAt(i);
            
    //           if (char_set[val]) {//Already found this char in string
                
    //             return false;
    //              }
    //     char_set[val] = true;
    //     }

    // return true;
    // }

}
