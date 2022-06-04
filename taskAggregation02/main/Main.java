package by.epam.aggregetion02.main;
/*
 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 менять колесо, вывести на консоль марку автомобиля.
 */

import by.epam.aggregetion02.entity.Car;
import by.epam.aggregetion02.entity.Engine;
import by.epam.aggregetion02.entity.Wheel;
import by.epam.aggregetion02.logic.ChangeWheel;
import by.epam.aggregetion02.logic.Drive;
import by.epam.aggregetion02.logic.Refuel;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Mazda");
        Car car1 = new Engine();
        Car car2 = new Wheel();
        Refuel refuel = new Refuel();
        ChangeWheel changeWheel = new ChangeWheel();
        Drive drive = new Drive();

        System.out.println(car);
        System.out.println("_____________________________");
        refuel.checkTypeFuel(92);
        System.out.println("_____________________________");
        refuel.checkFuel(23);
        System.out.println("______________________________");
        changeWheel.checkWheel(5);
        System.out.println("______________________________");
        drive.drivePermeation("ice");

    }
}
/*
Name of the car = Mazda
_____________________________
Checking by fuel type
Incompatible type of fuel, you do not move
_____________________________
Fuel quantity check
The car can move
______________________________
Сheck the tire tread
The tire is all right
______________________________
Check the weather
Be careful, ice on the road

 */