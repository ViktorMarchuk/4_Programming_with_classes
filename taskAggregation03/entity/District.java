package by.epam.aggregetion03.entity;

import java.util.Objects;

public class District extends State{
    private String districtName;

    public District(){
    }

    public District(String districtName, String cityName, double square, int population){
        super(cityName, population, square);
        this.districtName = districtName;

    }

    public String getDistrictName(){
        return districtName;
    }

    public void setDistrictName(String districtName){
        this.districtName = districtName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(districtName);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof District)) return false;
        if(!super.equals(o)) return false;

        District district = (District)o;

        return getDistrictName().equals(district.getDistrictName());

    }
}