package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox543Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 5, Toolbox543.amplify(5));
        assertEquals(0, Toolbox543.amplify(0));
    }

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Toolbox543.toUpper("hello"));
        assertEquals("ABC", Toolbox543.toUpper("aBc"));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Toolbox543.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Toolbox543.toFahrenheit(0.0), 1e-9);
    }
}
