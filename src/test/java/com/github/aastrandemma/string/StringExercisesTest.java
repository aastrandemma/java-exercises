package com.github.aastrandemma.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class StringExercisesTest {
    private ArrayList<String> list;
    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void getStringExercises1() {
        String word = "Test";
        assertEquals(4, word.length());
    }

    @Test
    void getStringExercises2() {
        String sentence = "Character at spot in sentence";
        assertEquals('t', sentence.charAt(6));
    }

    @Test
    void getStringExercises3() {
        String sentence = "Index of sentence";
        assertEquals(6, sentence.indexOf('o'));
    }

    @Test
    void getStringExercises4() {
        String sentence = "Concat this string using substring";
        assertEquals(" string usi", sentence.substring(11, 22));
    }

    @Test
    void getStringExercises5() {
        String sentence = "CONVERT THIS STRING TO LOWER CASES";
        assertEquals("convert this string to lower cases", sentence.toLowerCase());
    }

    @Test
    void getStringExercises6() {
        String sentence = "Switch the word 'hello' in this sentence";
        assertEquals("Switch the word 'bye' in this sentence", sentence.replace("hello", "bye"));
    }

    @Test
    void getStringExercises7() {
        String word = "\tTrim\t this";
        assertEquals("Trim\t this", word.trim());
    }

    @Test
    void getStringExercises8() {
        int num = 5;
        String word = num + "5";
        assertEquals("55", word);
    }

    @Test
    void getStringExercises9() {
        String sentence = "Test Test Test";
        String[] split = sentence.split(" ");

        assertEquals("Test", split[1]);

        list.add(0, "Test");
        list.add(1, "Test");
        list.add(2, "Test");

        assertEquals("Test", list.get(0));
        assertEquals("Test", list.get(1));
        assertEquals("Test", list.get(2));

        assertEquals(3, list.size());
    }

    @Test
    void getStringExercises10() {
        String sentence = "Test,Test,Test";
        String[] split = sentence.split(",");

        assertEquals("Test", split[0]);
    }

    @Test
    void getStringExercises11() {
        String word = "ConvertThis";
        char[] characters = word.toCharArray();

        assertEquals('v', characters[3]);
    }

    @Test
    void getStringExercises12() {
        char[] characters = {'T', 'e', 's', 't'};
        String word = String.valueOf(characters);

        assertEquals("Test", word);
    }
}