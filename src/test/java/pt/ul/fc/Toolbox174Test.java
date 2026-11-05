package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox174Test {

    @Test
    void areaWorks() {
        assertEquals(12, Toolbox174.area(3, 4));
        assertEquals(35, Toolbox174.area(5, 7));
    }

    @Test
    void totalWorks() {
        assertEquals(7, Toolbox174.total(3, 4));
        assertEquals(0, Toolbox174.total(-2, 2));
    }

    @Test
    void hasEvenParityWorks() {
        assertTrue(Toolbox174.hasEvenParity(4));
        assertFalse(Toolbox174.hasEvenParity(7));
    }
}
