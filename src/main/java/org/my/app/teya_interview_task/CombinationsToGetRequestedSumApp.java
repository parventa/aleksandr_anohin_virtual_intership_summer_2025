package org.my.app.teya_interview_task;

public class CombinationsToGetRequestedSumApp {
    public static void main(String[] args) {

        CombinationsToGetRequestedSum combo = new CombinationsToGetRequestedSum();
        var response = combo.calculateAllCombinations(25);
        combo.printResponse(response);
    }
}
