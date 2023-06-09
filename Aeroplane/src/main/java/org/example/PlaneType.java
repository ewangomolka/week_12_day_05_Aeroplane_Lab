package org.example;

public enum PlaneType {

    BOEING("BOEING747"),
    PRIVATE("Private Jet"),
    CONCORD("Concord");


    private final String value;

    PlaneType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
