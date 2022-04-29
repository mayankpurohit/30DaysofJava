import java.util.Scanner;

public class Solution{

    private static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        while (x!=0)
        {
            x = (x & (x << 1));
            count++;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxConsecutiveOnes(n));
        
        sc.close();
    }
}