public class T2Q4 {
    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        int m = 6, n = 3; // 6 = 110, 3 = 011 in binary
        System.out.println("Bitwise Operators:");
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println("m << 1: " + (m << 1));
        System.out.println("m >> 1: " + (m >> 1));
        System.out.println();

        int c = 10;
        System.out.println("Assignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);
        System.out.println();

        int d = 5;
        System.out.println("Unary Operators:");
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("After d++: " + d);
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("After d--: " + d);
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println();

        int e = 10, f = 20;
        int max = (e > f) ? e : f;
        System.out.println("Ternary Operator:");
        System.out.println("Max of e and f is: " + max);
    }
}
