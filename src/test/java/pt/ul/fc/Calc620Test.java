package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc620Test {

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Calc620.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Calc620.convertTemp(0.0), 1e-9);
    }

    @Test
    void amplifyWorks() {
        assertEquals(5 * 7, Calc620.amplify(5));
        assertEquals(0, Calc620.amplify(0));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Calc620.sum(3, 4));
        assertEquals(0, Calc620.sum(-2, 2));
    }
}
