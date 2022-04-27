import java.util.*;



public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for (int i=0; i<n; i++){
            intArray[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
        sc.close();
    }
}
