package by.epam.task10.view;

import by.epam.task10.entity.AirlineAggrigate;

public class GetListOfFlights{
    public void getList(AirlineAggrigate[] airline) {
        for(int i = 0; i < airline.length; i++) {
            System.out.println("Destination:" + airline[i].getDestination() + " // Day of Week:"
                    + airline[i].getDaysOfWeek() + " // Depature time:" + airline[i].getDepartureTime() + " // "
                    + airline[i].getAddInfoAircraft());
        }
    }
}