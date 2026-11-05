package pt.ul.fc;

/** Small utility class. */
public class Calc261 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left - right;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns value multiplied by 8.
     */
    public static int scale(int value) {
        return value * 8;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean greaterThanZero(int n) {
        return n > 0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int surface(int base, int side) {
        return 2 * (base + side);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }
}
