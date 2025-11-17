package day3.AbstractClass;
import java.time.LocalDate;
import java.util.Scanner;

interface MaintenanceCharge {
    double computeMaintenanceCharge();
}

abstract class Account {
    String name;
    String number;
    double balance;
    LocalDate startDate;

    public Account(String name, String number, double balance, LocalDate startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {
    
    private static final int M_PER_YEAR = 50;

    public SavingsAccount(String name, String number, double balance, LocalDate startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintenanceCharge() {
        int startYear = this.startDate.getYear();
        int currentYear = LocalDate.now().getYear();
        int n = currentYear - startYear;

        if (n < 0) {
            n = 0;
        }
        
        return (2 * M_PER_YEAR * n) + 50;
    }
}

class CurrentAccount extends Account implements MaintenanceCharge {

    private static final int M_PER_YEAR = 100;

    public CurrentAccount(String name, String number, double balance, LocalDate startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintenanceCharge() {
        int startYear = this.startDate.getYear();
        int currentYear = LocalDate.now().getYear();
        int n = currentYear - startYear;

        if (n < 0) {
            n = 0;
        }
        
        return (M_PER_YEAR * n) + 200;
    }
}

public class BankingScenario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Savings Account:");
        System.out.print("Name: ");
        String saName = scanner.nextLine();
        System.out.print("Account Number: ");
        String saNumber = scanner.nextLine();
        System.out.print("Balance: ");
        double saBalance = scanner.nextDouble();
        System.out.print("Start Year (e.g., 2020): ");
        int saStartYear = scanner.nextInt();
        scanner.nextLine(); 

        LocalDate saStartDate = LocalDate.of(saStartYear, 1, 1);
        MaintenanceCharge savings = new SavingsAccount(saName, saNumber, saBalance, saStartDate);

        System.out.println("\nEnter details for Current Account:");
        System.out.print("Name: ");
        String caName = scanner.nextLine();
        System.out.print("Account Number: ");
        String caNumber = scanner.nextLine();
        System.out.print("Balance: ");
        double caBalance = scanner.nextDouble();
        System.out.print("Start Year (e.g., 2021): ");
        int caStartYear = scanner.nextInt();
        scanner.nextLine(); 

        LocalDate caStartDate = LocalDate.of(caStartYear, 1, 1);
        MaintenanceCharge current = new CurrentAccount(caName, caNumber, caBalance, caStartDate);
        
        scanner.close();

        System.out.println("\n--- Maintenance Charges (" + LocalDate.now().getYear() + ") ---");
        
        System.out.printf("Savings Account (%s) Charge: Rs.%.2f%n", 
                          ((Account) savings).getName(), 
                          savings.computeMaintenanceCharge());
                          
        System.out.printf("Current Account (%s) Charge: Rs.%.2f%n", 
                          ((Account) current).getName(), 
                          current.computeMaintenanceCharge());
    }
}