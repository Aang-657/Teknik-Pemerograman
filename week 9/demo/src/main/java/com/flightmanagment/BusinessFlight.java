package com.flightmanagment;

public class BusinessFlight extends Flight {

    public BusinessFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        // Hanya tambahkan penumpang VIP
        if (passenger.isVip()) {
            return getMutablePassengersList().add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        // Business flight tidak boleh menghapus penumpang sama sekali
        return false;
    }
}