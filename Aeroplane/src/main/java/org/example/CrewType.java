package org.example;

public enum CrewType {

    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    FLIGHT_ATTENDANT("Flight Attendant"),
    PILOT("Pilot");


    private final String value;

    CrewType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
