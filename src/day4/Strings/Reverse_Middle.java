package day4.Strings;
import java.util.*;
public class Reverse_Middle
{
    
    public static void reverse(char[] str,int start,int end)
    {
        while(start < end)
        {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String input =sc.next();
        char[] str = input.toCharArray();
        int len = str.length;
        int mid = len/2;
        reverse(str,0,mid-1);
        reverse(str,mid,len-1);
        reverse(str,0,len-1);
        System.out.println(str);
        
    

        

    }
    
}
