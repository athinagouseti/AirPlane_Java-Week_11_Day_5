import airplane.Plane;
import airplane.PlaneType;
import org.junit.Before;
import org.junit.Test;
import staff.CabinCrewRank;
import staff.Pilot;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        pilot = new Pilot("Steve", CabinCrewRank.CAPTAIN, "CODECLAN");
        passenger1 = new Passenger("Craig", 2);
        passenger2 = new Passenger("Jen", 2);
        passenger2 = new Passenger("Stan", 2);
        plane = new Plane(PlaneType.HELICOPTER);
        flight = new Flight(pilot, plane, "FN123", "LON", "GLA", "12:00");
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Steve", flight.getPilotName());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.HELICOPTER, flight.getPlaneType());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("FN123", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("LON", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void flightPassengerListIsEmpty(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void flightCanAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void flightCannotAddPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.countPassengers());
    }

    @Test
    public void flightHasCrew(){
        flight.addCrew(pilot);
        assertEquals(1, flight.countCrew());
    }

    @Test
    public void returnsAvailableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.availableSeats());
    }

}
