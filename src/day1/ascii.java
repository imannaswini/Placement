package day1;
import java.util.*;
public class ascii 
{    public static void main(String[] args) 
    {
    //    int n;
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a digit:");
    //     for(int i=1;i<=5;i++)
    //     {
    //         n = sc.nextInt();
    //         char c = (char) n;
    //         System.out.println( n + "- " + c);
    //     }
     Scanner sc = new Scanner(System.in);

        System.out.println("Sample Input 1:");
        System.out.println("Enter the digits:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println("\nSample Output 1:");
        System.out.println(n1 + "-" + (char)n1);
        System.out.println(n2 + "-" + (char)n2);
        System.out.println(n3 + "-" + (char)n3);
        System.out.println(n4 + "-" + (char)n4);
        
}
}