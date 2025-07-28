package org.my.app.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListWithoutSimilarNumbers {

    public static List<Integer> listWithoutDuplicates(int[] inputNumbers) {

        List<Integer> numbers = new ArrayList<>();
        for (int numberToAdd : inputNumbers) {
            numbers.add(numberToAdd);
        }

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size() - 1;) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.remove(i + 1);
            } else {
                i++;
            }
        }
        return numbers;
    }

    public static List<Integer> listWithoutDuplicatesVer2(int[] inputNumbers) {
        return Arrays.stream(inputNumbers)
                .boxed()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> listWithoutDuplicatedNames(String[] inputNames) {
        return Arrays.stream(inputNames)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

}
