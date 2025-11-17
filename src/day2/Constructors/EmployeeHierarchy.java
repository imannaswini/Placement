package day2.Constructors;

import java.util.Scanner;

/**
 * Base class Employee
 * Stores the basic attributes of an employee: ID and salary.
 */
class Employee {
    // Attributes are public for easy access by the subclass
    public int empId;
    public float salary;
 
    /**
     * Constructor for the Employee class.
     * Initializes the attributes.
     *
     * @param empId  The employee's ID.
     * @param salary The employee's salary.
     */
    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }
}

/**
 * Subclass empLevel
 * Extends the Employee class and adds logic to determine the
 * employee's level based on their salary.
 */
class empLevel extends Employee {

    /**
     * Constructor for the empLevel subclass.
     * It passes the received values up to the Employee (superclass)
     * constructor using the 'super' keyword.
     *
     * @param empId  The employee's ID.
     * @param salary The employee's salary.
     */
    public empLevel(int empId, float salary) {
        // Call the constructor of the parent class (Employee)
        super(empId, salary);
    }

    /**
     * Calculates the employee's level based on their salary.
     * Level 1: salary > 1000
     * Level 2: salary <= 1000
     *
     * @return The calculated level (1 or 2).
     */
    public int getLevel() {
        if (this.salary > 1000) {
            return 1; // Top management
        } else {
            return 2; // Staff
        }
    }

    /**
     * Prints the employee's details in the required output format.
     */
    public void displayDetails() {
        System.out.println(this.empId);
        System.out.println(this.salary);
        System.out.println(this.getLevel());
    }
}

/**
 * Main class to run the program.
 * Contains the main method to read input and produce output.
 */
public class EmployeeHierarchy {

    /**
     * The main entry point for the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input
        Scanner sc = new Scanner(System.in);

        // Read the employee ID (integer)
        int id = sc.nextInt();

        // Read the salary (float)
        float sal = sc.nextFloat();

        // Create a new empLevel object with the input data
        empLevel employee = new empLevel(id, sal);

        // Call the method to display the details as per the output format
        employee.displayDetails();

        // Close the scanner to free up resources
        sc.close();
    }
}