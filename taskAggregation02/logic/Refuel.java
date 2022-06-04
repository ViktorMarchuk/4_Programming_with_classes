package by.epam.aggregetion02.logic;

public class Refuel {
    public void checkFuel(double fuelLevel){
        System.out.println("Fuel quantity check");
        if(fuelLevel <= 5.0){
            System.out.println("You need tank the car");
        } else {
            System.out.println("The car can move");
        }
    }

    public void checkTypeFuel(int typeFuel){
        System.out.println("Checking by fuel type");
        if(typeFuel != 95){
            System.out.println("Incompatible type of fuel, you do not move");
        } else {
            System.out.println("The car can  move");
        }
    }
}