package com.vojtechklimenta.homework2;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager(){
        this.bookings = new ArrayList<>();
    }
    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    public void displayAllBookings(){
        System.out.println("\n Informace o všech rezervacích");
        for (Booking booking : bookings){
            System.out.println(booking.getBookingSummary());
        }
    }
}
