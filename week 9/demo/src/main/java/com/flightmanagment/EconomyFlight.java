package com.flightmanagment;

import java.util.List;

public class EconomyFlight extends Flight {
    
    public EconomyFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        // Mengakses list melalui method protected dari parent class
        return getMutablePassengersList().add(passenger);
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        // Implementasi logika spesifik EconomyFlight
        if (!passenger.isVip()) {
            return getMutablePassengersList().remove(passenger);
        }
        return false;
    }
}