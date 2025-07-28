package org.my.app.teya_interview_task;

import java.util.ArrayList;
import java.util.List;

public class CombinationsToGetRequestedSum {

    public static final int QUARTERS = 25;
    public static final int DIMES = 10;
    public static final int NICKLES = 5;
    public static final int PENNIES = 1;

    public void printResponse(List<int[]> combinations) {
        System.out.println("Numbers of combinations: " + combinations.size());

        for (int[] combination : combinations) {
            System.out.printf("QUARTERS: %d, DIMES: %d, NICKLES: %d, PENNIES: %d\n",
                    combination[0], combination[1], combination[2], combination[3]);
        }
    }

    public List<int[]> calculateAllCombinations(int request) {
        List<int[]> result = new ArrayList<>();

        if (request <= 0) {
            System.out.println("Please enter a positive amount of money!");
            return result;
        }

        for (int q = 0; q <= request; q += QUARTERS) {
            for (int d = 0; d <= request - q; d += DIMES) {
                for (int n = 0; n <= request - q - d; n += NICKLES) {
                    int p = request - q - d - n;
                        result.add(new int[]{
                                q / QUARTERS,
                                d / DIMES,
                                n / NICKLES,
                                p / PENNIES
                        });
                }
            }
        }
        return result;
    }
}


