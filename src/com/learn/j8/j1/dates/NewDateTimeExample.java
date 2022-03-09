package com.learn.j8.j1.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local date: " + localDate);
        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Local time: " + localTime);
        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local datetime: " + localDateTime);

    }
}
