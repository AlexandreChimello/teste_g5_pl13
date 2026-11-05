package pt.ul.fc;

/** Small utility class. */
public class Basics839 {

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double avg(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left + right;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns value multiplied by 7.
     */
    public static int scale(int value) {
        return value * 7;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return 2 * (width + height);
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return -Math.abs(n);
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }
}
