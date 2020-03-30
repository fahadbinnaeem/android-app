package com.example.test_app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoreTestCases {
    @Test
    public void isInCorrect() {
        assertNotEquals(5, 2 + 2);
    }
    @Test
    public void isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void division_isCorrect() {
        assertEquals(1, 2/2);
    }
    @Test
    public void multiplication_isCorrect() {
        assertEquals(4, 2*2);
    }
}
