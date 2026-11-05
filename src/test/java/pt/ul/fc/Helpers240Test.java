package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers240Test {

    @Test
    void rectAreaWorks() {
        assertEquals(12, Helpers240.rectArea(3, 4));
        assertEquals(35, Helpers240.rectArea(5, 7));
    }

    @Test
    void timesWorks() {
        assertEquals(5 * 9, Helpers240.times(5));
        assertEquals(0, Helpers240.times(0));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Helpers240.divisibleByTwo(4));
        assertFalse(Helpers240.divisibleByTwo(7));
    }
}
