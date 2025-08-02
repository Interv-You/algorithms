package com.lia.interview.basics.twosum;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The TwoSumTest
 *
 * @author quentin
 */
class TwoSumTest {
    @Test
    void testWithSimpleInput() {
        final var nums = new int[]{3, 6, 5, 15};
        final var target = 9;
        final var map = new HashMap<Integer, Integer>();
        final var output = TwoSum.get(nums, target);
        assertThat(output).containsExactlyInAnyOrder(0,1);
        assertEquals(target, (nums[0] + nums[1]));
    }

    @Test
    void testWithMediumInput() {
        final var nums = new int[]{3, 6, 5, 15, 26, 7, 19, 34};
        final var target = 34;
        final var output = TwoSum.get(nums, target);
        assertThat(output).containsExactlyInAnyOrder(3, 6);
        assertEquals(target, (nums[3] + nums[6]));
    }

    @Test
    void testWithLargeInput() {
        final var nums = new int[]{3, 6, 5, 15, 26, 7, 19, 6, 9, 23, 57, 38, 12, 34};
        final var target = 83;
        final var output = TwoSum.get(nums, target);
        assertThat(output).containsExactlyInAnyOrder(4, 10);
        assertEquals(target, (nums[4] + nums[10]));
    }
}