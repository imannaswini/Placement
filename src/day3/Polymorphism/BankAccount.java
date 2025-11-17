/*Here is the text extracted from the image:

**PROGRAM 3**

Develop a program for a banking system for account management. Each account has the following attributes: AccountID, HolderName and Balance. Declare one constructor with three parameters that initialises the three attributes to some default values. Attributes must be validated.

AccountBalance must be greater than or equal to zero. If not, it is set to zero.

AccountID must be between 100 and 999. If not, set to -1 to indicate that it invalid.

Use the method setAccountBalance (...) to print account balance. Write one method: Credit to deposit money into the account. The method should return the new balance after the money deposit. Then create a class VIPAccount that inherits from class Account. The VIPAccount class overrides the method setAccountBalance (...) such that it prints the balance can be negative but no less than – 10000. The constructor of the VIPAccount class must call the constructor of the Account class.

**Input Format**

* The first line of the input consists of the account id.
* Next input is the account holder name.
* The third input is the initial balance.
* Fourth input is the amount to be credited.
* The last input is a negative balance (Argument to setAccountBalance in overridden method).

**Output Format**

* The first line of the output prints the account details.
* The next line prints the new balance after the amount is credited.
* Next output is the result of setAccountBalance (First base class method then derived class method). */
package day3.Polymorphism;

import java.util.Scanner;

/**
 * Base Account class.
 * Holds details for a standard bank account.
 */
class Account 
{
    protected int accountID;
    protected String holderName;
    protected double balance;

    // Constructor with parameters and validation
    public Account(int accountID, String holderName, double balance) 
    {
        // Validate and initialize accountID
        if (accountID >= 100 && accountID <= 999)
         {
            this.accountID = accountID;
        }
         else 
        {
            this.accountID = -1; // Invalid ID
        }

        this.holderName = holderName;

        // Validate and initialize balance
        if (balance >= 0) 
        {
            this.balance = balance;
        }
         else 
        {
            this.balance = 0; // Set to zero if negative
        }
    }

    /**
     * Sets the account balance according to standard rules.
     * Balance cannot be negative.
     * //The new balance to set.
     */
    public void setAccountBalance(double balance) 
    {
        if (balance >= 0)
         {
            this.balance = balance;
        } 
        else 
        {
            this.balance = 0; // Set to zero if negative
        }
        // Using "Balance: " to match the prompt's example
        System.out.println("Balance: " + this.balance);
    }

    
    public double credit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    /**
     * Returns a string representation of the account details.
     * This is used for the first line of output.
     */
    @Override
    public String toString() {
        return "AccountID: " + accountID + ", HolderName: " + holderName + ", Balance: " + balance;
    }
}

/**
 * VIPAccount class that inherits from Account.
 * It has different rules for its balance.
 */
class VIPAccount extends Account {

    /**
     * Constructor for VIPAccount.
     * It calls the parent (Account) constructor.
     */
    public VIPAccount(int accountID, String holderName, double balance) {
        // Call the parent class's constructor
        super(accountID, holderName, balance);
    }

   
    @Override
    public void setAccountBalance(double balance) {
        // Apply VIP validation rule
        if (balance >= -10000) {
            this.balance = balance;
        } else {
            this.balance = -10000; // Floor is -10000
        }
        System.out.println("Balance: " + this.balance);
    }
}


public class BankAccount
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

      

        // Input 1: Account ID
        int id = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        // Input 2: Account Holder Name
        String name = sc.nextLine();

        // Input 3: Initial Balance
        double initialBalance = sc.nextDouble();

        // Input 4: Amount to be credited
        double creditAmount = sc.nextDouble();

        // Input 5: Negative balance for setAccountBalance method
        double setBalanceAmount = sc.nextDouble();


        // Create one object of each class to test both methods
        Account acc = new Account(id, name, initialBalance);
        VIPAccount vipAcc = new VIPAccount(id, name, initialBalance);

        
        // --- Produce the required output ---

        // 1. First line: Print account details
        System.out.println(acc); // This calls the toString() method

        // 2. Second line: Print new balance after crediting
        double newBal = acc.credit(creditAmount);
        System.out.println("New Balance: " + newBal);

        // 3. Next output: Result of base class setAccountBalance
        acc.setAccountBalance(setBalanceAmount);

        // 4. Next output: Result of derived class setAccountBalance
        vipAcc.setAccountBalance(setBalanceAmount);

        sc.close();
    }
}