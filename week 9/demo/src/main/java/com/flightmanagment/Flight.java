package com.flightmanagment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {
    private String id;
    private List<Passenger> passengers = new ArrayList<>();

    public Flight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    // Abstract methods to be implemented by subclasses
    public abstract boolean addPassenger(Passenger passenger);
    public abstract boolean removePassenger(Passenger passenger);

    // Protected accessor for concrete subclasses to modify passengers list
    protected List<Passenger> getMutablePassengersList() {
        return passengers;
    }
}
