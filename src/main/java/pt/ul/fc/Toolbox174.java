package pt.ul.fc;

/** Small utility class. */
public class Toolbox174 {

    /**
     * Returns n multiplied by 4.
     */
    public static int times(int n) {
        return n * 4;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int maxOf(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean positive(int number) {
        return number > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return base * side;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 3.0;
    }
}
