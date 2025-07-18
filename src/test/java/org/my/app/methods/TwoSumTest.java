package org.my.app.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void targetIsAchieved() {
        int[] target = {3, 4};
        int[] actualAnswer = twoSum.targetSumOfTwoNumbers(new int[]{1, 2, 5, 6, 4}, 10);
        assertArrayEquals(target, actualAnswer);
    }

    @Test
    public void targetIsNotAchieved() {
        int[] target = null;
        int[] actualAnswer = twoSum.targetSumOfTwoNumbers(new int[]{1, 1, 3, 2, 4}, 10);
        assertArrayEquals(target, actualAnswer);
    }

}