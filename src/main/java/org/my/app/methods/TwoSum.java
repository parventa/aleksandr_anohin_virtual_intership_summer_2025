package org.my.app.methods;

public class TwoSum {

    public int[] targetSumOfTwoNumbers(int[] number, int target) {

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target ) {
                    return new int[] {i, j};
                }
            }
        }
        System.out.println("Wrong numbers provided to get target");
        return null;
    }

}
