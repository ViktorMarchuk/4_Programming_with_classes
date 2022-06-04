package by.epam.task04.logic;

import by.epam.task04.entity.Train;

public class SortByNumber{
    public void sortTrain(Train[] trains) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getNumberOfTrain() > trains[i + 1].getNumberOfTrain()) {
                    Train temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Sorted trains by number");
        for (int j = 0; j < trains.length; j++) {
            System.out.println("The number of train: " + trains[j].getNumberOfTrain() + " // Destination: "
                    + trains[j].getNameOfDestination() + " // Arrive time: " + trains[j].getTimeOfDeparture());
        }
    }
}

