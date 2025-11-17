package day2.Constructors;
import java.util.Scanner;

/**
 * The Shape class stores dimensions for different shapes.
 * It uses "constructor overloading" to be created in different ways
 * (as a cube, a sphere, or a cylinder).
 *
 * This class is defined in the same file as Main, so it doesn't have 'public'.
 */
class Shape {
    // Member variables (or "fields")
    // These store the properties of a shape.
    int length;
    int breadth;
    int height;
    int radius;

    /**
     * Constructor 1: Default Constructor
     * This is a special constructor that takes no arguments.
     * The problem asks for it, but we don't use it in this main program.
     */
    public Shape() {
        // An empty constructor.
    }

    /**
     * Constructor 2: Cube (or Cuboid) Constructor
     * This constructor is called when we want to create a cube.
     * It takes length, breadth, and height as parameters.
     */
    public Shape(int length, int breadth, int height) {
        // 'this.length' refers to the member variable of the class (at the top).
        // 'length' (on the right) refers to the parameter passed into the constructor.
        // The 'this' keyword is used to avoid confusion between the two.
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    /**
     * Constructor 3: Sphere Constructor
     * This constructor is called when we want to create a sphere.
     * It takes just the radius as a parameter.
     */
    public Shape(int radius) {
        // We set the radius for the sphere.
        this.radius = radius;
    }

    /**
     * Constructor 4: Cylinder Constructor
     * This constructor is called when we want to create a cylinder.
     * It takes radius and height as parameters.
     */
    public Shape(int radius, int height) {
        // Set the radius and height for the cylinder.
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the volume of the cylinder.
     * NOTE: The problem names this 'calculateArea', but the sample output
     * (10 radius, 5 height -> 1570.0) shows it's calculating
     * VOLUME (Pi * r^2 * h, or 3.14 * 10*10 * 5 = 1570.0).
     *
     * @return The volume of the cylinder as a float.
     */
    public float calculateAreaOfCylinder() {
        // We use 3.14f (the 'f' makes it a float) for Pi.
        return 3.14f * this.radius * this.radius * this.height;
    }

    /**
     * Calculates the volume of the sphere.
     * NOTE: The problem names this 'calculateArea', but the sample output
     * (10 radius -> 4186.67) shows it's calculating
     * VOLUME (4/3 * Pi * r^3, or 1.333... * 3.14 * 10*10*10 = 4186.67).
     *
     * @return The volume of the sphere as a float.
     */
    public float calculateAreaOfSphere() {
        // (4 / 3.0f) ensures we do floating-point division.
        // If we wrote (4 / 3), Java would think it's integer math and the result would be 1.
        return (4 / 3.0f) * 3.14f * this.radius * this.radius * this.radius;
    }

    /**
     * Calculates the volume of the cube (cuboid).
     * NOTE: The problem names this 'calculateArea', but the sample output
     * (10, 20, 30 -> 6000) shows it's calculating
     * VOLUME (length * breadth * height, or 10 * 20 * 30 = 6000).
     *
     * @return The volume of the cube as an Integer.
     */
    public Integer calculateAreaOfCube() {
        return this.length * this.breadth * this.height;
    }
}


/**
 * The Main class is the entry point for our program.
 * It contains the 'main' method, which is where the program starts running.
 * This class must be 'public' and match the filename "Main.java".
 */
public class Main {

    /**
     * The main method, where our program begins.
     *
     * @param args Command line arguments (we don't use these here).
     */
    public static void main(String[] args) {
        // These variables will hold the user's input before we pass them to a Shape.
        int length, breadth, height, radius;

        // Create a Scanner object named 'sc' to read input from the System's input (the keyboard).
        Scanner sc = new Scanner(System.in);

        // Display the menu of options to the user.
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");

        // Read the integer (number) the user types and store it in the 'choice' variable.
        int choice = sc.nextInt();

        // The 'switch' statement is a clean way to perform different actions
        // based on the value of the 'choice' variable.
        switch (choice) {
            case 1:
                // This block runs if the user entered '1'
                System.out.println("length");
                length = sc.nextInt(); // Read the length
                System.out.println("breadth");
                breadth = sc.nextInt(); // Read the breadth
                System.out.println("height");
                height = sc.nextInt(); // Read the height

                // Create a new 'Shape' object and name it 'cube'.
                // We use the constructor that takes length, breadth, and height.
                Shape cube = new Shape(length, breadth, height);

                // Call the method on our 'cube' object and print the result.
                System.out.println("Area of Cube is " + cube.calculateAreaOfCube());
                break; // 'break' stops the switch statement.

            case 2:
                // This block runs if the user entered '2'
                System.out.println("radius");
                radius = sc.nextInt(); // Read the radius

                // Create a new 'Shape' object named 'sphere'
                // using the constructor that just takes a radius.
                Shape sphere = new Shape(radius);

                // Print the result. We use 'printf' for formatting.
                // "%.2f" means "print a floating-point number with 2 decimal places".
                // "\n" means "add a new line at the end".
                System.out.printf("Area of Sphere is %.2f\n", sphere.calculateAreaOfSphere());
                break;

            case 3:
                // This block runs if the user entered '3'
                System.out.println("radius");
                radius = sc.nextInt(); // Read the radius
                System.out.println("height");
                height = sc.nextInt(); // Read the height

                // Create a new 'Shape' object named 'cylinder'
                // using the constructor that takes radius and height.
                Shape cylinder = new Shape(radius, height);

                // Call the method and print the result.
                // The sample output had a typo "Cylinders", so we match it.
                System.out.println("Area of Cylinders is " + cylinder.calculateAreaOfCylinder());
                break;

            default:
                // This block runs if the user entered a number that wasn't 1, 2, or 3.
                System.out.println("Invalid choice.");
                break;
        }

        // It's good practice to close the scanner when you're done with it
        // to free up resources.
        sc.close();
    }
}