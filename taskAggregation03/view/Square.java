package by.epam.aggregetion03.view;

import by.epam.aggregetion03.entity.Region;

public class Square{
    public void getSquare(Region[] regions){
        System.out.println("Regions square");
        for(Region region: regions){
            System.out.println("The square of " + region.getRegionName() + " is " + region.getSquare() + " km2");
        }
    }
}
