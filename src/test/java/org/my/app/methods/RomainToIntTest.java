package org.my.app.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomainToIntTest {

    RomainToInt romainToInt = new RomainToInt();

    @Test
    public void test1ShouldReturnCorrectAnswer() {
        int expectedAnswer = 10;
        int actualAnswer = romainToInt.romainToInt("X");

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void test2ShouldReturnCorrectAnswer() {
        int expectedAnswer = 1994;
        int actualAnswer = romainToInt.romainToInt("MCMXCIV");

        assertEquals(expectedAnswer, actualAnswer);
    }

}