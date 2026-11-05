package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit739Test {

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", MathKit739.toUpper("hello"));
        assertEquals("ABC", MathKit739.toUpper("aBc"));
    }

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, MathKit739.distanceFromZero(5));
        assertEquals(5, MathKit739.distanceFromZero(-5));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, MathKit739.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, MathKit739.average(-1.0, 1.0), 1e-9);
    }
}
