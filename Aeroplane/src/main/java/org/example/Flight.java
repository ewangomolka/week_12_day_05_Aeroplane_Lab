package org.example;

import java.util.ArrayList;

public class Flight{
    private ArrayList<Passenger> passengers;
    private ArrayList<Crew> crewMembers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departure;
    private double deptTime;

    public Flight(ArrayList<Passenger> passengers, ArrayList<Crew> crewMembers, Plane plane, String flightNo, String destination,
                  String departure, double deptTime) {
        this.passengers = passengers;
        this.crewMembers = crewMembers;
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.deptTime = deptTime;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public int getVacantSeats() {
        int vacantSeats = this.plane.getCapacity() - getNumberOfPassengers();
        return vacantSeats;
    }

    public void addPassenger(Passenger passenger) {
        if (getNumberOfPassengers() < this.plane.getCapacity()){
            this.passengers.add(passenger);
        }
    }
}
