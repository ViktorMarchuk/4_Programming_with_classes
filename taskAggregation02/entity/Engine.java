package by.epam.aggregetion02.entity;

import java.util.Objects;

public class Engine extends Car{
    private double fuelQuantity;
    private int fuelType;

    public Engine(){

    }

    public Engine(double fuelQuantity, int fuelType){
        this.fuelQuantity = fuelQuantity;
        this.fuelType = fuelType;
    }

    public double getFuelQuantity(){
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity){
        this.fuelQuantity = fuelQuantity;
    }

    public int getFuelType(){
        return fuelType;
    }

    public void setFuelType(int fuelType){
        this.fuelType = fuelType;
    }

    @Override
    public int hashCode(){
        return Objects.hash(fuelQuantity, fuelType);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Engine other = (Engine)obj;
        return Objects.equals(fuelQuantity, other.fuelQuantity) && Objects.equals(fuelType, other.fuelType);
    }

    @Override
    public String toString(){
        return "Engine[fuelQuantity = " + fuelQuantity + " fuelType = " + fuelType + "]";
    }
}
