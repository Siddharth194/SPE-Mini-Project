package org.spe_mini;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ScientificCalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.sqrt(16), 0.0001);
        assertEquals(0.0, ScientificCalculator.sqrt(0), 0.0001);

        // Negative input should throw exception
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.sqrt(-4));
    }

    @Test
    void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(120, ScientificCalculator.factorial(5));

        // Negative input should throw exception
        assertThrows(ArithmeticException.class, () -> ScientificCalculator.factorial(-3));
    }

    @Test
    void testNaturalLog() {
        assertEquals(Math.log(1), ScientificCalculator.naturalLog(1), 0.0001);
        assertEquals(Math.log(Math.E), ScientificCalculator.naturalLog(Math.E), 0.0001);

        // Zero or negative input should throw exception
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.naturalLog(0));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.naturalLog(-2));
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.0001);
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.0001);
        assertEquals(0.25, ScientificCalculator.power(2, -2), 0.0001);
    }
}
