package by.epam.task01.logic;

public class Calculate{
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getHighestValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

