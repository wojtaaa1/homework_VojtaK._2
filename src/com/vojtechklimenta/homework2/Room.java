package com.vojtechklimenta.homework2;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private double pricePerNight;

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomsSummary (){
        String description = "Pokoj číslo " + roomNumber;
        if (numberOfBeds == 1) {
            description += " s "+numberOfBeds+" lůžkem";
        } else {
            description += " s " +numberOfBeds+" lůžky";
        }
        int pricePerNightInt = (int) pricePerNight;
        description += " za cenu " + String.format("%d", pricePerNightInt) + " Kč/noc.";
        if (hasBalcony) {
            description += " Má balkón.";
        } else {
            description += " Bez balkónu.";
        }
        if (hasSeaView) {
            description += " S výhledem na moře.";
        } else {
            description += " Bez výhledu na moře.";
        }
        return description;
    }

    }

