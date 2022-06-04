package by.epam.task04.main;
/*
   4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
   номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
   назначения должны быть упорядочены по времени отправления
 */

import by.epam.task04.entity.Train;
import by.epam.task04.logic.SortByDestination;
import by.epam.task04.logic.SortByDestinationAndTime;
import by.epam.task04.logic.SortByNumber;
import by.epam.task04.logic.SortiByTimeViaCompatrator;
import by.epam.task04.view.FindTrainByNumber;
import by.epam.task04.view.Schedule;

public class Main{
    public static void main(String[] args) {
        int quantityOfTrain = 5;
        Train[] trains = new Train[quantityOfTrain];
        trains[0] = new Train(234, "Brest", "12.38");
        trains[1] = new Train(12, "Minsk", "16.51");
        trains[2] = new Train(45, "Brest", "13.25");
        trains[3] = new Train(56, "Grodno", "18.42");
        trains[4] = new Train(23, "Pruzhany", "7.45");

        Schedule schedule = new Schedule();
        SortByNumber sortByNumber = new SortByNumber();
        SortByDestination sortByDestination = new SortByDestination();
        FindTrainByNumber findTrainByNumber = new FindTrainByNumber();
        SortiByTimeViaCompatrator sortByTime = new SortiByTimeViaCompatrator();
        SortByDestinationAndTime sortByDestinationAndTime = new SortByDestinationAndTime();

        schedule.getSchedule(trains);
        System.out.println();
        sortByNumber.sortTrain(trains);
        System.out.println();
        System.out.println("Enter the number");
        findTrainByNumber.outputTrain(trains);
        System.out.println();
        sortByDestinationAndTime.sortUsualWay(trains);
    }
}
/*
Schedule of trains
The number of train: 234 // Destination: Brest //  Arrive time: 12.38
The number of train: 12 // Destination: Minsk //  Arrive time: 16.51
The number of train: 45 // Destination: Brest //  Arrive time: 13.25
The number of train: 56 // Destination: Grodno //  Arrive time: 18.42
The number of train: 23 // Destination: Pruzhany //  Arrive time: 7.45

Sorted trains by number
The number of train: 12 // Destination: Minsk // Arrive time: 16.51
The number of train: 23 // Destination: Pruzhany // Arrive time: 7.45
The number of train: 45 // Destination: Brest // Arrive time: 13.25
The number of train: 56 // Destination: Grodno // Arrive time: 18.42
The number of train: 234 // Destination: Brest // Arrive time: 12.38

Enter the number
3
Not found the number of this train

Sorting trains by destination
The number of train: 45 // Destination: Brest // Arrive time: 13.25
The number of train: 234 // Destination: Brest // Arrive time: 12.38
The number of train: 56 // Destination: Grodno // Arrive time: 18.42
The number of train: 12 // Destination: Minsk // Arrive time: 16.51
The number of train: 23 // Destination: Pruzhany // Arrive time: 7.45

Sorting train by destinations and time
The number of train: 234 // Destination: Brest // Arrive time: 12.38
The number of train: 45 // Destination: Brest // Arrive time: 13.25
The number of train: 56 // Destination: Grodno // Arrive time: 18.42
The number of train: 12 // Destination: Minsk // Arrive time: 16.51
The number of train: 23 // Destination: Pruzhany // Arrive time: 7.45

 */