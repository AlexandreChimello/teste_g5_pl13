package pt.ul.fc;

/** Small utility class. */
public class Toolbox573 {

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int sum(int left, int right) {
        return left + right;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns value multiplied by 5.
     */
    public static int scale(int value) {
        return value + 5;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return 2 * (width + height);
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value > 0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean divisibleByTwo(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }
}
