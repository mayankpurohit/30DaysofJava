import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> phoneNum = new HashMap<String, Integer>();
        for(int i = 0; i< n; i++){
            String name = sc.next();
            Integer phone = sc.nextInt();
            phoneNum.put(name, phone);   
        }

        while(sc.hasNext()){
            String s = sc.next();
            if(phoneNum.containsKey(s)){
                System.out.println(s+"="+phoneNum.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
