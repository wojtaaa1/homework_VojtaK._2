package com.vojtechklimenta.homework2;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private List<Guest> guests;
    private LocalDate startDate;
    private LocalDate endDate;
    private String typeOfVacation;

    public Booking(Room room, List<Guest> guests, LocalDate startDate, LocalDate endDate, String typeOfVacation) {
        this.room = room;
        this.guests = guests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    public Booking (Room room, List<Guest> guests) {
        this.room = room;
        this.guests = guests;
        this.startDate = LocalDate.now();
        this.endDate = this.startDate.plusDays(6); // Rezervace na 6 nocí od dnešního data
        this.typeOfVacation = "rekreační";
    }

    public String getBookingSummary() {
        String summary = "";
        summary += "\n Pokoj: " + room.getRoomsSummary() + "\n";
        summary += "Hosté:\n";
        for (Guest guest : guests) {
            summary += guest.getGuestSummary() + "\n";
        }
        summary += "Datum začátku: " + startDate + "\n";
        summary += "Datum konce: " + endDate + "\n";
        summary += "Typ dovolené: " + typeOfVacation;
        return summary;
    }
}



