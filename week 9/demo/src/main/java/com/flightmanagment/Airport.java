package com.flightmanagment;

public class Airport {
    public static void main(String[] args) {
        // Gunakan subclass konkret
        Flight economyFlight = new EconomyFlight("1"); // Tidak perlu parameter "Economy"
        Flight businessFlight = new BusinessFlight("2"); 

        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);

        // Test skenario bisnis
        businessFlight.addPassenger(james); // VIP - Bisa masuk business flight
        businessFlight.removePassenger(james); // Business flight tidak bisa remove
        businessFlight.addPassenger(mike); // Non-VIP - Gagal masuk business flight

        // Test skenario economy
        economyFlight.addPassenger(mike); // Non-VIP - Bisa masuk economy flight

        // Output
        System.out.println("Business flight passengers list:");
        businessFlight.getPassengersList().forEach(p -> 
            System.out.println(p.getName())
        ); // Hanya James (VIP)

        System.out.println("Economy flight passengers list:");
        economyFlight.getPassengersList().forEach(p -> 
            System.out.println(p.getName())
        ); // Mike
    }
}