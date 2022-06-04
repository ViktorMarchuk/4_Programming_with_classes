package by.epam.aggregetion02.logic;

public class ChangeWheel {
    public void checkWheel(double treadHeight){
        System.out.println("Сheck the tire tread");
        if(treadHeight < 3.3){
            System.out.println("You need change tire");
        } else {
            System.out.println("The tire is all right");
        }
    }
}
