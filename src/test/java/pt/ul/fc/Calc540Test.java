package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc540Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 6, Calc540.amplify(5));
        assertEquals(0, Calc540.amplify(0));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Calc540.sum(3, 4));
        assertEquals(0, Calc540.sum(-2, 2));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, Calc540.cToF(100.0), 1e-9);
        assertEquals(32.0, Calc540.cToF(0.0), 1e-9);
    }
}
