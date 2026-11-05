package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc261Test {

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, Calc261.distanceFromZero(5));
        assertEquals(5, Calc261.distanceFromZero(-5));
    }

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Calc261.greaterThanZero(3));
        assertFalse(Calc261.greaterThanZero(-3));
        assertFalse(Calc261.greaterThanZero(0));
    }

    @Test
    void avgWorks() {
        assertEquals(5.0, Calc261.avg(4.0, 6.0), 1e-9);
        assertEquals(0.0, Calc261.avg(-1.0, 1.0), 1e-9);
    }
}
