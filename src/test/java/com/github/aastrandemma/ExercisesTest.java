package com.github.aastrandemma;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExercisesTest {
    int expected;

    @BeforeEach
    void setUp() {
        expected = 1;
    }

    @Test
    void testGetChoice() {
        int actual = 1;
        assertEquals(expected, actual);

        int choice = 999;
        assertNotEquals(expected, choice);
    }
}