import airplane.Plane;
import airplane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewList;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.crewList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getPilotName(){
        return this.pilot.getName();
    }

    public PlaneType getPlaneType(){
        return this.plane.getPlaneType();
    }

    public ArrayList getPassengerList() {
        return this.passengerList;
    }

    public ArrayList getCrewList() {
        return this.crewList;
    }

    public int countPassengers() {
        return this.passengerList.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > this.countPassengers()) {
            this.passengerList.add(passenger);
        }
    }

    public int countCrew() {
        return this.crewList.size();
    }

    public void addCrew(Pilot pilot) {
        this.crewList.add(pilot);
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.countPassengers();
    }
}
