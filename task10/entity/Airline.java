package by.epam.task10.entity;

import java.util.Objects;

public class Airline{
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private double departureTime;
    private String daysOfWeek;

    public Airline() {

    }

    public Airline(String destination, int flightNumber, String aircraftType, double departureTime, String daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircraftType, daysOfWeek, departureTime, destination, flightNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Airline other = (Airline) obj;
        return Objects.equals(aircraftType, other.aircraftType) && Objects.equals(daysOfWeek, other.daysOfWeek)
                && Double.doubleToLongBits(departureTime) == Double.doubleToLongBits(other.departureTime)
                && Objects.equals(destination, other.destination) && flightNumber == other.flightNumber;
    }

    @Override
    public String toString() {
        return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
                + aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + daysOfWeek + "]";
    }
}
