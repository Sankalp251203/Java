import java.util.Scanner;

public class T6Q4 {

    // Method to check eligibility
    public static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Applicant must be at least 18 years old to register for a driving license.");
        }
        System.out.println("You are eligible to register for a driving license.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Call the method that may throw an exception
            checkEligibility(age);

        } catch (Exception e) {
            System.out.println("Registration failed: " + e.getMessage());
        } finally {
            System.out.println("Registration process completed.");
        }

        scanner.close();
    }
}
