package org.my.app.teya_interview_task.fizz_buzz_version_1;

public class FizzBuzzPrintByNumbers {
    public static String printElement(int number) {

        if (number < 1 || number > 100) {
            return "Please enter a number from 1 to 100";
        }

            if (number % 15 == 0) {
                return number + " -> FizzBuzz";
            } else if (number % 3 == 0) {
                return number + " -> Fizz";
            } else if (number % 5 == 0) {
                return number + " -> Buzz";
            } else {
                return number + " -> " + number;
            }
    }


    public static void printAllListOfCombinations() {
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " -> FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " -> Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " -> Buzz");
            } else {
                System.out.println(i + " -> " + i);
            }
        }
    }

}
