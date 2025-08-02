package com.lia.interview.basics.anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The AnagramCheckerTest
 *
 * @author quentin
 */
class AnagramCheckerTest {
    @ParameterizedTest
    @ValueSource(strings = { "Mary/Army", "Azerty/yzaret","economic/ComicOne" })
    void checkStringsAreAnagram(String input){
        String[] s = input.split("/");
        assertThat(AnagramChecker.areAnagram(s[0],s[1])).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = { "Marym/Army", "Azerty/yzareta", "zfhzqsdc/qsldh" })
    void checkStringsAreNotAnagram(String input){
        String[] s = input.split("/");
        assertThat(AnagramChecker.areAnagram(s[0],s[1])).isFalse();
    }
}