package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics839Test {

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Basics839.greaterThanZero(3));
        assertFalse(Basics839.greaterThanZero(-3));
        assertFalse(Basics839.greaterThanZero(0));
    }

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Basics839.toUpper("hello"));
        assertEquals("ABC", Basics839.toUpper("aBc"));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Basics839.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Basics839.toFahrenheit(0.0), 1e-9);
    }
}
