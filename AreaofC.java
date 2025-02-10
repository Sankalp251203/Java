import java.util.Scanner;

public class AreaofC {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = myObj.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of circle is: " + area);
    }
}
