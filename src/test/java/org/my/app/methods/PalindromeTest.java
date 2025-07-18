package org.my.app.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void checkNumberIsPalindrome() {;
        assertTrue(palindrome.isPalindrome(123454321));
    }

    @Test
    public void checkNumberIsNotPalindrome() {;
        assertFalse(palindrome.isPalindrome(1278978));
    }

}