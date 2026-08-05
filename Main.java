
public class Main {

    public static void main(String[] args) {
        // To compile code run javac Main.java

        // To run code run java Main
        // java is case sensitive, so "main" is not the same as "Main"
        // java file must be saved with the same name as the class name (Main.java)
        // because java uses class name to find & run code.
        // It is important that you end the statement with a semicolon ;.
        // Text must be wrapped inside double quotations marks "".
        // Prints "Hello, World" to the terminal window. (Single line comment)

        /* The code below will print the words Hello World (Multi-line comment)
        to the screen, and it is amazing */
        System.out.println("Hello World"); // Prints Hello World to terminal window

        // Declaring (Creating) Variables
        String name = "Syam Sundar"; // String variable to store name
        int rank = 1; // Integer variable to store rank
        float percentage = 99.9f; // Float variable to store percentage
        boolean isPassed = true; // Boolean variable to store pass/fail status
        char grade = 'A'; // Char variable to store grade

        // Printing Variable Values
        System.out.println(name);
        System.out.println(rank);
        System.out.println(percentage);
        System.out.println(isPassed);
        System.out.println(grade);

        // Printing Combined Variable Values
        System.out.println(name + " has secured rank " + rank + " with percentage " + percentage + " and has passed: " + isPassed + " with grade " + grade);

        // Final Variable (Constants) When we do not want a variable's value to change, use the final keyword.
        final double PI = 3.14159; // Final variable to store value of PI
        System.out.println("Value of PI: " + PI);

        //Type Casting (Converting one data type to another)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double, widening conversion
        System.out.println("Value of myDouble: " + myDouble);

        double myDoubles = 9.78d;
        int myInts = (int) myDoubles; // Manual casting: double to int
        System.out.println("Value of myInts: " + myInts);

        // Calculating Area of Rectangle
        int length = 100;
        int width = 50;
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}
