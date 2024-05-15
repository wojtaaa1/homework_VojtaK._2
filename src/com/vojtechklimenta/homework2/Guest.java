package com.vojtechklimenta.homework2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Guest(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getGuestSummary() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. M. yyyy");
        String formmattedDate = birthDate.format(formatter);
        return firstName + " " + lastName + " (" + formmattedDate + ")";
    }

}
