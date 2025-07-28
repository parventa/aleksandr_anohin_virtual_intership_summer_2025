package org.my.app.methods;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortListWithoutSimilarNumbersTest {

    @Test
    public void shouldReturnSortedList() {
        List<Integer> expectedResult = List.of(1, 2, 3, 4, 5);
        List<Integer> actualResult = SortListWithoutSimilarNumbers.listWithoutDuplicates(new int[] {1, 2, 4, 1, 2, 3, 3, 2, 4, 3, 5, 5});

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnSortedListUsingStreamAPI() {
        List<Integer> expectedResult = List.of(1, 2, 3, 4, 5);
        List<Integer> actualResult = SortListWithoutSimilarNumbers.listWithoutDuplicatesVer2(new int[] {1, 2, 4, 1, 2, 3, 3, 2, 4, 3, 5, 5});

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnSortedListOfNamesUsingStreamAPI() {
        List<String> expectedResult = List.of("Aleksandr", "Evgenij", "Ivan", "Uldis");
        List<String> actualResult = SortListWithoutSimilarNumbers.listWithoutDuplicatedNames(new String[]{
                "Ivan", "Uldis", "Uldis", "Evgenij", "Evgenij", "Aleksandr"
        });

        assertEquals(expectedResult, actualResult);
    }

}