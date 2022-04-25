import java.util.*;

public class Solution {
// Task
// Given a string, S , of length N  that is indexed from 0 to N-1, print its even-indexed 
// and odd-indexed characters as 2 space-separated strings on a single line

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++){
            String temp = sc.next();
            char[] temp_arr = temp.toCharArray();
            for(int k = 0; k<=1; k++){
                for(int j=k; j<temp_arr.length;j=j+2){
                    System.out.print(temp_arr[j]);
                }
                System.out.print(" ");
            }
            System.out.println();

        }    
        sc.close();
    }
}