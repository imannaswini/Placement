package day4.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
//Checked Exception Example
/*
 * 1.IOException
 * 2.FileNotFoundException
 * 3.
 */
import java.util.*;
public class Checked
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader fr = new FileReader("file.txt");


        }
        catch(FileNotFoundException e)
        {
         System.out.println("File not found");
        }
    }
}
