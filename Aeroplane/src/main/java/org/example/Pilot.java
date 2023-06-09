package org.example;

public class Pilot extends Crew{

    private String licenceNumber;
    public Pilot(String name, CrewType crewType, String licenceNumber) {
        super(name, crewType);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane() {
        return "YeeHaw";
    }
}
