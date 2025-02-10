import java.util.Scanner;

public class CTOF {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = myObj.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C is equal to " + fahrenheit + " °F.");
    }
}
