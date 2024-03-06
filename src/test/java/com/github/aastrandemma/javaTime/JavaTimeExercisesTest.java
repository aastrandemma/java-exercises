package com.github.aastrandemma.javaTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class JavaTimeExercisesTest {
    ZoneId zone = ZoneId.of("Europe/Stockholm");
    LocalDate expectedDateNow = LocalDate.now(zone);

    @BeforeEach
    void setUp() {
    }

    @Test
    void getJavaTimeExercise1() {
        LocalDate actual = LocalDate.now(zone);
        assertEquals(expectedDateNow, actual);
    }

    @Test
    void getJavaTimeExercise2() {
        LocalDate dateNow = LocalDate.now(zone);
        String actual = dateNow.format(DateTimeFormatter.ofPattern("EEEE d MMMM"));
        String expected = expectedDateNow.format(DateTimeFormatter.ofPattern("EEEE d MMMM"));
        assertEquals(expected, actual);
    }
}