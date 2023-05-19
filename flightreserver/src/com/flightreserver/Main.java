package com.flightreserver;

import com.flightreserver.model.Flight;
import com.flightreserver.interpreter.AvailabilityInterpreter;
import com.flightreserver.interpreter.QueryInterpreter;
import com.flightreserver.interpreter.ReservationInterpreter;
import com.flightreserver.mediator.FlightMediator;

public class Main {
    public static void main(String[] args) {
        FlightMediator mediator = new FlightMediator();
        QueryInterpreter availabilityInterpreter = new AvailabilityInterpreter(mediator);
        QueryInterpreter reservationInterpreter = new ReservationInterpreter(mediator);

        Flight flight1 = new Flight(35010L);
        Flight flight2 = new Flight(90921L);

        mediator.registerFlight(flight1);
        mediator.registerFlight(flight2);

        String availabilityQuery = "Get availability for flights";
        availabilityInterpreter.interpret(availabilityQuery);

        String reservationQuery = "Make reservation for flight 35011";
        reservationInterpreter.interpret(reservationQuery);
    }
}