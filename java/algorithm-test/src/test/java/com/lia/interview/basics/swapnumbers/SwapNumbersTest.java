package com.lia.interview.basics.swapnumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The SwapNumbersTest
 *
 * @author quentin
 */
class SwapNumbersTest {
    @Test
    void testWith3And9() {
        final var swapNumber = new SwapNumbers(3, 9);
        swapNumber.swap();
        Assertions.assertEquals(9, swapNumber.getX());
        Assertions.assertEquals(3, swapNumber.getY());
    }

    @Test
    void testWith21And12() {
        final var swapNumber = new SwapNumbers(21, 12);
        swapNumber.swap();
        Assertions.assertEquals(9, swapNumber.getX());
        Assertions.assertEquals(3, swapNumber.getY());
    }

    @Test
    void testWith9And34() {
        final var swapNumber = new SwapNumbers(9, 34);
        swapNumber.swap();
        Assertions.assertEquals(9, swapNumber.getX());
        Assertions.assertEquals(3, swapNumber.getY());
    }
}