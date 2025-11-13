package day1;
import java.util.*;
public class Digisum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample Input:");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; 
            sum += digit;      
            n /= 10;          
        }
        System.out.println("\nSample Output:");
        System.out.println(sum);
        
    }
}
