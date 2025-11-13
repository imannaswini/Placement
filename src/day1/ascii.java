package day1;
import java.util.*;
public class ascii 
{    public static void main(String[] args) 
    {
       int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit:");
        for(int i=1;i<=5;i++)
        {
            n = sc.nextInt();
            char c = (char) n;
            System.out.println( n + "- " + c);
        }
        
}
}