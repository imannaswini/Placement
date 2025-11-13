/* An investor wants to decide whether to invest in a stock based on these conditions:

If the stock price increased by more than 10% in the last month, the investor will buy the stock.
If the stock price stayed within 5-10% of its previous value, the investor will hold the stock.
If the stock price dropped by more than 5%, the investor will sell the stock.

Write a program that takes the stock's price from a month ago and the current price and determines whether the investor should "Buy," "Hold," or "Sell."

**Input Format:**
The stock price a month ago (float).
The current stock price (float).

**Output Format:**
"Buy," "Hold," or "Sell."

**Example:**
**Input:**
Previous Price: 100
Current Price: 115

**Output:**
Buy*/
package day1.ConditionalStatements;

public class stock 
{
    public static void main(String[] args)
    {
        float previousPrice = 100.0f; // Example previous price
        float currentPrice = 115.0f;  // Example current price

        float changePercent = ((currentPrice - previousPrice) / previousPrice) * 100;

        if (changePercent > 10) {
            System.out.println("Buy");
        } else if (changePercent >= 5 && changePercent <= 10) {
            System.out.println("Hold");
        } else if (changePercent < -5) {
            System.out.println("Sell");
        } else {
            System.out.println("Hold");
        }


    }

}
