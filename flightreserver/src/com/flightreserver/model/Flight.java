package com.flightreserver.model;

public class Flight {
    private final Long flightNumber;

    public Flight(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getFlightNumber() {
        return flightNumber;
    }

    public void getAvailability() {
        System.out.println("Checking availability for flight " + flightNumber);
    }

    public void reserveSeat() {
        System.out.println("Reserving seat for flight " + flightNumber);
    }

    @Override
    public String toString() {
        return "Flight{" + "flightNumber='" + flightNumber + '\'' + '}';
    }
}
