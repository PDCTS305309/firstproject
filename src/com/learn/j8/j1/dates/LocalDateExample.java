package com.learn.j8.j1.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2021, 12, 29);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 365);
        System.out.println("localDate2: " + localDate2);

        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfMonth: " + localDate.getDayOfMonth());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());

        System.out.println("Day of month using get: " + localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         *Modifying local date
         */
        System.out.println("plusDays: " + localDate.plusDays(2));
        System.out.println("plusMonths: " + localDate.plusMonths(2));
        System.out.println("plusYears: " + localDate.plusYears(2));

        System.out.println("with year: " + localDate.withYear(2025));
        System.out.println("with chronofeild: " + localDate.with(ChronoField.YEAR, 2015));

        System.out.println("with temporal adjustors : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("chronounits minus: " + localDate.minus(1, ChronoUnit.DECADES));

        // localDate: 2021-12-28
        //localDate1: 2021-12-29
        System.out.println("isEqual: " + localDate.isEqual(localDate1));
        System.out.println("isBefore: " + localDate.isBefore(localDate1));
        System.out.println("isAfter: " + localDate.isAfter(localDate1));

        /**
         * Unsupported
         * */

    }
}
