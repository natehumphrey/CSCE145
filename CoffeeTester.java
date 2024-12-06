// Nathan Humphrey
import java.util.Scanner;

public class CoffeeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            // create two coffee objects
            Coffee coffee1 = new Coffee();
            Coffee coffee2 = new Coffee();

            // get user input for the first coffee
            System.out.print("What’s the name of the first coffee? ");
            coffee1.setName(scanner.nextLine());
            System.out.print("What’s the caffeine content? ");
            int caffeine1 = scanner.nextInt();
            coffee1.setCaffeineContent(caffeine1);
            scanner.nextLine();  // Consume the leftover newline character

            // get user input for the second coffee
            System.out.print("What’s the name of the second coffee? ");
            coffee2.setName(scanner.nextLine());
            System.out.print("What’s the caffeine content? ");
            int caffeine2 = scanner.nextInt();
            coffee2.setCaffeineContent(caffeine2);
            scanner.nextLine();  // Consume the leftover newline character

            // output the details and risky amount of coffee 1
            System.out.println(coffee1.toString());
            System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() +
                    " before it’s dangerous to drink more.");

            // Output the details and risky amount of coffee 2
            System.out.println(coffee2.toString());
            System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() +
                    " before it’s dangerous to drink more.");

            // Check if the two coffee objects are the same
            boolean areEqual = coffee1.equals(coffee2);
            System.out.println("Are both coffee’s the same? " + areEqual);

            // ask the user for whether they want to create more coffee objects
            System.out.print("Do you want to create more coffee objects? Enter “Yes” or “No”: ");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("Yes"));

        // Close the scanner
        scanner.close();
    }
}
