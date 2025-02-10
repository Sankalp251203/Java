import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = myObj.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = myObj.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
    }
}

