package day2.classobj;
import java.util.*;

class EmployeeData {
    private String name;
    private double salary;

    public EmployeeData(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = Double.parseDouble(sc.nextLine());
        double newSalary = Double.parseDouble(sc.nextLine());

        EmployeeData emp = new EmployeeData(name, salary);
        emp.setSalary(newSalary);

        System.out.println("Employee Name: " + emp.getName() + ", Salary: " + emp.getSalary());
        sc.close();
    }
}
