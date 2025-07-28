package org.my.app.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses parentheses = new ValidParentheses();

    @Test
    public void test1ShouldReturnTrueIfValidParentheses() {
        assertTrue(parentheses.isValid("{}[]()"));
    }

    @Test
    public void test2ShouldReturnTrueIfValidParentheses() {
        assertTrue(parentheses.isValid("{[()]}"));
    }

    @Test
    public void shouldReturnFalseIfInvalidParentheses() {
        assertFalse(parentheses.isValid("{[()]}}"));
    }

}