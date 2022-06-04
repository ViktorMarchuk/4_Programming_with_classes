package by.epam.task04.logic;

import by.epam.task04.entity.Train;

public class SortByDestination{
    public void sortDestination(Train[] trains) {
        System.out.println("Sorting trains by destination");

        for (int j = 0; j < trains.length; j++) {
            for (int i = j + 1; i < trains.length; i++) {
                if (trains[i].getNameOfDestination().trim()
                        .compareToIgnoreCase(trains[j].getNameOfDestination().trim()) < 0) {
                    Train temp = trains[j];
                    trains[j] = trains[i];
                    trains[i] = temp;
                }
            }
            System.out.println("The number of train: " + trains[j].getNumberOfTrain() + " // Destination: "
                    + trains[j].getNameOfDestination() + " // Arrive time: " + trains[j].getTimeOfDeparture());
        }
    }
}
