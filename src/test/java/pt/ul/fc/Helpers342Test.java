package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers342Test {

    @Test
    void positiveWorks() {
        assertTrue(Helpers342.positive(3));
        assertFalse(Helpers342.positive(-3));
        assertFalse(Helpers342.positive(0));
    }

    @Test
    void capitalizeAllWorks() {
        assertEquals("HELLO", Helpers342.capitalizeAll("hello"));
        assertEquals("ABC", Helpers342.capitalizeAll("aBc"));
    }

    @Test
    void scaleWorks() {
        assertEquals(5 * 6, Helpers342.scale(5));
        assertEquals(0, Helpers342.scale(0));
    }
}
