import java.util.Scanner;

public class Hellow {
 



public static void main(String[] args) {
 
  String str = new String("ravi");
  if(isPalindron(str)){
      System.out.println("String is Palindrom");
  }
   else{
       System.out.println("not Palondrom");
  
   }
}
   


private static boolean isPalindron(String str) {
 
    if(str==null)return false;
    int length=str.length();System.out.println(length);
    for(int i=0;i<length/2;i++){
        if(str.charAt(i)!=str.charAt(length-i-1)){
            return false;
        }
    }
    return true;
}
}
    


