package day1.ConditionalStatements;
import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (isKaprekar(n))
            System.out.println("Output: Yes");
        else
            System.out.println("Output: No");
    }

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;  // 1 is a Kaprekar number
        
        int sq = n * n;
        String str = Integer.toString(sq);
        
        for (int i = 1; i < str.length(); i++) {
            String left = str.substring(0, i);
            String right = str.substring(i);
            
            int leftNum = Integer.parseInt(left);
            int rightNum = Integer.parseInt(right);
            
            // Skip if any part is 0
            if (rightNum == 0 || leftNum == 0)
                continue;
            
            if (leftNum + rightNum == n)
                return true;
        }
        return false;
    }
}
