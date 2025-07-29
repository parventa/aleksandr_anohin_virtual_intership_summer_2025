package org.my.app.teya_interview_task;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzzNumbersVersion2 {
    public static String printFizzBuzz(int number) {

        if (number < 1 || number > 100) {
            return "Please enter a number from 1 to 100";
        }

        String result = Stream.of(
                number % 3 == 0 ? "Fizz" : "",
                number % 5 == 0 ? "Buzz" : ""
        ).collect(Collectors.joining());

        if (result.isEmpty()) {
            return String.format("%d -> %s", number, number);
        }
        return String.format("%d -> %s", number, result);
    }

    public static void printAllListOfElements() {
        for (int i = 1; i < 101; i++) {

            String result = Stream.of(
                    i % 3 == 0 ? "Fizz" : "",
                    i % 5 == 0 ? "Buzz" : ""
            ).collect(Collectors.joining());

            if (result.isEmpty()) {
                System.out.printf("%d -> %d%n", i, i);
            } else {
                System.out.printf("%d -> %s%n", i, result);
            }
        }
    }
}
