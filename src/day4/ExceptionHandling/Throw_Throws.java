/*
 * THROW:
 * Throw exception manually
 */
/*
 * THROWS:
 * predefined
 */
package day4.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Throw_Throws {
     static void readFile()throws FileNotFoundException
        {
          FileReader fr = new FileReader("Note.txt");
        }
    
    //It terminates pgm
    public static void main(String[] args)throws ArithmeticException {
        int age =14;
        // if(age<=18)
        // {
        //     throw new ArithmeticException("Not eligible");
        // }
        // System.out.println("You are Eligible");
        int sum=age/0;
        System.out.println(sum);
    }
    
}
