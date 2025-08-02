package com.lia.interview.basics.palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * The PalindromeCheckerTest
 *
 * @author quentin
 */
class PalindromeCheckerTest {
    @Nested
    @DisplayName("Empty string")
    class EmptyString {
        @Test
        @DisplayName("should return true")
        void shouldReturnTrue() {
            assertTrue(PalindromeChecker.isPalindrome(""));
        }
    }

    @Nested
    @DisplayName("Simple palindrome: radar")
    class SimplePalindrome {
        @Test
        @DisplayName("should return true")
        void shouldReturnTrue() {
            assertTrue(PalindromeChecker.isPalindrome("radar"));
        }
    }

    @Nested
    @DisplayName("Palindrome with spaces: never odd or even")
    class PalindromeWithSpaces {
        @Test
        @DisplayName("should return true")
        void shouldReturnTrue() {
            assertTrue(PalindromeChecker.isPalindrome("never odd or even"));
        }
    }

    @Nested
    @DisplayName("Palindrome with mixed case: Race Car")
    class PalindromeWithMixedCase {
        @Test
        @DisplayName("should return true")
        void shouldReturnTrue() {
            assertTrue(PalindromeChecker.isPalindrome("Race Car"));
        }
    }

    @Nested
    @DisplayName("Long palindrome with spaces: do geese see god")
    class LongPalindromeWithSpaces {
        @Test
        @DisplayName("should return true")
        void shouldReturnTrue() {
            assertTrue(PalindromeChecker.isPalindrome("do geese see god"));
        }
    }

    @Nested
    @DisplayName("Non palindrome: hello world")
    class NonPalindrome {
        @Test
        @DisplayName("should return false")
        void shouldReturnFalse() {
            assertFalse(PalindromeChecker.isPalindrome("hello world"));
        }
    }

    @Nested
    @DisplayName("Non palindrome with spaces: race a car")
    class NonPalindromeWithSpaces {
        @Test
        @DisplayName("should return false")
        void shouldReturnFalse() {
            assertFalse(PalindromeChecker.isPalindrome("race a car"));
        }
    }

    @Nested
    @DisplayName("Non palindrome similar words: radar radarr")
    class NonPalindromeSimilarWords {
        @Test
        @DisplayName("should return false")
        void shouldReturnFalse() {
            assertFalse(PalindromeChecker.isPalindrome("radar radarr"));
        }
    }

}