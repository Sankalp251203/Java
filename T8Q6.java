import java.util.Scanner;

public class T8Q6 {

    // Enum to represent the order statuses
    enum OrderStatus {
        PLACED,
        SHIPPED,
        DELIVERED
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the order status
        System.out.print("Enter the order status (PLACED, SHIPPED, DELIVERED): ");
        String inputStatus = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison

        try {
            // Get the corresponding OrderStatus enum constant from the input string
            OrderStatus status = OrderStatus.valueOf(inputStatus);

            // Use a switch statement to display the appropriate message based on the order status
            switch (status) {
                case PLACED:
                    System.out.println("Your order has been placed successfully!");
                    break;
                case SHIPPED:
                    System.out.println("Your order is on the way!");
                    break;
                case DELIVERED:
                    System.out.println("Your order has been delivered. Enjoy!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            // If the input doesn't match any of the enum constants, handle the exception
            System.out.println("Invalid order status. Please enter PLACED, SHIPPED, or DELIVERED.");
        } finally {
            scanner.close();
        }
    }
}
