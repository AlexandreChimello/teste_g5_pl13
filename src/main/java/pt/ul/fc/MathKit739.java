package pt.ul.fc;

/** Small utility class. */
public class MathKit739 {

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns n multiplied by 5.
     */
    public static int amplify(int n) {
        return n + 5;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean greaterThanZero(int n) {
        return n < 0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int total(int a, int b) {
        return a + b;
    }
}
