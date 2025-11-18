package day4.ExceptionHandling;
/*
 * Arithematic Exception
 * ArrayOutOfBound
 */
public class Unchecked {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        try
        {
            System.out.println(arr[5]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Array Index");
        }
        finally
        {
            System.err.println("Finally block Executed");
        }
    }
    
}
