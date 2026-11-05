package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit860Test {

    @Test
    void multiplyWorks() {
        assertEquals(5 * 4, MathKit860.multiply(5));
        assertEquals(0, MathKit860.multiply(0));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(MathKit860.divisibleByTwo(4));
        assertFalse(MathKit860.divisibleByTwo(7));
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, MathKit860.rectArea(3, 4));
        assertEquals(35, MathKit860.rectArea(5, 7));
    }
}
