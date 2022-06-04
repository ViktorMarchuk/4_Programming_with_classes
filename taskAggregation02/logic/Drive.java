package by.epam.aggregetion02.logic;

public class Drive {
    public void drivePermeation(String weather){
        System.out.println("Check the weather");
        if(weather.equalsIgnoreCase("ice")){
            System.out.println("Be careful, ice on the road");
        }
        if(weather.equalsIgnoreCase("sunny")){
            System.out.println("You can drive");
        }
    }
}
