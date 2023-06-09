import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Pilot pilot;
    Plane plane;
    Crew crew;
    CrewType crewType;
    ArrayList<Passenger> passengers = new ArrayList<>();
    ArrayList<Crew> crewMembers = new ArrayList<>();
    @Before
    public void before(){
        passenger = new Passenger("Samuel L Jackson", 2);
        passenger2 = new Passenger("Kenen Thompson", 3);
        passengers.add(passenger);
        crew = new Crew("Elsa Pataky", crewType.FLIGHT_ATTENDANT);
        pilot = new Pilot("David Koechner", crewType.PILOT, "DK69420");
        crewMembers.add(crew);
        crewMembers.add(pilot);
        plane = new Plane(PlaneType.CONCORD, 1000.00, 20);
        flight = new Flight(passengers, crewMembers, plane, "Sn4k3s0nAPl4n3", "LAX",
                "HNL", 15.00);
    }

    @Test
    public void planeHasPassengers(){
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void planeCanAddPassengers(){
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getNumberOfPassengers());
    }

    @Test
    public void pilotCanFlyThePlane(){
        assertEquals("YeeHaw", pilot.flyPlane());
    }

    @Test
    public void crewMemberCanRelayMessage(){
        assertEquals("Coffee, Tea or me, me, me", crew.relayMessage());
    }

    @Test
    public void planeCanReturnVacantSeats(){
        assertEquals(19, flight.getVacantSeats());
    }

    @Test
    public void planeCannotAddMorePassengers(){
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger2);
        assertEquals(20, flight.getNumberOfPassengers());
    }
}
