package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc804Test {

    @Test
    void addWorks() {
        assertEquals(7, Calc804.add(3, 4));
        assertEquals(0, Calc804.add(-2, 2));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Calc804.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Calc804.celsiusToF(0.0), 1e-9);
    }

    @Test
    void positiveWorks() {
        assertTrue(Calc804.positive(3));
        assertFalse(Calc804.positive(-3));
        assertFalse(Calc804.positive(0));
    }
}
