package Collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection {

    public static void main(String[] args) {
        
    
    // ArrayList<String> arr = new ArrayList<String>();
    // for(int i=0; i<5;i++){
    //     Scanner s= new Scanner(System.in);
    //     arr.add(s.nextLine());        
    //   }
     
    //   System.out.println("Inserted Array:");
    //   for(int i=0;i<5;i++){
          
    //       System.out.println(arr.get(i));
    //   }
    //  LinkedList<String> list = new LinkedList<String>();
    //  list.add("Ravi");
    //  list.addFirst("Gaikwad");
    // Iterator<String> itr = list.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }
            HashMap<String , String> map = new HashMap<String , String>();
            map.put("1", "java ");
            map.put("2", "Ad Java");
            map.put("3", "javaSript");
            
            for(int i=1;i<=3;i++){
            System.out.println(map.get("i"));
            
        }

   }
    
}
