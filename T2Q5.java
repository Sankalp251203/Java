import java.util.Scanner;

public class T2Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usdAmount = myObj.nextDouble();
        double exchangeRate = 82.75;
        double inrAmount = usdAmount * exchangeRate;
        System.out.println("Converted amount in INR (double): " + inrAmount);
        //narrow to int
        int roundedInrAmount = (int) inrAmount;
        System.out.println("Converted amount in INR (int): " + roundedInrAmount);
        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;
        System.out.println("Widening Conversion:");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to double: " + doubleValue);
        //narrow to byte
        double anotherDouble = 256.78;
        int anotherInt = (int) anotherDouble;
        byte anotherByte = (byte) anotherInt;
        System.out.println("\nNarrowing Conversion:");
        System.out.println("Double value: " + anotherDouble);
        System.out.println("Converted to int: " + anotherInt);
        System.out.println("Converted to byte (with overflow): " + anotherByte);

    }
}
