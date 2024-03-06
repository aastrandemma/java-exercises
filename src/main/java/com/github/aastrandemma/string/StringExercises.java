package com.github.aastrandemma.string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExercises {
    public static void getStringExercises() {
        getStringExercises1();
        getStringExercises2();
        getStringExercises3();
        getStringExercises4();
        getStringExercises5();
        getStringExercises6();
        getStringExercises7();
        getStringExercises8();
        getStringExercises9();
        getStringExercises10();
        getStringExercises11();
        getStringExercises12();
    }

    public static void getStringExercises1() {
        // 1. What is the length of the String: "Java" ?
        String word = "Java";
        System.out.println("1. " + word.length());
    }

    public static void getStringExercises2() {
        /* 2. What char is at index position 6 in the following String:
        "Long example sentence" ? */
        String sentence = "Long example sentence";
        System.out.println("2. " + sentence.charAt(6));
    }

    public static void getStringExercises3() {
        /* 3. What is the index position of 'o' in the following String:
        "Even longer example sentence" ? */
        String sentence = "Even longer example sentence";
        System.out.println("3. " + sentence.indexOf('o'));
    }

    public static void getStringExercises4() {
         /* 4. Given the following String: "Ok this is not as long!"
        create a substring of only "not as long" (excluding the
        exclamation point) and print it out. */
        String sentence = "Ok this is not as long!";
        System.out.println("4. " + sentence.substring(11, 22));
    }

    public static void getStringExercises5() {
        /* 5. Convert the following String: "CAPS EQUALS SCREAMING" to
        lowercase and print it out. Then convert it back to
        uppercase and print it out again. */
        String sentence = "CAPS EQUALS SCREAMING";
        System.out.println("5. " + sentence.toLowerCase());
    }

    public static void getStringExercises6() {
        /* 6. Correct the following String: "Java is the worst
        programming language!" by replacing the (obviously
        incorrect) word "worst" with the word "best". Then print
        out the sentence. */
        String sentence = "Java is the worst programming language!";
        System.out.println("6. " + sentence.replace("worst", "best"));
    }

    public static void getStringExercises7() {
         /* 7. What is the output of the following String:
        "\tJ\ta\tv\ta\t" after you trim it? */
        String word = "\tJ\ta\tv\ta\t";
        System.out.println("7. Before trim: " + word + " after trim: " + word.trim());
    }

    public static void getStringExercises8() {
        /* 8. Parse the following int: 20 to a String and add a 20 to the
        end of the String. Printing it out should return: "2020". */
        int num = 20;
        String year = num + "20";
        System.out.println("8. " + year);
    }

    public static void getStringExercises9() {
        /* 9. Oil and water don't go well together. Given the String:
        "Oil and Water", split them up into the words "Oil","Water"
        and store them in a String array. */
        String sentence = "Oil and Water";
        String[] splitSentence = sentence.split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (String split : splitSentence) {
            if (!split.equals("and")) {
                words.add(split);
            }
        }
        System.out.println("9. " + Arrays.toString(words.toArray()));
    }

    public static void getStringExercises10() {
        /* 10. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
        into an array. Print out all names separately. */
        String sentence = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = sentence.split(",");
        System.out.println("10. ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void getStringExercises11() {
        /* 11. Convert the following String: "ThisShouldBeConverted" to
        a char array. Iterate through the char array and print out each element. */
        String word = "ThisShouldBeConverted";
        char[] characters = word.toCharArray();
        System.out.println("11. ");
        for (char c : characters) {
            System.out.println(c);
        }
    }

    public static void getStringExercises12() {
        // 12. Convert the following char[]: {'J','a','v','a'} to a String and print it out.
        char[] characters = {'J', 'a', 'v', 'a'};
        String word = String.valueOf(characters);
        System.out.println("12. " + word);
    }
}