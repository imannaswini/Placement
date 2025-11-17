package day2.Inheritence;
import java.util.Scanner;

// Superclass Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Student inherits Person
class Student extends Person {
    String university;

    Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
}

// Subclass Graduate inherits Student
class Graduate extends Student {
    int graduationYear;

    Graduate(String name, int age, String university, int graduationYear) {
        super(name, age, university);
        this.graduationYear = graduationYear;
    }

    void display() {
        System.out.println("Graduate " + name + ", Age: " + age +
                ", University: " + university + ", Year: " + graduationYear);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String university = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());

        Graduate g = new Graduate(name, age, university, year);
        g.display();
    }
}