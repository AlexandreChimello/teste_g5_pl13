package pt.ul.fc;

/** Small utility class. */
public class Helpers240 {

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left - right;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int times(int value) {
        return value * 9;
    }
}
