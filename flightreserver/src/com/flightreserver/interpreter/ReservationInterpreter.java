package com.flightreserver.interpreter;

import com.flightreserver.mediator.FlightMediator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservationInterpreter implements QueryInterpreter {
    private final FlightMediator mediator;

    public ReservationInterpreter(FlightMediator mediator) {
        this.mediator = mediator;
    }

    public void interpret(String query) {
        System.out.println("Interpreting reservation query: " + query);
        StringBuilder numbersOnly = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+"); // Match one or more digits

        Matcher matcher = pattern.matcher(query);
        while (matcher.find()) {
            numbersOnly.append(matcher.group());
        }

        mediator.makeReservation(Long.parseLong(numbersOnly.toString()));
    }
}
