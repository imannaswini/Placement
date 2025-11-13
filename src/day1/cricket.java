package day1;
import java.util.*;
public class cricket 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the width:");
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("Sample Output 1:");
        System.out.println(perimeter);
        System.out.println(area);
        



    }
}
