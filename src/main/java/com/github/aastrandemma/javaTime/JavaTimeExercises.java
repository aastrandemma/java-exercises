package com.github.aastrandemma.javaTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class JavaTimeExercises {
    private static final ZoneId zone = ZoneId.of("Europe/Stockholm");
    private static final LocalDate dateNow = LocalDate.now(zone);
    private static final LocalDate birthday = LocalDate.of(1991, 1, 15);
    private static final String date = "2024-03-06";
    private static final LocalTime timeNow = LocalTime.now();
    private static final LocalDateTime dateTimeNow = LocalDateTime.now();
    public static void getJavaTimeExercises() {
        getJavaTimeExercise1();
        getJavaTimeExercise2();
        getJavaTimeExercise3();
        getJavaTimeExercise4();
        getJavaTimeExercise5();
        getJavaTimeExercise6();
        getJavaTimeExercise7();
        getJavaTimeExercise8();
        getJavaTimeExercise9();
        getJavaTimeExercise10();
        getJavaTimeExercise11();
        getJavaTimeExercise12();
        getJavaTimeExercise13();
        getJavaTimeExercise14();
        getJavaTimeExercise15();
        getJavaTimeExercise16();
    }

    private static void getJavaTimeExercise1() {
        // 1.Create a LocalDate of the current day and print it out.
        System.out.println("1. Today's date is: " + dateNow);
    }

    private static void getJavaTimeExercise2() {
        /* 2. Create a LocalDate of the current day and print it out in the
        following pattern using DateTimeFormatter: Thursday 29 march. */
        String dateFormatted = dateNow.format(DateTimeFormatter.ofPattern("EEEE d MMMM"));
        System.out.println("2. " + dateFormatted.substring(0, 1).toUpperCase() + dateFormatted.substring(1));
    }

    private static void getJavaTimeExercise3() {
        /* 3. Create a LocalDate of last Monday. Then print out the
        entire week in a loop using standard ISO format. */
        LocalDate previousMonday = dateNow.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        previousMonday = LocalDate.parse(DateTimeFormatter.ISO_LOCAL_DATE.format(previousMonday));
        System.out.println("3. Last monday was: " + previousMonday + ", following dates for that week is: ");
        for (int i = 0; i < 6; i++) {
            previousMonday = previousMonday.plusDays(1);
            String day = "";
            switch (i) {
                case 0 : day = "Tuesday: "; break;
                case 1 : day = "Wednesday: "; break;
                case 2 : day = "Thursday: "; break;
                case 3 : day = "Friday: "; break;
                case 4 : day = "Saturday: "; break;
                case 5 : day = "Sunday: "; break;
            }
            System.out.println(day + previousMonday);
        }
    }

    private static void getJavaTimeExercise4() {
        // 4. Create a LocalDate object from a String by using the .parse() method.
        LocalDate dateParse = LocalDate.parse(date);
        System.out.println("4. " + dateParse);
    }

    private static void getJavaTimeExercise5() {
        /* 5. The date time api provides enums for time units such as day and month.
        Create a LocalDate of your birthday and extract the day of week for that date.
        Ex. 1945-05-08 -> TUESDAY*/
        DayOfWeek birthdateDay = birthday.getDayOfWeek();
        System.out.println("5. I was born on a " + birthdateDay + ".");
    }

    private static void getJavaTimeExercise6() {
        /* 6. Create a LocalDate of current date plus 10 years and minus 10 months.
        From that date extract the month and print it out. */
        LocalDate futureCount = dateNow.plusYears(10).minusMonths(10);
        String monthFuture = futureCount.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("6. In 9 years and 2 months the month will be: " + monthFuture + ".");
    }

    private static void getJavaTimeExercise7() {
        /* 7. Using the LocalDate from exercise 6 and your birthdate, create a Period between
        your birthdate and the date from exercise 5. Print out the elapsed years, months and days. */
        Period period = Period.between(birthday, LocalDate.parse(date));
        System.out.println("7. From " + birthday + " to " + date + " it's been " + period.getYears()
                + " years, " + period.getMonths() + " months and " + period.getDays() + " days.");
    }

    private static void getJavaTimeExercise8() {
        /* 8. Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of
        current date and add the period you created to the current date.  */
        Period manipulatedTime = Period.of(4, 7, 29);
        LocalDate manipulatedDate = dateNow.plus(manipulatedTime);
        System.out.println("8. In 4 yeas, 7 months and 29 days the date will be: " + manipulatedDate + ".");
    }

    private static void getJavaTimeExercise9() {
        // 9. Create a LocalTime object of the current time.
        System.out.println("9. The time now is: " + timeNow);
    }

    private static void getJavaTimeExercise10() {
        // 10. Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        System.out.println("10. Nanoseconds now: " + timeNow.getNano());
    }

    private static void getJavaTimeExercise11() {
        // 11. Create a LocalTime object from a String using the .parse() method.
        String timeString = "16:30:30";
        LocalTime time = LocalTime.parse(timeString);
        System.out.println("11. " + time);
    }

    private static void getJavaTimeExercise12() {
        /* 12. Using DateTimeFormatter format LocalTime from current time and print it out
        as following pattern: 10:32:53 */
        System.out.println("12. The time now is: " + timeNow.format(DateTimeFormatter.ofPattern("HH.mm.ss")));
    }

    private static void getJavaTimeExercise13() {
        // 13. Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00
        System.out.println("13a. " + dateTimeNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd, HH.mm")));
        String[] date = dateTimeNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd, HH.mm")).split(",");
        System.out.println("13b. Date: " + date[0] + ", time: " + date[1] + ".");
    }

    private static void getJavaTimeExercise14() {
        /* 14. Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String
        that should look like this: thursday 5 april 10:00. */
        String dateFormatted = dateTimeNow.format(DateTimeFormatter.ofPattern("EEEE d MMMM HH.mm"));
        System.out.println("14. " + dateFormatted);
    }

    private static void getJavaTimeExercise15() {
        // 15. Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        LocalDateTime ldt = LocalDateTime.of(dateNow, timeNow);
        System.out.println("15. " + ldt);
    }

    private static void getJavaTimeExercise16() {
        /* 16. Create a LocalDateTime object. Then get the LocalDate and LocalTime components into
        separate objects of respective types from the LocalDateTime object. */
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        System.out.println("16. Date: " + ld + " time: " + lt);
    }
}