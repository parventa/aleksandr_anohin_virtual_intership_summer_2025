package org.my.app.teya_interview_task.combinations_version_1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsToGetRequestedSumTest {

    CombinationsToGetRequestedSum combinations = new CombinationsToGetRequestedSum();

    @Test
    public void shouldReturnCorrectNumberOfCombinations() {
        List<int[]> actualResult = combinations.calculateAllCombinations(6);
        assertEquals(2, actualResult.size());
    }

    @Test
    public void shouldReturnEmptyListIfRequestIsNegative() {
        List<int[]> actualResult = combinations.calculateAllCombinations(-222);
        assertTrue(actualResult.isEmpty());
    }

    @Test
    public void shouldReturnEmptyListIfRequestIsZero() {
        List<int[]> actualResult = combinations.calculateAllCombinations(0);
        assertTrue(actualResult.isEmpty());
    }

}