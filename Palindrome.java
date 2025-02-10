import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = myObj.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        for (int i = processedInput.length() - 1; i >= 0; i--) {
            reversed += processedInput.charAt(i);
        }
        if (processedInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}

