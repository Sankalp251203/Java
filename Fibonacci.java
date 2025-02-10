import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = myObj.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
