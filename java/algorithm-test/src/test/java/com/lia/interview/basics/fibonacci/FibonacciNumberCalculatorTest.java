package com.lia.interview.basics.fibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberCalculatorTest {

    @Nested
    @DisplayName("Position 0")
    class Position0 {
        @Test
        @DisplayName("should return 0")
        void shouldReturnZero() {
            assertEquals(0, FibonacciNumberCalculator.getFibonacciNumber(0));
        }
    }

    @Nested
    @DisplayName("Position 1")
    class Position1 {
        @Test
        @DisplayName("should return 1")
        void shouldReturnOne() {
            assertEquals(1, FibonacciNumberCalculator.getFibonacciNumber(1));
        }
    }

    @Nested
    @DisplayName("Position 2")
    class Position2 {
        @Test
        @DisplayName("should return 1")
        void shouldReturnOne() {
            assertEquals(1, FibonacciNumberCalculator.getFibonacciNumber(2));
        }
    }

    @Nested
    @DisplayName("Position 6")
    class Position6 {
        @Test
        @DisplayName("should return 8")
        void shouldReturnEight() {
            assertEquals(8, FibonacciNumberCalculator.getFibonacciNumber(6));
        }
    }

    @Nested
    @DisplayName("Position 10")
    class Position10 {
        @Test
        @DisplayName("should return 55")
        void shouldReturnFiftyFive() {
            assertEquals(55, FibonacciNumberCalculator.getFibonacciNumber(10));
        }
    }

    @Nested
    @DisplayName("Position 45")
    class Position45 {
        @Test
        @DisplayName("should return 1134903170")
        void shouldReturnLargeNumber() {
            assertEquals(1134903170, FibonacciNumberCalculator.getFibonacciNumber(45));
        }
    }
}