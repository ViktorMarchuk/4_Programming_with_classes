package by.epam.task02.main;

import by.epam.task02.entity.Test02;
import by.epam.task02.view.Output;

public class Main{
    public static void main(String[] args) {
        Output output = new Output();
        Test02 test = new Test02(4, 8);

        output.printX(test.getA());
        output.printY(test.getB());
    }
}
/*
x = 4
y = 8
*/