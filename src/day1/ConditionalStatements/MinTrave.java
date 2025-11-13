package day1.ConditionalStatements;
import java.util.*;
public class MinTrave

{
    public static void main(String[] ags)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        double st=(Math.sqrt(2)*n)/v1;
        double et =(2*n)/v2;
        if(et>=st)
        {
            System.out.println("Elevator");
        }
        else
        {
            System.out.println("Stairs");
        }


    }
    

}
