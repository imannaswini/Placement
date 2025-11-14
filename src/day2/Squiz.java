/*Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. This week's competition was a Team event and students who register for the event will be given a unique registration code N. The participants are teamed into 10 teams and the team to which a participant is assigned depends on the absolute difference between the first and last digit in the registration code.

The event organisers wanted your help in writing an automated program that will ease their job of assigning teams to the participants. If the registration number given is less than 10, then the program should display "Invalid Input".

**Input Format**
The only line of input contains an integer N.

**Output Format**
Output the absolute difference between the first and last digit of N.

**Sample Input**
345

**Sample Output**
2

**Sample Input**
9

**Sample Output**
Invalid Input */

package day2;
import java.util.*;
public class Squiz 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=10)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            String str=Integer.toString(n);
            int firstDigit=Character.getNumericValue(str.charAt(0));
            int lastDigit=Character.getNumericValue(str.charAt(str.length()-1));
            int absDiff=Math.abs(firstDigit-lastDigit);
            System.out.println(absDiff);
        }

        
    }
}
