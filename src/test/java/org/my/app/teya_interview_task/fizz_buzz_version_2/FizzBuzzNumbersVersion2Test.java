package org.my.app.teya_interview_task.fizz_buzz_version_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzNumbersVersion2Test {

    @Test
    public void shouldPrintFizzIfNumberIsThree() {
        assertEquals(3 + " -> Fizz", FizzBuzzNumbersVersion2.printFizzBuzz(3));
    }

    @Test
    public void shouldPrintBuzzIfNumberIsFive() {
        assertEquals(5 + " -> Buzz", FizzBuzzNumbersVersion2.printFizzBuzz(5));
    }

    @Test
    public void shouldPrintNumberIfNumberIsNotMultipleOfFiveAndThree() {
        assertEquals(1 + " -> " + 1, FizzBuzzNumbersVersion2.printFizzBuzz(1));
    }

    @Test
    public void shouldPrintFizzBuzzIfNumberIsThirty() {
        assertEquals(30 + " -> FizzBuzz", FizzBuzzNumbersVersion2.printFizzBuzz(30));
    }

    @Test
    public void shouldReturnMessageIfNumberIsLessThenOne() {
        assertEquals("Please enter a number from 1 to 100", FizzBuzzNumbersVersion2.printFizzBuzz(-1));
    }

    @Test
    public void shouldReturnMessageIfNumberIsMoreThenOneHundred() {
        assertEquals("Please enter a number from 1 to 100", FizzBuzzNumbersVersion2.printFizzBuzz(121));
    }



}