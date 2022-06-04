package by.epam.task04.logic;

import by.epam.task04.entity.Train;

public class SortByDestinationAndTime{
    public void sortUsualWay(Train[] trains) {
        SortByDestination sortByDestination = new SortByDestination();
        sortByDestination.sortDestination(trains);
        System.out.println();
        System.out.println("Sorting train by destinations and time");
        for(int i = 0; i < trains.length; i++) {
            for(int j = i + 1; j < trains.length; j++) {
                int compareName = trains[j].getNameOfDestination().trim().compareToIgnoreCase(trains[i].getNameOfDestination().trim());
                if(compareName == 0) {
                    if(trains[j].getTimeOfDeparture().trim().compareToIgnoreCase(trains[i].getTimeOfDeparture().trim()) < 0) {
                        Train temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
                System.out.println("The number of train: " + trains[i].getNumberOfTrain() + " // Destination: "
                        + trains[i].getNameOfDestination() + " // Arrive time: " + trains[i].getTimeOfDeparture());
            }
        }
    }
