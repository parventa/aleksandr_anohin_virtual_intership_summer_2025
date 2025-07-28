package org.my.app.methods;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates (int[] numbers) {
        return (int) Arrays.stream(numbers)
                .distinct()
                .count();
    }

}
