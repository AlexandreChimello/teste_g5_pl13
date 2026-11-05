package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox848Test {

    @Test
    void multiplyWorks() {
        assertEquals(5 * 5, Toolbox848.multiply(5));
        assertEquals(0, Toolbox848.multiply(0));
    }

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Toolbox848.greaterThanZero(3));
        assertFalse(Toolbox848.greaterThanZero(-3));
        assertFalse(Toolbox848.greaterThanZero(0));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Toolbox848.divisibleByTwo(4));
        assertFalse(Toolbox848.divisibleByTwo(7));
    }
}
