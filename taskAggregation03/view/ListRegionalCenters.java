package by.epam.aggregetion03.view;

import by.epam.aggregetion03.entity.Region;

public class ListRegionalCenters{
    public void getRegions(Region[] regions){
        System.out.println("List of regional centers");
        for(Region region: regions)
            System.out.println(region.getCityName());
        }
    }
