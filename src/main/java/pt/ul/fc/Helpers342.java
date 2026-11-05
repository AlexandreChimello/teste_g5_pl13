package pt.ul.fc;

/** Small utility class. */
public class Helpers342 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean hasEvenParity(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean positive(int number) {
        return number > 0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int total(int a, int b) {
        return a + b;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int area(int width, int height) {
        return 2 * (width + height);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns value multiplied by 6.
     */
    public static int scale(int value) {
        return value * 6;
    }
}
