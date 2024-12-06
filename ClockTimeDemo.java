// Nathan Humphrey
// CSCE 145: Algorithmic Design I

import java.util.Scanner;

public class ClockTimeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;  // Boolean to control the repetition of the process

        // loop to repeat the time conversion process
        while (repeat) {
            try {
                // Step 1: Get input in military time format (hours, minutes, seconds)
                System.out.println("Enter the hours on the military clock (0-23):");
                int hours = scanner.nextInt();
                System.out.println("Enter the minutes on the military clock (0-59):");
                int minutes = scanner.nextInt();
                System.out.println("Enter the seconds on the military clock (0-59):");
                int seconds = scanner.nextInt();
                
                // consume the leftover newline character after nextInt()
                scanner.nextLine(); 

                // create the first TimeConverter object and update the time
                TimeConverter time1 = new TimeConverter();
                time1.updateTime(hours, minutes, seconds);

                // display the 12-hour time format
                System.out.print("12-hour clock time → ");
                time1.displayTime();

               
                System.out.println("Enter 24-hour clock time in the format 'hours:minutes:seconds':");
                String timeString = scanner.nextLine();  // Read full line of input
                TimeConverter time2 = new TimeConverter();
                time2.updateTime(timeString);  // Convert the string to time and update the object
                
                // Display the converted 12-hour time format
                System.out.print("12-hour clock time → ");
                time2.displayTime();

                // Ask if the user wants to do this again
                System.out.println("Would you like to do this again? Enter 'Yes' or 'No':");
                String response = scanner.nextLine();  // Read the response
                if (!response.equalsIgnoreCase("Yes")) {
                    repeat = false;  // Exit the loop if the user doesn't want to repeat
                }
            } catch (TimeException e) {
                // Handle time input errors (e.g., invalid hour, minute, or second)
                System.out.println(e.getMessage());
            } catch (Exception e) {
                // Catch all other unexpected errors (e.g., non-numeric input)
                System.out.println("EXCEPTION: Invalid input");
            }
        }
        
        // End the program
        System.out.println("Exiting the program");
        scanner.close();
    }
}


