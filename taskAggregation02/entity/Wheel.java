package by.epam.aggregetion02.entity;

import java.util.Objects;

public class Wheel extends Car{
    private double tirePressure;
    private double tireTreadHeight;

    public Wheel(){
    }

    public Wheel(double tirePressure, double tireTreadHeight){
        this.tirePressure = tirePressure;
        this.tireTreadHeight = tireTreadHeight;

    }

    public double getTirePressure(){
        return tirePressure;
    }

    public void setTirePressure(double tirePressure){
        this.tirePressure = tirePressure;
    }

    public double getTireTreadHeight(){
        return tireTreadHeight;
    }

    public void setTireTreadHeight(){
        this.tireTreadHeight = tireTreadHeight;
    }

    @Override
    public int hashCode(){
        return Objects.hash(tirePressure, tireTreadHeight);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Wheel other = (Wheel)obj;
        return Objects.equals(tirePressure, other.tirePressure) && Objects.equals(tireTreadHeight, other.tireTreadHeight);
    }

    @Override
    public String toString(){
        return "Wheel[tirePressure = " + tirePressure + " tireTreadHeight = " + tireTreadHeight + "]";
    }
}
