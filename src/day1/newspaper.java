/*Here is the text extracted from the image:

---

**The newspaper Agency**

Each Sunday, a newspaper agency sells w copies of a special edition newspaper for Rs.x per copy. 
The cost to the agency of each newspaper is Rs.y. 
The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. 
The newspaper agency wants to calculate the profit which it obtains only on Sundays. 
Can you please help them out by writing a program to compute the profit if w, x, and y are given.

**Input Format:** Input consists of 3 integers: w, x, and y. w is the number of copies sold, x is the cost per copy and y is the cost the agency spends per copy.
**Output Format:** The output consists of a single integer which corresponds to the profit obtained by the newspaper agency.

**SAMPLE INPUT:**
1000
2
1

**SAMPLE OUTPUT:**
900 */

package day1;
import java.util.*;
public class newspaper
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("SAMPLE INPUT:");
        int w = sc.nextInt(); // number of copies sold
        int x = sc.nextInt(); // cost per copy
        int y = sc.nextInt(); // cost spent per copy

        int revenue = w * x; // total revenue
        int cost = (w * y) + 100; // total cost including fixed cost
        int profit = revenue - cost; // profit calculation

        System.out.println("\nSAMPLE OUTPUT:");
        System.out.println(profit);
    }
        
    
}
