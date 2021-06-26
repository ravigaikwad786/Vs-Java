import java.util.Arrays;

class StringPermutation{

public static void main(String[] args) {

    String str1 ="ravi";
    String str2="ivra";

    if(isPermutation(str1 ,str2)){
        System.out.println("String is permutate");
    }
    else{
        System.out.println("Not permuted");
    }



}
static String sort(String s){
    char[] content = s.toCharArray();
    Arrays.sort(content);
    return new String(content);
}

private static boolean isPermutation(String nstr1, String nstr2) {
    if(nstr1.length()!=nstr2.length()){
        return false;
    }
    else{

        return sort(nstr1).equals(sort(nstr2));
    }
}
}