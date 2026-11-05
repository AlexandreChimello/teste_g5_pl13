package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc295Test {

    @Test
    void scaleWorks() {
        assertEquals(5 * 7, Calc295.scale(5));
        assertEquals(0, Calc295.scale(0));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Calc295.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Calc295.celsiusToF(0.0), 1e-9);
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Calc295.divisibleByTwo(4));
        assertFalse(Calc295.divisibleByTwo(7));
    }
}
