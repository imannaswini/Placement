/*The IT giant "SoftCompInfo" has decided to transfer its message through the network using a new encryption technique. The company has decided to encrypt the data using the non-prime number concept. The message is in the form of a number and the sum of non-prime digits present in the message is used as the encryption key.
Write an algorithm to determine the encryption key.

**Example**
**Input :** 45673
**Output:** 10

**Explanation**
The non-prime digits are 4 and 6. Hence the output is 4+6 = 10. */
package day2.ControlStatement;
import java.util.*;
public class Encrypt 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        while(n>0)
        {
            int digit=n%10;
            if(digit==0 || digit==1 || digit==4 || digit==6 || digit==8 || digit==9)
            {
                sum=sum+digit;
            }
            n=n/10;
        }
        System.out.println(sum);

        sc.close();
    }
}
