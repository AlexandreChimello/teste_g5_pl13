package pt.ul.fc;

/** Small utility class. */
public class Toolbox543 {

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isAboveZero(int n) {
        return n > 0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 5.0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean hasEvenParity(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return -Math.abs(value);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns n multiplied by 5.
     */
    public static int amplify(int n) {
        return n * 5;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }
}
