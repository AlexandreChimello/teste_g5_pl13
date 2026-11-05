package pt.ul.fc;

/** Small utility class. */
public class Toolbox848 {

    /**
     * Returns n multiplied by 5.
     */
    public static int multiply(int n) {
        return n * 5;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int biggest(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toLowerCase();
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int rectArea(int base, int side) {
        return base * side;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean greaterThanZero(int n) {
        return n > 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int plus(int x, int y) {
        return x + y;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }
}
