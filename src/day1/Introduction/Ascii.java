/*  Ritik is working on a science project where he wants to build a magic board. This board should display a corresponding character for a given number input. However, Ritik wants the program to convert exactly four numbers into their respective ASCII characters without using any loops or iteration. Your task is to help Ritik develop this application.

**Sample Input 1:**
// Enter the digits:
65
66
67
68

**Sample Output 1:**
65-A
66-B
67-C
68-D*/
package day1.Introduction;
import java.util.*;
public class Ascii 
{    public static void main(String[] args) 
    {
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
        System.out.println(n4 + "-" + (char)n4); //Type casting from int to char
        
}
}