package by.epam.aggregetion03.entity;

import java.util.Objects;

public class State{
   private String cityName;
   private int population;
   private double square;

    public State(){
    }

    public State(String cityName, int population, double square){
        this.cityName = cityName;
        this.population = population;
        this.square = square;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    public double getSquare(){
        return square;
    }

    public void setSquare(double square){
        this.square = square;
    }

    @Override
    public int hashCode(){
        return Objects.hash(cityName, population, square);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        State other = (State)obj;
        return Objects.equals(cityName, other.cityName) && Objects.equals(population, other.population) && Objects.equals(square, other.square);
    }

    @Override
    public String toString(){
        return "The capital name is " + cityName + ", population is " + population + " people.";
    }
}
