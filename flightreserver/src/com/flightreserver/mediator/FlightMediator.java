package com.flightreserver.mediator;

import com.flightreserver.model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightMediator {
    private final List<Flight> flights = new ArrayList<>();

    public void registerFlight(Flight flight) {
        flights.add(flight);
        System.out.println("Flight registered: " + flight);
    }

    public void getAvailability() {
        System.out.println("Checking flight availability...");
        for (Flight flight : flights) {
            flight.getAvailability();
        }
    }

    public void makeReservation(Long flightNumber) {
        Optional<Flight> optionalFlight = flights.stream()
                .filter(flight -> flight.getFlightNumber().equals(flightNumber)).findFirst();
        optionalFlight.ifPresentOrElse(Flight::reserveSeat, () -> System.out.println("Flight does not exist"));
    }
}
