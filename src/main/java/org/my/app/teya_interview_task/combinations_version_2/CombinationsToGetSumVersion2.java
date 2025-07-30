package org.my.app.teya_interview_task.combinations_version_2;

import java.util.ArrayList;
import java.util.List;

public class CombinationsToGetSumVersion2 {

    public final static int[] COINS = {25, 10, 5, 1};

    public static void printAnswer(int amount) {
        List<int[]> combinations = findCombos(amount);
        System.out.println("Combinations amount: " + combinations.size());

        for (int[] combo : combinations) {
            System.out.printf("QUARTERS: %d, DIMES: %d, NICKLES: %d, PENNIES: %d\n",
                    combo[0], combo[1], combo[2], combo[3]);
        }
    }

    public static List<int[]> findCombos(int amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount of money!");
            return new ArrayList<>();
        }
        int[] counts = new int[COINS.length];
        return findCombinations(amount, 0, counts);
    }

    public static List<int[]> findCombinations(int amount, int coinIndex, int[] counts) {
        List<int[]> combinations = new ArrayList<>();


        if (amount == 0) {
            combinations.add(counts.clone());
            return combinations;
        }

        if (coinIndex >= COINS.length) {
            return combinations;
        }

        for (int i = 0; i <= amount / COINS[coinIndex]; i++) {
            counts[coinIndex] = i;
            combinations.addAll(findCombinations(amount - i * COINS[coinIndex], coinIndex + 1, counts));
        }
        return combinations;
    }

}
