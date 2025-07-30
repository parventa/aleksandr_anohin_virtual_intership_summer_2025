package org.my.app.teya_interview_task.combinations_version_1;

public class CombinationsToGetRequestedSumApp {
    public static void main(String[] args) {

        CombinationsToGetRequestedSum combo = new CombinationsToGetRequestedSum();
        var response = combo.calculateAllCombinations(100);
        combo.printResponse(response);
    }

}
