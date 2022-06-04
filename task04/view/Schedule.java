package by.epam.task04.view;

import by.epam.task04.entity.Train;

public class Schedule{
    public void getSchedule(Train[] trains) {
        System.out.println("Schedule of trains");
        for (Train train : trains) {
            System.out.println("The number of train: " + train.getNumberOfTrain() + " // Destination: "
                    + train.getNameOfDestination() + " //  Arrive time: " + train.getTimeOfDeparture());
        }
    }
}

