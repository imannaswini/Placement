package day4.ExceptionHandling;
import java.util.*;
public class BankException
{
    public static void main(String[] args) {
        
  
    Scanner sc = new Scanner(System.in);
    int amount=0;
    while(true)
    {
        System.out.println("Enter the amount");
        String input = sc.nextLine();
        try{
            amount =Integer.parseInt(input);
            break;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input");
        }
    }
   System.out.println("Success Deposit");
}
}