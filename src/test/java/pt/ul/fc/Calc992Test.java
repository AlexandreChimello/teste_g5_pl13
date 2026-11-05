package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc992Test {

    @Test
    void maxOfWorks() {
        assertEquals(9, Calc992.maxOf(9, 2));
        assertEquals(9, Calc992.maxOf(2, 9));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, Calc992.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Calc992.average(-1.0, 1.0), 1e-9);
    }

    @Test
    void shoutWorks() {
        assertEquals("HELLO", Calc992.shout("hello"));
        assertEquals("ABC", Calc992.shout("aBc"));
    }
}
