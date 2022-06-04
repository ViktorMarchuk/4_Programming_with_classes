package by.epam.aggregetion02.entity;

import java.util.Objects;

public class Car{
    private String nameOfCar = "";

    public Car(){

    }

    public Car(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }

    public String getNameOfCar(){
        return nameOfCar;

    }

    public void setNameOfCar(String nameOfCar){
        this.nameOfCar = nameOfCar;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nameOfCar);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Car other = (Car)obj;

        return Objects.equals(nameOfCar, other.nameOfCar);
    }

    @Override
    public String toString(){
        return "Name of the car = " + nameOfCar;
    }
}