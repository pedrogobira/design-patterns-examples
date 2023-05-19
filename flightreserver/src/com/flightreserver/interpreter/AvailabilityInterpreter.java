package com.flightreserver.interpreter;

import com.flightreserver.mediator.FlightMediator;

public class AvailabilityInterpreter implements QueryInterpreter {
    private final FlightMediator mediator;

    public AvailabilityInterpreter(FlightMediator mediator) {
        this.mediator = mediator;
    }

    public void interpret(String query) {
        System.out.println("Interpreting availability query: " + query);
        mediator.getAvailability();
    }
}
