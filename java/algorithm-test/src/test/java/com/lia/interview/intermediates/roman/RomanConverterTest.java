
package com.lia.interview.intermediates.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {

    @Nested
    @DisplayName("Basic numbers (1-10)")
    class BasicNumbers {
        @Test
        @DisplayName("should convert 1 to I")
        void shouldConvertOneToI() {
            assertEquals("I", RomanConverter.convert(1));
        }

        @Test
        @DisplayName("should convert 3 to III")
        void shouldConvertThreeToIII() {
            assertEquals("III", RomanConverter.convert(3));
        }

        @Test
        @DisplayName("should convert 4 to IV")
        void shouldConvertFourToIV() {
            assertEquals("IV", RomanConverter.convert(4));
        }

        @Test
        @DisplayName("should convert 5 to V")
        void shouldConvertFiveToV() {
            assertEquals("V", RomanConverter.convert(5));
        }

        @Test
        @DisplayName("should convert 9 to IX")
        void shouldConvertNineToIX() {
            assertEquals("IX", RomanConverter.convert(9));
        }
    }

    @Nested
    @DisplayName("Numbers with tens (10-99)")
    class NumbersWithTens {
        @Test
        @DisplayName("should convert 10 to X")
        void shouldConvertTenToX() {
            assertEquals("X", RomanConverter.convert(10));
        }

        @Test
        @DisplayName("should convert 40 to XL")
        void shouldConvertFortyToXL() {
            assertEquals("XL", RomanConverter.convert(40));
        }

        @Test
        @DisplayName("should convert 50 to L")
        void shouldConvertFiftyToL() {
            assertEquals("L", RomanConverter.convert(50));
        }

        @Test
        @DisplayName("should convert 90 to XC")
        void shouldConvertNinetyToXC() {
            assertEquals("XC", RomanConverter.convert(90));
        }

        @Test
        @DisplayName("should convert 58 to LVIII")
        void shouldConvertFiftyEightToLVIII() {
            assertEquals("LVIII", RomanConverter.convert(58));
        }
    }

    @Nested
    @DisplayName("Numbers with hundreds (100-999)")
    class NumbersWithHundreds {
        @Test
        @DisplayName("should convert 100 to C")
        void shouldConvertHundredToC() {
            assertEquals("C", RomanConverter.convert(100));
        }

        @Test
        @DisplayName("should convert 400 to CD")
        void shouldConvertFourHundredToCD() {
            assertEquals("CD", RomanConverter.convert(400));
        }

        @Test
        @DisplayName("should convert 500 to D")
        void shouldConvertFiveHundredToD() {
            assertEquals("D", RomanConverter.convert(500));
        }

        @Test
        @DisplayName("should convert 900 to CM")
        void shouldConvertNineHundredToCM() {
            assertEquals("CM", RomanConverter.convert(900));
        }

        @Test
        @DisplayName("should convert 444 to CDXLIV")
        void shouldConvertFourHundredFortyFourToCDXLIV() {
            assertEquals("CDXLIV", RomanConverter.convert(444));
        }
    }

    @Nested
    @DisplayName("Numbers with thousands (1000-3999)")
    class NumbersWithThousands {
        @Test
        @DisplayName("should convert 1000 to M")
        void shouldConvertThousandToM() {
            assertEquals("M", RomanConverter.convert(1000));
        }

        @Test
        @DisplayName("should convert 1994 to MCMXCIV")
        void shouldConvert1994ToMCMXCIV() {
            assertEquals("MCMXCIV", RomanConverter.convert(1994));
        }

        @Test
        @DisplayName("should convert 2023 to MMXXIII")
        void shouldConvert2023ToMMXXIII() {
            assertEquals("MMXXIII", RomanConverter.convert(2023));
        }

        @Test
        @DisplayName("should convert 3999 to MMMCMXCIX")
        void shouldConvert3999ToMMMCMXCIX() {
            assertEquals("MMMCMXCIX", RomanConverter.convert(3999));
        }
    }

    @Nested
    @DisplayName("Complex combinations")
    class ComplexCombinations {
        @Test
        @DisplayName("should convert 1449 to MCDXLIX")
        void shouldConvert1449ToMCDXLIX() {
            assertEquals("MCDXLIX", RomanConverter.convert(1449));
        }

        @Test
        @DisplayName("should convert 2999 to MMCMXCIX")
        void shouldConvert2999ToMMCMXCIX() {
            assertEquals("MMCMXCIX", RomanConverter.convert(2999));
        }

        @Test
        @DisplayName("should convert 3333 to MMMCCCXXXIII")
        void shouldConvert3333ToMMMCCCXXXIII() {
            assertEquals("MMMCCCXXXIII", RomanConverter.convert(3333));
        }
    }
}