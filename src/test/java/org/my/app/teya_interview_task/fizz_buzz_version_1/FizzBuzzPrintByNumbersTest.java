package org.my.app.teya_interview_task.fizz_buzz_version_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzPrintByNumbersTest {

    @Test
    public void shouldPrintFizzIfNumberIsThree() {
        assertEquals(3 + " -> Fizz", FizzBuzzPrintByNumbers.printElement(3));
    }

    @Test
    public void shouldPrintBuzzIfNumberIsFive() {
        assertEquals(5 + " -> Buzz", FizzBuzzPrintByNumbers.printElement(5));
    }

    @Test
    public void shouldPrintNumberIfNumberIsNotMultipleOfFiveAndThree() {
        assertEquals(1 + " -> " + 1, FizzBuzzPrintByNumbers.printElement(1));
    }

    @Test
    public void shouldPrintFizzBuzzIfNumberIsThirty() {
        assertEquals(30 + " -> FizzBuzz", FizzBuzzPrintByNumbers.printElement(30));
    }

    @Test
    public void shouldReturnMessageIfNumberIsLessThenOne() {
        assertEquals("Please enter a number from 1 to 100", FizzBuzzPrintByNumbers.printElement(-1));
    }

    @Test
    public void shouldReturnMessageIfNumberIsMoreThenOneHundred() {
        assertEquals("Please enter a number from 1 to 100", FizzBuzzPrintByNumbers.printElement(121));
    }

}