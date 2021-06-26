package HackerRankProblem;

public class ArrayleftRotation {

public static void main(String[] args) {
    
  
int arr[] ={1,2,3,4,5};
int n = arr.length;
int k = 1;

leftRotate(arr, n, k);
    
}


static void leftRotate(int[] arr, int n, int k) {
    
    int mod = k % n;
    for (int i = 0; i < n; ++i)
    System.out.print(arr[(i + mod) % n] + " ");
    System.out.println();
    }
}