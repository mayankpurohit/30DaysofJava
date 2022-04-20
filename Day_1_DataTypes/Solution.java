import java.util.*;

class Solution {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double doub = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        Solution sol = new Solution();
        System.out.println(num + sol.i);
        System.out.println(doub + sol.d);
        System.out.println(sol.s + str);
        
        sc.close();
    }
}