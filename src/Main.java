import com.vojtechklimenta.homework2.Booking;
import com.vojtechklimenta.homework2.BookingManager;
import com.vojtechklimenta.homework2.Guest;
import com.vojtechklimenta.homework2.Room;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla", "Malíková", 1993, 03, 13);
        Guest guest2 = new Guest("Jan", "Dvořáček", 1995, 05, 5);

        System.out.println("Seznam hostů: \n"+guest1.getGuestSummary()+ "\n" + guest2.getGuestSummary());

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        System.out.println("\n Informace o pokojích");
        System.out.println(room1.getRoomsSummary());
        System.out.println(room2.getRoomsSummary());
        System.out.println(room3.getRoomsSummary());

        ArrayList<Guest> guestsSet1 = new ArrayList<>();
        guestsSet1.add(guest1);
        Booking booking1 = new Booking (room1, guestsSet1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), "rekreační");

        ArrayList<Guest> guestsSet2 = new ArrayList<>();
        guestsSet2.add(guest1);
        guestsSet2.add(guest2);
        Booking booking2 = new Booking (room3, guestsSet2, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "rekreační");

        Booking booking3 = new Booking(room2, guestsSet2); // test challenge

        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);
        bookingManager.addBooking(booking3);

        bookingManager.displayAllBookings();

    }
}