package day2.Constructors;

import java.util.Scanner;

class Professor {
    public int id;
    public String name;
    public int salary;  //class variables are always private by default

    public Professor() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0;
    }

    public Professor(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(this.id + " " + this.name + " " + this.salary);
    }
}

public class ProfessorManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Professor[] professors = new Professor[N];

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int salary = sc.nextInt();

            professors[i] = new Professor(id, name, salary);
        }

        for (int i = 0; i < N; i++) {
            if (professors[i].salary >= 20000) {
                professors[i].display();
            }
        }
        
        sc.close();
    }
}