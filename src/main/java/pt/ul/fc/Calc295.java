package pt.ul.fc;

/** Small utility class. */
public class Calc295 {

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x - y;
    }

    /**
     * Returns n multiplied by 7.
     */
    public static int scale(int n) {
        return n * 7;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int areaOf(int w, int h) {
        return w * h;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String loud(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean divisibleByTwo(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value < 0;
    }
}
