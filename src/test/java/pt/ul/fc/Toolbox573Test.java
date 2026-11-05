package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox573Test {

    @Test
    void positiveWorks() {
        assertTrue(Toolbox573.positive(3));
        assertFalse(Toolbox573.positive(-3));
        assertFalse(Toolbox573.positive(0));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Toolbox573.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Toolbox573.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Toolbox573.pickMax(9, 2));
        assertEquals(9, Toolbox573.pickMax(2, 9));
    }
}
