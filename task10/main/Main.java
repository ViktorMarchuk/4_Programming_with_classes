package by.epam.task10.main;
/*
 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 методами. Задать критерии выбора данных и вывести эти данные на консоль.
 Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import by.epam.task10.entity.AirlineAggrigate;
import by.epam.task10.view.FindListOfFlights;
import by.epam.task10.view.GetListOfFlights;

public class Main{
    public static void main(String[] args) {
        int numberOfAircraft = 5;
        AirlineAggrigate[] airline = new AirlineAggrigate[numberOfAircraft];
        airline[0] = new AirlineAggrigate(" Tbilisi", " Monday ", 8.34, " Flight number 234, Boing 737");
        airline[1] = new AirlineAggrigate(" Warshawa ", " Saturday ", 2.35, " Flight number 875, Airbus 1000");
        airline[2] = new AirlineAggrigate(" Barcelona ", " Friday ", 23.45, " Flight number 543, Boing 770");
        airline[3] = new AirlineAggrigate(" Milan ", " Monday ", 10.55, " Flight number 432, Boing 737");
        airline[4] = new AirlineAggrigate(" Barcelona ", " Satyrday ", 12.45, " Flight number 876, Boing 737");

        AirlineAggrigate airlineAggrigate = new AirlineAggrigate();
        GetListOfFlights getListOfFlights = new GetListOfFlights();
        FindListOfFlights findListOfFlights = new FindListOfFlights();

        getListOfFlights.getList(airline);
        System.out.println();
        findListOfFlights.getDest(airline);
        System.out.println();
        findListOfFlights.getDay(airline);
        System.out.println();
        findListOfFlights.getFlightByTime(airline);

    }
}
/*
Destination: Tbilisi // Day of Week: Monday  // Departure time:8.34 //  Flight number 234, Boing 737
Destination: Warshawa  // Day of Week: Saturday  // Departure time:2.35 //  Flight number 875, Airbus 1000
Destination: Barcelona  // Day of Week: Friday  // Departure time:23.45 //  Flight number 543, Boing 770
Destination: Milan  // Day of Week: Monday  // Departure time:10.55 //  Flight number 432, Boing 737
Destination: Barcelona  // Day of Week: Saturday  // Departure time:12.45 //  Flight number 876, Boing 737

List of flights for a given destination
Enter destination
tb
Destination: Tbilisi // Day of Week: Monday  // Departure time:8.34 //  Flight number 234, Boing 737

List of flights for a given day of the week
Enter day
fr
Destination: Barcelona  // Day of Week: Friday  // Departure time:23.45 //  Flight number 543, Boing 770

List of flights for a given day of the week, the departure time for which is longer than the specified one
Enter day
sat
Enter time
5
Destination: Barcelona  // Day of Week: Saturday  // Departure time:12.45 //  Flight number 876, Boing 737

 */