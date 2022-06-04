package by.epam.aggregetion03.entity;

import java.util.Objects;

public class Region extends State{

    private String regionName;

    public final int REGIONS_QUANTITY = 6;

    public Region(){

    }

    public Region(String regionName, String cityName, double square, int population){
        super(cityName, population, square);
        this.regionName = regionName;
    }

    public String getRegionName(){
        return regionName;
    }

    public void setRegionName(String regionName){
        this.regionName = regionName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(regionName);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Region)) return false;
        if(!super.equals(o)) return false;
        Region region = (Region)o;
        return getRegionName().equals(region.getRegionName());
    }

    @Override
    public String toString(){
        return "Region{" + "regionName='" + regionName + '\'' + '}';
    }
}