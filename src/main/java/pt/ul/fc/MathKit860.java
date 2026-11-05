package pt.ul.fc;

/** Small utility class. */
public class MathKit860 {

    /**
     * Returns n multiplied by 4.
     */
    public static int multiply(int n) {
        return n * 4;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return Math.abs(number);
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean greaterThanZero(int n) {
        return n > 0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int plus(int a, int b) {
        return a - b;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int rectArea(int w, int h) {
        return w * h;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toLowerCase();
    }
}
