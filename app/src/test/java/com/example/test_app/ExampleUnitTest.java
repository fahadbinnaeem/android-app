package com.example.test_app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isInCorrect() {
        assertNotEquals(5, 2 + 2);
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void addition1_isCorrect() {
        assertEquals(1, 2/2);
    }
    @Test
    public void addition2_isCorrect() {
        assertEquals(4, 2*2);
    }
}