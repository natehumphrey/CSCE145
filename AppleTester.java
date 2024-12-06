//Nathan Humphreyu
import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args) {
        // default constructor
        Apple apple1 = new Apple();

        //  parameterized constructor
        Scanner scanner = new Scanner(System.in);
        
        // get user input for apple type, weight, and price
        System.out.println("Enter the type of apple (Red Delicious, Golden Delicious, Gala, Granny Smith): ");
        String type = scanner.nextLine();
        
        System.out.println("Enter the weight of the apple in kilograms (between 0 and 2): ");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter the price of the apple: ");
        double price = scanner.nextDouble();

        // create the second apple using the user-provided values
        Apple apple2 = new Apple(type, weight, price);

        // display the output for both apples
        System.out.println("\nApple 1 (using default constructor):");
        apple1.writeOutput();
        
        System.out.println("\nApple 2 (using parameterized constructor):");
        apple2.writeOutput();
        
        scanner.close();  // close the scanner
    }
}
