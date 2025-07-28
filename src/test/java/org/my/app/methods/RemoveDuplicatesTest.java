package org.my.app.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void shouldReturnUniqueNumbersCount() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int expectedCount = 5;
        int actualCount = removeDuplicates.removeDuplicates(new int[] {1, 1, 3, 12, 4, 4, 6, 6, 1, 12});

        assertEquals(expectedCount, actualCount);
    }

}