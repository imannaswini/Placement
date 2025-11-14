/*Madhav is creating a bank account management system where each BankAccount should have an accountHolderName and balance as private data members. Create getter and setter methods for the account holder's name but prevent direct modification of the balance. Instead, provide methods for deposit and withdrawal operations to modify the balance.

**Input Format:**
* The first input is the account holder's name (string).
* The second input is the initial balance (double).
* The third input is an operation (deposit or withdraw).
* The fourth input is the amount to be deposited or withdrawn (double).

**Output Format:**
* Display the account holder's name and the updated balance after the transaction.

**Sample Input 1:**
Madhav
20000
deposit
5000

**Sample Output 1:**
Account Holder: Madhav, Updated Balance: 25000.0 */
package day2.classobj;
import java.util.*;
class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
public class BankAccountManagement 
{
    public static void main(String[] args) 
    {
        // Implementation for Bank Account 
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double InitialBalance =sc.nextDouble();
        String operation=sc.nextLine();
        double amount=sc.nextDouble();
        BankAccount account=new BankAccount(name, InitialBalance);
        if(operation.equals("deposit"))
        {
            account.deposit(amount);
        }
        else if(operation.equals("withdraw"))
        {
            account.withdraw(amount);
        }
        System.out.println("Account Holder: " + account.getAccountHolderName() + ", Updated Balance: " + account.getBalance());
        sc.close();

}
}
