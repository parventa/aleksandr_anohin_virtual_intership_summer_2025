package org.my.app.teya_interview_task.combinations_version_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsToGetSumVersion2Test {

    @Test
    public void shouldReturnCorrectNumberOfCombinations() {
        List<int[]> actualResult = CombinationsToGetSumVersion2.findCombos(6);
        assertEquals(2, actualResult.size());
    }

    @Test
    public void shouldReturnEmptyListIfRequestIsNegative() {
        List<int[]> actualResult = CombinationsToGetSumVersion2.findCombos(-222);
        assertTrue(actualResult.isEmpty());
    }

    @Test
    public void shouldReturnEmptyListIfRequestIsZero() {
        List<int[]> actualResult = CombinationsToGetSumVersion2.findCombos(0);
        assertTrue(actualResult.isEmpty());
    }

}