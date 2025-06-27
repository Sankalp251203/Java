import java.util.Scanner;

public class T8Q5 {

    // Define the TrafficSignal enum with associated actions
    enum TrafficSignal {
        RED("Stop"),
        YELLOW("Caution"),
        GREEN("Go");

        private final String action;

        // Constructor to associate the action with the signal
        TrafficSignal(String action) {
            this.action = action;
        }

        // Method to get the action associated with the signal
        public String getAction() {
            return action;
        }
    }

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a traffic signal
        System.out.print("Enter a traffic signal (RED, YELLOW, GREEN): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            // Convert the input string to the corresponding enum constant
            TrafficSignal signal = TrafficSignal.valueOf(input);

            // Print the corresponding action for the signal
            System.out.println("Action: " + signal.getAction());
        } catch (IllegalArgumentException e) {
            // Handle the case where the user enters an invalid signal
            System.out.println("Invalid traffic signal. Please enter RED, YELLOW, or GREEN.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
