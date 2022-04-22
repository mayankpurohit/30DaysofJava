import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        // Given an integer, , perform the following conditional actions:
        // If  is odd, print Weird
        // If  is even and in the inclusive range of  to 2,5 print Not Weird
        // If  is even and in the inclusive range of  to 6,20 print Weird
        // If  is even and greater than 20, print Not Weird
        // Complete the stub code provided in your editor to print whether or not  is weird
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0 && (N>=2 && N<=5)){
            System.out.println("Not Weird");
        }
        else if (N % 2 == 0 && (N>=6 && N<=20)){
            System.out.println("Weird");
        }
        else if (N % 2 == 0 && (N > 20)){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Weird");
        }
        sc.close();
    }
}